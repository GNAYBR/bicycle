package com.aowin.service;

import com.aowin.pojo.Msphase;
import com.aowin.pojo.SyRole;
import com.aowin.pojo.SyUser;
import com.aowin.pojo.VO.SyRoleVo;

import java.util.List;

public interface SyRoleService {
    String insertSyRole(SyRoleVo syRoleVo);
    String deleteSyRoleByRoleId(Integer roleId);
    String updateSyRole(SyRoleVo syRoleVo);
    List<SyRole> findAllSyRole();
    SyRole findSyRoleByRoleId(Integer roleId);
    String addMsphaseToRole(SyRole syRole, Msphase msphase);
    String deleteSyPermissionByRoleIdAndPhaseId(SyRole syRole,Integer phaseId);
    SyRole findSyRoleBySyUser(SyUser syUser);
    List<SyRoleVo> findAllSyRoleVo();
    SyRoleVo findSyRoleVoByRoleId(Integer roleId);
    public List<SyRoleVo> findSyRoleVoByRolename(String rolename);
}
