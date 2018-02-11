package com.aowin.service;

import com.aowin.pojo.BicycleOrder;
import com.aowin.pojo.BicycleOrderDetail;
import com.aowin.pojo.SyUser;
import com.aowin.pojo.VO.BicycleOrderVo;

public interface BicyclePurchaseService {
    String newBicyclePurchase(BicycleOrderVo bicycleOrderVo,SyUser syUser);
}
