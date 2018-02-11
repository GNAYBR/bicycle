package com.aowin.dao;

import com.aowin.pojo.BicycleOrder;

import java.util.List;

public interface BicycleOrderMapper {
    Integer insertBicycleOrder(BicycleOrder bicycleOrder);
    List<BicycleOrder> findAllBicycleOrder();
    BicycleOrder findBicycleOrderByOrderId(Integer orderId);
}
