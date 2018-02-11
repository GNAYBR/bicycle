package com.aowin.pojo;

/*
* BICYCLE_ORDER_DETAIL
* 车辆购入明细 实体
* */
public class BicycleOrderDetail {
    private Integer detailId;
    private Integer catagoryId;
    private Integer orderId;
    private Integer bicycleId;
    private String createDate;
    private String batchNo;
    private Double price;
    private String remark;

    public BicycleOrderDetail(){}
    @Override
    public String toString() {
        return "BicycleOrderDetailMapper{" +
                "detailId=" + detailId +
                ", catagoryId=" + catagoryId +
                ", orderId=" + orderId +
                ", bicycleId=" + bicycleId +
                ", createDate='" + createDate + '\'' +
                ", batchNo='" + batchNo + '\'' +
                ", price=" + price +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(Integer catagoryId) {
        this.catagoryId = catagoryId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(Integer bicycleId) {
        this.bicycleId = bicycleId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
