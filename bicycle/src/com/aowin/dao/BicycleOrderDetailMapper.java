package com.aowin.dao;

import com.aowin.pojo.BicycleOrderDetail;

import java.util.List;

public interface BicycleOrderDetailMapper {
    List<BicycleOrderDetail> findBicycleOrderDetailsByOrderId(Integer orderId);
    void insertBicycleOrderDetail(BicycleOrderDetail bicycleOrderDetail);
    Integer findNextBicycleId();
}
