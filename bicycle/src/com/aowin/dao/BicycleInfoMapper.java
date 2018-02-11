package com.aowin.dao;

import com.aowin.pojo.BicycleInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BicycleInfoMapper {
    void insertBicycleInfo(BicycleInfo bicycleInfo);
    BicycleInfo findBicycleInfoByBicycleCode(Integer bicycleCode);
    List<BicycleInfo> findNewBicycle();
    void updateBicycleInfoStatusTo3(Integer bicycleId);//状态3为在桩
    void updateBicycleInfoPileId(@Param("bicycleId")Integer bicycleId,@Param("pileId")Integer pileId);
    BicycleInfo findBicycleInfoByBicycleId(Integer bicycleId);
    List<BicycleInfo> findBicycleInfoPage(@Param("begin")Integer begin,@Param("end")Integer end);
    Integer findCountRows();
}
