package com.aowin.service.impl;

import com.aowin.dao.MsphaseMapper;
import com.aowin.dao.SyPermissionMapper;
import com.aowin.dao.SyRoleMapper;
import com.aowin.pojo.Msphase;
import com.aowin.pojo.SyPermission;
import com.aowin.pojo.SyRole;
import com.aowin.pojo.SyUser;
import com.aowin.pojo.VO.SyRoleVo;
import com.aowin.service.SyRoleService;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class SyRoleServiceImpl implements SyRoleService {
    @Autowired
    SyRoleMapper syRoleMapper;

    @Autowired
    SyPermissionMapper syPermissionMapper;

    @Autowired
    MsphaseMapper msphaseMapper;

    @Transactional
    @Override
    public String insertSyRole(SyRoleVo syRoleVo) {
        List<SyRole> roles = syRoleMapper.findSyRoleByFullName(syRoleVo.getSyRole().getRoleName());
        SyRole syRole = syRoleVo.getSyRole();
        syRoleMapper.insertSyRole(syRole);
        if (roles.size()>0) {
            return "rename";
        }
        if (syRoleVo.getMsphases()!=null){
            for (Msphase msphase:syRoleVo.getMsphases()){
                if (msphase.getPhaseid()==null){
                    continue;
                }
                SyPermission syPermission = new SyPermission();
                syPermission.setRoleid(syRole.getRoleId());
                syPermission.setPhaseid(msphase.getPhaseid());
                syPermissionMapper.insertSyPermission(syPermission);
            }
        }

        return "success";
    }

    @Transactional
    @Override
    public String deleteSyRoleByRoleId(Integer roleId) {
        syRoleMapper.deleteSyRoleByRoleId(roleId);
        syPermissionMapper.deleteSyPermissionByRoleId(roleId);
        return "success";
    }


    @Transactional
    @Override
    public String updateSyRole(SyRoleVo syRoleVo) {
        List<SyRole> roles = syRoleMapper.findSyRoleByRoleName(syRoleVo.getSyRole().getRoleName());
        if (roles.size() > 1) {
            return "rename";
        }
        syRoleMapper.updateSyRole(syRoleVo.getSyRole());
        syPermissionMapper.deleteSyPermissionByRoleId(syRoleVo.getSyRole().getRoleId());

        if (syRoleVo.getMsphases() == null){
            return "success";
        }
        for (Msphase msphase : syRoleVo.getMsphases()) {
            SyPermission syPermission = new SyPermission();
            if (msphase.getPhaseid() != null) {
                syPermission.setRoleid(syRoleVo.getSyRole().getRoleId());
                syPermission.setPhaseid(msphase.getPhaseid());
                syPermissionMapper.insertSyPermission(syPermission);
            } else {
                continue;
            }

        }
        return "success";
    }

    @Override
    public List<SyRole> findAllSyRole() {
        return syRoleMapper.findAllSyRoles();
    }

    @Override
    public SyRole findSyRoleByRoleId(Integer roleId) {
        return syRoleMapper.findSyRoleByRoleId(roleId);
    }

    /*
    * 给SyRole添加权限
    * */
    @Transactional
    @Override
    public String addMsphaseToRole(SyRole syRole, Msphase msphase) {
        SyPermission syPermission = new SyPermission();
        syPermission.setPhaseid(msphase.getPhaseid());
        syPermission.setRoleid(syRole.getRoleId());
        syPermissionMapper.insertSyPermission(syPermission);
        return "success";
    }

    /*
    * 删除role的某一个权限
    * */
    @Transactional
    @Override
    public String deleteSyPermissionByRoleIdAndPhaseId(SyRole syRole, Integer phaseId) {
        syPermissionMapper.deleteSyPermissionByRoleIdAndPhaseId(syRole.getRoleId(), phaseId);
        return "success";
    }

    @Override
    public SyRole findSyRoleBySyUser(SyUser syUser) {

        return syRoleMapper.findSyRoleByRoleId(syUser.getRoleId());
    }

    @Override
    public List<SyRoleVo> findAllSyRoleVo() {
        List<SyRoleVo> syRoleVos = new ArrayList<>();
        List<SyRole> syRoles = syRoleMapper.findAllSyRoles();
        for (SyRole syRole : syRoles) {
            SyRoleVo syRoleVo = new SyRoleVo();
            syRoleVo.setSyRole(syRole);
            List<Msphase> msphases = new ArrayList<>();
            List<SyPermission> syPermissions = syPermissionMapper.findSyPermissionByRoleId(syRole.getRoleId());
            for (SyPermission syPermission : syPermissions) {
                msphases.add(msphaseMapper.findMsphaseByPhaseId(syPermission.getPhaseid()));
            }
            syRoleVo.setMsphases(msphases);
            syRoleVos.add(syRoleVo);
        }

        return syRoleVos;
    }

    @Override
    public SyRoleVo findSyRoleVoByRoleId(Integer roleId) {
        SyRoleVo syRoleVo = new SyRoleVo();
        syRoleVo.setSyRole(syRoleMapper.findSyRoleByRoleId(roleId));
        List<SyPermission> syPermissions = syPermissionMapper.findSyPermissionByRoleId(roleId);
        List<Msphase> msphases = new ArrayList<>();
        for (SyPermission syPermission : syPermissions) {
            msphases.add(msphaseMapper.findMsphaseByPhaseId(syPermission.getPhaseid()));
        }
        syRoleVo.setMsphases(msphases);
        return syRoleVo;
    }


    @Override
    public List<SyRoleVo> findSyRoleVoByRolename(String rolename) {
        List<SyRoleVo> syRoleVos = new ArrayList<>();
        List<SyRole> syRoles = syRoleMapper.findSyRoleByRoleName(rolename);
        for (SyRole syRole : syRoles) {
            SyRoleVo syRoleVo = new SyRoleVo();
            syRoleVo.setSyRole(syRole);
            List<Msphase> msphases = new ArrayList<>();
            List<SyPermission> syPermissions = syPermissionMapper.findSyPermissionByRoleId(syRole.getRoleId());
            for (SyPermission syPermission : syPermissions) {
                msphases.add(msphaseMapper.findMsphaseByPhaseId(syPermission.getPhaseid()));
            }
            syRoleVo.setMsphases(msphases);
            syRoleVos.add(syRoleVo);
        }

        return syRoleVos;
    }
}
