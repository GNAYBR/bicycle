package com.aowin.dao;

import com.aowin.pojo.Msphase;

import java.util.List;

public interface MsphaseMapper {
    List<Msphase> findAllMsphases();
    void insertMsphase(Msphase msphase);
    void deleteMsphaseByPhaseid(Integer phaseid);
    void updateMsphase(Msphase msphase);
    List<Msphase> findMsphaseByDescription(String description);
    List<Msphase> findMsphaseByUrl(String url);
    Msphase findMsphaseByPhaseId(Integer phaseId);
}
