package com.aowin.service.impl;

import com.aowin.dao.MsphaseMapper;
import com.aowin.dao.SyPermissionMapper;
import com.aowin.pojo.Msphase;
import com.aowin.pojo.SyPermission;
import com.aowin.pojo.SyRole;
import com.aowin.service.MsphaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MsphaseServiceImpl implements MsphaseService {
    @Autowired
    MsphaseMapper msphaseMapper;

    @Autowired
    SyPermissionMapper syPermissionMapper;

    @Transactional
    @Override
    public String insertMsphase(Msphase msphase) {
        List<Msphase> msphases = msphaseMapper.findMsphaseByUrl(msphase.getUrl());
        if (msphases.size()>0) {
            return "rename";
        }
        msphaseMapper.insertMsphase(msphase);
        return "success";
    }

    @Transactional
    @Override
    public String deleteMsphaseByPhaseid(Integer phaseid) {
        msphaseMapper.deleteMsphaseByPhaseid(phaseid);
        return "success";
    }

    @Transactional
    @Override
    public String updateMsphase(Msphase msphase) {
        List<Msphase> msphases = msphaseMapper.findMsphaseByUrl(msphase.getUrl());
        if (msphases.size()>1) {
            return "rename";
        }
        msphaseMapper.updateMsphase(msphase);
        return "success";
    }

    @Override
    public List<Msphase> findAllMsphase() {
        return msphaseMapper.findAllMsphases();
    }

    @Override
    public List<Msphase> findMsphaseByDescription(String description) {
        return msphaseMapper.findMsphaseByDescription(description);
    }

    @Override
    public Msphase findMsphaseByPhaseId(Integer phaseId) {
        return msphaseMapper.findMsphaseByPhaseId(phaseId);
    }

    @Override
    public List<Msphase> findMsphasesBySyRole(SyRole syRole) {
        List<SyPermission> syPermissions = syPermissionMapper.findSyPermissionByRoleId(syRole.getRoleId());
        List<Msphase> msphases = new ArrayList<>();
        for (SyPermission syPermission:syPermissions){
            msphases.add(msphaseMapper.findMsphaseByPhaseId(syPermission.getPhaseid()));
        }
        return msphases;
    }
}
