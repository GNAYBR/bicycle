package com.aowin.pojo;

/*
* BICYCLE_DEAL
* 业务流水表 实体
* */
public class BicycleDeal {
    private Integer dealId;
    private String createTime;
    private String dealName;
    private String dealType;
    private Integer recordId;
    private Integer cardId;
    private String isFee;
    private Double chgMoney;
    private Integer feeType;
    private Integer bicycleId;
    private Integer pileId;
    private Integer userId;

    @Override
    public String toString() {
        return "BicycleDeal{" +
                "dealId=" + dealId +
                ", createTime='" + createTime + '\'' +
                ", dealName='" + dealName + '\'' +
                ", dealType='" + dealType + '\'' +
                ", recordId=" + recordId +
                ", cardId=" + cardId +
                ", isFee='" + isFee + '\'' +
                ", chgMoney=" + chgMoney +
                ", feeType=" + feeType +
                ", bicycleId=" + bicycleId +
                ", pileId=" + pileId +
                ", userId=" + userId +
                '}';
    }

    public Integer getDealId() {
        return dealId;
    }

    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getIsFee() {
        return isFee;
    }

    public void setIsFee(String isFee) {
        this.isFee = isFee;
    }

    public Double getChgMoney() {
        return chgMoney;
    }

    public void setChgMoney(Double chgMoney) {
        this.chgMoney = chgMoney;
    }

    public Integer getFeeType() {
        return feeType;
    }

    public void setFeeType(Integer feeType) {
        this.feeType = feeType;
    }

    public Integer getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(Integer bicycleId) {
        this.bicycleId = bicycleId;
    }

    public Integer getPileId() {
        return pileId;
    }

    public void setPileId(Integer pileId) {
        this.pileId = pileId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
