package com.aowin.service.impl;

import com.aowin.dao.BicycleInfoMapper;
import com.aowin.dao.BicyclePileMapper;
import com.aowin.dao.BicycleStationMapper;
import com.aowin.pojo.BicycleInfo;
import com.aowin.pojo.BicyclePile;
import com.aowin.pojo.BicycleStation;
import com.aowin.service.StationAndPileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationAndPileServiceImpl implements StationAndPileService {

    @Autowired
    BicycleInfoMapper bicycleInfoMapper;
    @Autowired
    BicycleStationMapper bicycleStationMapper;
    @Autowired
    BicyclePileMapper bicyclePileMapper;

    @Override
    public List<BicycleStation> findStationsByNameAndAddress(String stationName, String address) {
        stationName = stationName.trim();
        address = address.trim();
        return bicycleStationMapper.findStationsByNameAndAddress(stationName,address);
    }

    @Override
    public List<BicyclePile> findPileByStationId(Integer stationId) {
        return bicyclePileMapper.findBicyclePileByStationId(stationId);
    }

    @Override
    public BicycleInfo findBicycleInfoByBicycleId(Integer bicycleId) {
        return bicycleInfoMapper.findBicycleInfoByBicycleId(bicycleId);
    }
}
