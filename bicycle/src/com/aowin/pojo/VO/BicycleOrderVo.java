package com.aowin.pojo.VO;

import com.aowin.pojo.BicycleOrder;

import java.util.Arrays;


public class BicycleOrderVo {
    private BicycleOrder bicycleOrder;
    private Integer[] catagoryId;
    private Double[] price;
    private Integer[] num;
    private String[] remark;
    private String[] createDate;
    private String[] batchNo;

    public String[] getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String[] batchNo) {
        this.batchNo = batchNo;
    }

    public String[] getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String[] createDate) {
        this.createDate = createDate;
    }



    public String[] getRemark() {
        return remark;
    }

    public void setRemark(String[] remark) {
        this.remark = remark;
    }

    public Integer[] getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(Integer[] catagoryId) {
        this.catagoryId = catagoryId;
    }

    public Double[] getPrice() {
        return price;
    }

    public void setPrice(Double[] price) {
        this.price = price;
    }

    public Integer[] getNum() {
        return num;
    }

    public void setNum(Integer[] num) {
        this.num = num;
    }

    public BicycleOrder getBicycleOrder() {

        return bicycleOrder;
    }

    @Override
    public String toString() {
        return "BicycleOrderVo{" +
                "bicycleOrder=" + bicycleOrder +
                ", catagoryId=" + Arrays.toString(catagoryId) +
                ", price=" + Arrays.toString(price) +
                ", num=" + Arrays.toString(num) +
                ", remark=" + Arrays.toString(remark) +
                ", createDate=" + Arrays.toString(createDate) +
                ", batchNo=" + Arrays.toString(batchNo) +
                '}';
    }

    public void setBicycleOrder(BicycleOrder bicycleOrder) {

        this.bicycleOrder = bicycleOrder;
    }
}
