package com.aowin.service.impl;

import com.aowin.Exception.MyException;
import com.aowin.dao.BicycleCatagoryMapper;
import com.aowin.pojo.BicycleCatagory;
import com.aowin.service.BicycleCatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BicycleCatagoryServiceImpl implements BicycleCatagoryService {
    @Autowired
    BicycleCatagoryMapper bicycleCatagoryMapper;


    @Override
    public List<BicycleCatagory> findAllBicycleCatagory() {
        return bicycleCatagoryMapper.findAllBicycleCatagories();
    }

    @Transactional
    @Override
    public String insertBicycleCatagory(BicycleCatagory bicycleCatagory) throws Exception{
        List<BicycleCatagory> bicycleCatagories = bicycleCatagoryMapper.findBicycleCatagoriesByCatagoryName(bicycleCatagory.getCatagoryName());
        if (bicycleCatagories.size()>0){
            throw new MyException("车类型重名");
        }
        bicycleCatagoryMapper.insertBicycleCatagory(bicycleCatagory);
        return "success";
    }

    @Transactional
    @Override
    public String updateBicycleCatagory(BicycleCatagory bicycleCatagory) throws Exception{
        List<BicycleCatagory> bicycleCatagories = bicycleCatagoryMapper.findBicycleCatagoriesByCatagoryName(bicycleCatagory.getCatagoryName());
        if (bicycleCatagories.size()>1){
            throw new MyException("车类型重名");
        }
        bicycleCatagoryMapper.updateBicycleCatagory(bicycleCatagory);
        return "success";
    }

    @Transactional
    @Override
    public String deleteBicycleCatagoryById(Integer catagoryId) {
        bicycleCatagoryMapper.deleteBicycleCatagoryByCatagoryId(catagoryId);
        return "success";
    }

    @Override
    public BicycleCatagory findBicycleCatagoryById(Integer catagoryId) {
        return bicycleCatagoryMapper.findBicycleCatagoryById(catagoryId);
    }

    @Override
    public List<BicycleCatagory> findBicycleCatagorieByCatagoryName(String catagoryName) {
        return bicycleCatagoryMapper.findBicycleCatagoriesByCatagoryName(catagoryName);
    }
}
