package com.aowin.pojo;

/*
* BICYCLE_INFO
* 车辆_状态信息
* */
public class BicycleInfo {
    private Integer bicycleId;
    private Integer bicycleCode;
    private String status;
    private Integer pileId;
    private String destoryDate;
    private Integer userId;
    private String operatorTime;
    private Integer cardId;
    private String remark;

    @Override
    public String toString() {
        return "BicycleInfo{" +
                "bicycleId=" + bicycleId +
                ", bicycleCode='" + bicycleCode + '\'' +
                ", status='" + status + '\'' +
                ", pileId=" + pileId +
                ", destoryDate='" + destoryDate + '\'' +
                ", userId=" + userId +
                ", operatorTime='" + operatorTime + '\'' +
                ", cardId=" + cardId +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(Integer bicycleId) {
        this.bicycleId = bicycleId;
    }

    public Integer getBicycleCode() {
        return bicycleCode;
    }

    public void setBicycleCode(Integer bicycleCode) {
        this.bicycleCode = bicycleCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPileId() {
        return pileId;
    }

    public void setPileId(Integer pileId) {
        this.pileId = pileId;
    }

    public String getDestoryDate() {
        return destoryDate;
    }

    public void setDestoryDate(String destoryDate) {
        this.destoryDate = destoryDate;
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

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
