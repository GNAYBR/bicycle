package com.aowin.pojo;

/*
* BICYCLE_ORDER
* 车辆购入主信息 实体
* */
public class BicycleOrder {
    private Integer orderId;
    private String orderCode;
    private Integer venderId;
    private String buyDate;
    private Integer buyNum;
    private Double buyPrice;
    private String personInCharge;
    private String invoiceNo;
    private Integer userId;
    private String operatorTime;
    private String remark;
    private String status;

    @Override
    public String toString() {
        return "BicycleOrder{" +
                "orderId=" + orderId +
                ", orderCode='" + orderCode + '\'' +
                ", venderId=" + venderId +
                ", buyDate='" + buyDate + '\'' +
                ", buyNum=" + buyNum +
                ", buyPrice=" + buyPrice +
                ", personInCharge='" + personInCharge + '\'' +
                ", invoiceNo='" + invoiceNo + '\'' +
                ", userId=" + userId +
                ", operatorTime='" + operatorTime + '\'' +
                ", remark='" + remark + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Integer getVenderId() {
        return venderId;
    }

    public void setVenderId(Integer venderId) {
        this.venderId = venderId;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(String operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
