package com.aowin.service;

import com.aowin.pojo.Msphase;
import com.aowin.pojo.SyRole;

import java.util.List;

public interface MsphaseService {
    String insertMsphase(Msphase msphase);
    String deleteMsphaseByPhaseid(Integer phaseid);
    String updateMsphase(Msphase msphase);
    List<Msphase> findAllMsphase();
    List<Msphase> findMsphaseByDescription(String description);
    Msphase findMsphaseByPhaseId(Integer phaseId);
    List<Msphase> findMsphasesBySyRole(SyRole syRole);
}
