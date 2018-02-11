package com.aowin.service;

import com.aowin.pojo.BicycleInfo;
import com.aowin.pojo.BicyclePile;
import com.aowin.pojo.BicycleStation;

import java.util.List;

public interface StationAndPileService {
    List<BicycleStation> findStationsByNameAndAddress(String stationName,String address);
    List<BicyclePile> findPileByStationId(Integer stationId);
    BicycleInfo findBicycleInfoByBicycleId(Integer bicycleId);
}
