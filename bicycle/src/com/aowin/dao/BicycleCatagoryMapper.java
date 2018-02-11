package com.aowin.dao;

import com.aowin.pojo.BicycleCatagory;

import java.util.List;

public interface BicycleCatagoryMapper {
    void insertBicycleCatagory(BicycleCatagory bicycleCatagory);
    List<BicycleCatagory> findAllBicycleCatagories();
    void deleteBicycleCatagoryByCatagoryId(Integer catagoryId);
    void updateBicycleCatagory(BicycleCatagory bicycleCatagory);
    BicycleCatagory findBicycleCatagoryById(Integer id);
    List<BicycleCatagory> findBicycleCatagoriesByCatagoryName(String catagoryName);
}
