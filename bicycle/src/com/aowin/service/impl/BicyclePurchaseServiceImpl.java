package com.aowin.service.impl;

import com.aowin.dao.BicycleDealMapper;
import com.aowin.dao.BicycleInfoMapper;
import com.aowin.dao.BicycleOrderDetailMapper;
import com.aowin.dao.BicycleOrderMapper;
import com.aowin.pojo.*;
import com.aowin.pojo.VO.BicycleOrderVo;
import com.aowin.service.BicyclePurchaseService;
import com.aowin.util.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BicyclePurchaseServiceImpl implements BicyclePurchaseService {
    @Autowired
    BicycleOrderMapper bicycleOrderMapper;
    @Autowired
    BicycleOrderDetailMapper bicycleOrderDetailMapper;
    @Autowired
    BicycleDealMapper bicycleDealMapper;
    @Autowired
    BicycleInfoMapper bicycleInfoMapper;

    @Transactional
    @Override
    public String newBicyclePurchase(BicycleOrderVo bicycleOrderVo,SyUser syUser) {
       //TODO 校验信息

        BicycleOrder bicycleOrder = bicycleOrderVo.getBicycleOrder();
        if (bicycleOrder.getBuyDate()==null || bicycleOrder.getBuyDate().trim().equals("")){
            return "buy_date_empty";
        }


        /*获取格式化时间*/
        String nowTimeFormat = TimeUtils.getInstance().getNowTimeFormat();
        String serializationCode = TimeUtils.getInstance().getSerializationCode();
        String simpleNowDate = TimeUtils.getInstance().getSimpleNowDate();
        /*设置bicycleOrder基础信息*/
        bicycleOrder.setUserId(syUser.getUserId());
        bicycleOrder.setOperatorTime(nowTimeFormat);
        bicycleOrder.setStatus("1");//1:录入,2:确认
        bicycleOrder.setOrderCode("bo"+serializationCode);

        Integer buyNum = 0;
        for (Integer i = 0;i<bicycleOrderVo.getNum().length;i++){
            buyNum += bicycleOrderVo.getNum()[i];
        }
        bicycleOrder.setBuyNum(buyNum);

        Double buyPrice = 0.0;
        for (Integer i = 0;i<bicycleOrderVo.getPrice().length;i++){
            buyPrice += bicycleOrderVo.getPrice()[i];
        }
        bicycleOrder.setBuyPrice(buyPrice);

        bicycleOrderMapper.insertBicycleOrder(bicycleOrder);
        Integer orderId = bicycleOrder.getOrderId();//获得orderId

        //为BicycleOrder添加BicycleDeal记录
        BicycleDeal bicycleDeal = new BicycleDeal();
        bicycleDeal.setCreateTime(nowTimeFormat);
        bicycleDeal.setDealName("BICYCLE_ORDER");
        bicycleDeal.setDealType("1");
        bicycleDeal.setRecordId(orderId);
        bicycleDeal.setIsFee("0");
        bicycleDeal.setUserId(syUser.getUserId());
        bicycleDealMapper.insertBicycleDeal(bicycleDeal);


        Integer length = bicycleOrderVo.getCatagoryId().length;
        for (int i = 0;i<length;i++){

            Integer num = bicycleOrderVo.getNum()[i];


            for (int j = 0;j < num;j++){
                Integer bicycleId = bicycleOrderDetailMapper.findNextBicycleId();

                BicycleOrderDetail bicycleOrderDetail = new BicycleOrderDetail();
                bicycleOrderDetail.setOrderId(orderId);
                bicycleOrderDetail.setCatagoryId(bicycleOrderVo.getCatagoryId()[i]);
                bicycleOrderDetail.setPrice(bicycleOrderVo.getPrice()[i]);
                bicycleOrderDetail.setRemark(bicycleOrderVo.getRemark()[i]);
                bicycleOrderDetail.setCreateDate(bicycleOrderVo.getCreateDate()[i]);
                bicycleOrderDetail.setBatchNo(bicycleOrderVo.getBatchNo()[i]);
                bicycleOrderDetail.setBicycleId(bicycleId);
                bicycleOrderDetailMapper.insertBicycleOrderDetail(bicycleOrderDetail);

                BicycleInfo bicycleInfo = new BicycleInfo();
                bicycleInfo.setUserId(syUser.getUserId());
                bicycleInfo.setStatus("1");
                bicycleInfo.setOperatorTime(TimeUtils.getInstance().getNowTimeFormat());
                bicycleInfo.setBicycleId(bicycleId);
                bicycleInfo.setBicycleCode(bicycleId);
                bicycleInfoMapper.insertBicycleInfo(bicycleInfo);

                //为每条购入detail添加deal记录
                BicycleDeal bicycleDealForDetail = new BicycleDeal();
                bicycleDealForDetail.setCreateTime(nowTimeFormat);
                bicycleDealForDetail.setDealName("新车购入");
                bicycleDealForDetail.setDealType("1");
                bicycleDealForDetail.setRecordId(bicycleOrderDetail.getDetailId());
                bicycleDealForDetail.setIsFee("1");
                bicycleDealForDetail.setFeeType(2);
                bicycleDealForDetail.setChgMoney(bicycleOrderVo.getPrice()[i]);
                bicycleDealForDetail.setBicycleId(bicycleId);
                bicycleDealForDetail.setUserId(syUser.getUserId());
                bicycleDealMapper.insertBicycleDeal(bicycleDealForDetail);
            }
        }

        return "success";
    }
}
