package com.aowin.pojo;

/*
* BICYCLE_CATAGORY
* 车辆_车辆类型 实体
* */
public class BicycleCatagory {
    private Integer catagoryId;
    private String catagoryName;
    private String frameType;
    private String tireType;
    private Double weight;
    private Double height;
    private Double length;
    private String ringType;
    private String basket;
    private String backseat;
    private String bicycleSeat;
    private String handBrake;
    private String remark;
    private Integer userId;
    private String operatorTime;

    @Override
    public String toString() {
        return "BicycleCatagory{" +
                "catagoryId=" + catagoryId +
                ", catagoryName='" + catagoryName + '\'' +
                ", frameType='" + frameType + '\'' +
                ", tireType='" + tireType + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", ringType='" + ringType + '\'' +
                ", basket='" + basket + '\'' +
                ", backseat='" + backseat + '\'' +
                ", bicycleSeat='" + bicycleSeat + '\'' +
                ", handBrake='" + handBrake + '\'' +
                ", remark='" + remark + '\'' +
                ", userId=" + userId +
                ", operatorTime='" + operatorTime + '\'' +
                '}';
    }

    public Integer getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(Integer catagoryId) {
        this.catagoryId = catagoryId;
    }

    public String getCatagoryName() {
        return catagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName;
    }

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public String getRingType() {
        return ringType;
    }

    public void setRingType(String ringType) {
        this.ringType = ringType;
    }

    public String getBasket() {
        return basket;
    }

    public void setBasket(String basket) {
        this.basket = basket;
    }

    public String getBackseat() {
        return backseat;
    }

    public void setBackseat(String backseat) {
        this.backseat = backseat;
    }

    public String getBicycleSeat() {
        return bicycleSeat;
    }

    public void setBicycleSeat(String bicycleSeat) {
        this.bicycleSeat = bicycleSeat;
    }

    public String getHandBrake() {
        return handBrake;
    }

    public void setHandBrake(String handBrake) {
        this.handBrake = handBrake;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
}
