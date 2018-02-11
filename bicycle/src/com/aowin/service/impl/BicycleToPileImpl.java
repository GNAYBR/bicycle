package com.aowin.service.impl;

import com.aowin.dao.*;
import com.aowin.pojo.*;
import com.aowin.pojo.VO.PageBean;
import com.aowin.service.BicycleToPileService;
import com.aowin.util.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BicycleToPileImpl implements BicycleToPileService {

    @Autowired
    BicycleInfoMapper bicycleInfoMapper;
    @Autowired
    BicyclePileMapper bicyclePileMapper;
    @Autowired
    BicycleStationMapper bicycleStationMapper;
    @Autowired
    BicycleDealMapper bicycleDealMapper;
    @Autowired
    BicycleDeployMapper bicycleDeployMapper;
    @Autowired
    CardInfoRecordMapper cardInfoRecordMapper;

    @Override
    public List<BicycleInfo> findNewBicycles() {
        return bicycleInfoMapper.findNewBicycle();
    }

    @Override
    public BicycleInfo findBicycleInfoByBicycleCode(Integer bicycleCode) {
        return bicycleInfoMapper.findBicycleInfoByBicycleCode(bicycleCode);
    }

    @Override
    public BicycleInfo findBicycleInfoByBicycleId(Integer bicycleId) {
        return bicycleInfoMapper.findBicycleInfoByBicycleId(bicycleId);
    }



    /*
    * 车辆入桩service
    * */
    @Transactional
    @Override
    public String putBicycleInPile(Integer bicycleId, Integer pileId, SyUser syUser) {
        BicyclePile bicyclePile = bicyclePileMapper.findBicyclePileByPileId(pileId);
        BicycleInfo bicycleInfo = bicycleInfoMapper.findBicycleInfoByBicycleId(bicycleId);
        if (!bicycleInfo.getStatus().equals("1")) {
            return "alreadyInPile";
        }
        if (bicyclePile.getStatus().equals("1")) {
            return "hadBicycle";
        }
        bicycleInfoMapper.updateBicycleInfoPileId(bicycleId, pileId);
        bicycleInfoMapper.updateBicycleInfoStatusTo3(bicycleId);
        bicyclePileMapper.updatePilesStatusTo_1(pileId);
        bicyclePileMapper.updatePilesBicycle(pileId, bicycleId);

        Integer cardId = cardInfoRecordMapper.findDeployCardIdByUserId(syUser.getUserId());

        BicycleDeploy bicycleDeploy = new BicycleDeploy();
        bicycleDeploy.setBicycleId(bicycleId);
        bicycleDeploy.setToPileId(pileId);
        bicycleDeploy.setToReason("1");
        bicycleDeploy.setToTime(TimeUtils.getInstance().getNowTimeFormat());
        bicycleDeploy.setStatus("1");
        bicycleDeploy.setToCardId(cardId);
        bicycleDeployMapper.insertBicycleDeploy(bicycleDeploy);

        BicycleDeal bicycleDeal = new BicycleDeal();
        bicycleDeal.setCreateTime(TimeUtils.getInstance().getNowTimeFormat());
        bicycleDeal.setDealName("普通调入");
        bicycleDeal.setDealType("5");
        bicycleDeal.setRecordId(bicycleDeploy.getDeployId());
        bicycleDeal.setCardId(cardId);
        bicycleDeal.setIsFee("0");
        bicycleDeal.setChgMoney(0.0);
        bicycleDeal.setBicycleId(bicycleId);
        bicycleDeal.setUserId(syUser.getUserId());
        bicycleDealMapper.insertBicycleDeal(bicycleDeal);

        return "success";
    }

    @Override
    public PageBean findBicycleInfoPage(Integer currentPage) {
        PageBean pageBean = new PageBean();
        Integer countRows = bicycleInfoMapper.findCountRows();

        pageBean.setCurrentPage(currentPage);
        pageBean.setCountRows(countRows);
        pageBean.setPageSize(5);
        if (countRows%pageBean.getPageSize()==0){
            pageBean.setTotalPage(countRows/pageBean.getPageSize());
        }else{
            pageBean.setTotalPage(countRows/pageBean.getPageSize()+1);
        }
        pageBean.setBicycleInfos(bicycleInfoMapper.findBicycleInfoPage((currentPage-1)*pageBean.getPageSize(),currentPage*pageBean.getPageSize()));

        return pageBean;
    }

    @Override
    public List<BicycleStation> findStationsWithEmptyPile() {
        return bicycleStationMapper.findBicycleStationWithEmptyPile();
    }

    @Override
    public List<BicyclePile> findEmptyPileByStationId(Integer stationId) {
        return bicyclePileMapper.findEmptyBicyclePileByStationId(stationId);
    }
}
