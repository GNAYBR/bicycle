package com.aowin.service;

import com.aowin.dao.BicycleInfoMapper;
import com.aowin.pojo.BicycleInfo;
import com.aowin.pojo.BicyclePile;
import com.aowin.pojo.BicycleStation;
import com.aowin.pojo.SyUser;
import com.aowin.pojo.VO.PageBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BicycleToPileService {
    List<BicycleInfo> findNewBicycles();
    BicycleInfo findBicycleInfoByBicycleCode(Integer bicycleCode);
    BicycleInfo findBicycleInfoByBicycleId(Integer bicycleId);
    String putBicycleInPile(Integer bicycleId, Integer pileId, SyUser syUser);
    PageBean findBicycleInfoPage(Integer currentPage);
    List<BicycleStation> findStationsWithEmptyPile();
    List<BicyclePile> findEmptyPileByStationId(Integer stationId);
}
