package com.aowin.dao;

import com.aowin.pojo.BicyclePile;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BicyclePileMapper {
    BicyclePile findBicyclePileByPileId(Integer pileId);
    void updatePilesStatusTo_1(Integer pileId);
    List<BicyclePile> findBicyclePileByStationId(Integer stationId);
    List<BicyclePile> findEmptyBicyclePileByStationId(Integer stationId);
    void updatePilesBicycle(@Param("pileId")Integer pileId,@Param("bicycleId")Integer bicycleId);
}
