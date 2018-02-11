package com.aowin.dao;

import com.aowin.pojo.BicycleStation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BicycleStationMapper {
    List<BicycleStation> findAllBicycleStations();
    BicycleStation findBicycleStationByStationId(Integer stationId);
    List<BicycleStation> findBicycleStationWithEmptyPile();
    List<BicycleStation> findStationsByNameAndAddress(@Param("stationName") String stationName, @Param("address") String address);
}
