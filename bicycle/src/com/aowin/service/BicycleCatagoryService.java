package com.aowin.service;

import com.aowin.pojo.BicycleCatagory;

import java.util.List;

public interface BicycleCatagoryService {
    List<BicycleCatagory> findAllBicycleCatagory();
    String insertBicycleCatagory(BicycleCatagory bicycleCatagory) throws Exception;
    String updateBicycleCatagory(BicycleCatagory bicycleCatagory) throws Exception;
    String deleteBicycleCatagoryById(Integer catagoryId);
    BicycleCatagory findBicycleCatagoryById(Integer catagoryId);
    List<BicycleCatagory> findBicycleCatagorieByCatagoryName(String catagoryName);
}
