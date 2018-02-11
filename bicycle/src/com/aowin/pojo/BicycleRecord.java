package com.aowin.pojo;


/*
* BICYCLE_RECORD
* 车辆_车辆租还记录
* */
public class BicycleRecord {
    private Integer recordId;
    private Integer bicycleId;
    private Integer cardId;
    private String rentTime;
    private Integer rentPileId;
    private String returnTime;
    private Integer returnPileId;
    private Double money;
    private String remark;

    @Override
    public String toString() {
        return "BicycleRecord{" +
                "recordId=" + recordId +
                ", bicycleId=" + bicycleId +
                ", cardId=" + cardId +
                ", rentTime='" + rentTime + '\'' +
                ", rentPileId=" + rentPileId +
                ", returnTime='" + returnTime + '\'' +
                ", returnPileId=" + returnPileId +
                ", money=" + money +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(Integer bicycleId) {
        this.bicycleId = bicycleId;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getRentTime() {
        return rentTime;
    }

    public void setRentTime(String rentTime) {
        this.rentTime = rentTime;
    }

    public Integer getRentPileId() {
        return rentPileId;
    }

    public void setRentPileId(Integer rentPileId) {
        this.rentPileId = rentPileId;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public Integer getReturnPileId() {
        return returnPileId;
    }

    public void setReturnPileId(Integer returnPileId) {
        this.returnPileId = returnPileId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
