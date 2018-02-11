package com.aowin.pojo;


/*
* CARD_RECORD
* 卡费用流水实体
* */
public class CardRecord {
    private Integer recordId;
    private Integer cardId;
    private Integer feeType;
    private Double chgMonthlyMoney;
    private Double chgWalletMoney;
    private Double chgFrozenMoney;
    private String createTime;
    private Integer userId;
    private String remark;
    private Integer zxbj;

    @Override
    public String toString() {
        return "CardRecord{" +
                "recordId=" + recordId +
                ", cardId=" + cardId +
                ", feeType=" + feeType +
                ", chgMonthlyMoney=" + chgMonthlyMoney +
                ", chgWalletMoney=" + chgWalletMoney +
                ", chgFrozenMoney=" + chgFrozenMoney +
                ", createTime='" + createTime + '\'' +
                ", userId=" + userId +
                ", remark='" + remark + '\'' +
                ", zxbj=" + zxbj +
                '}';
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

    public Integer getFeeType() {
        return feeType;
    }

    public void setFeeType(Integer feeType) {
        this.feeType = feeType;
    }

    public Double getChgMonthlyMoney() {
        return chgMonthlyMoney;
    }

    public void setChgMonthlyMoney(Double chgMonthlyMoney) {
        this.chgMonthlyMoney = chgMonthlyMoney;
    }

    public Double getChgWalletMoney() {
        return chgWalletMoney;
    }

    public void setChgWalletMoney(Double chgWalletMoney) {
        this.chgWalletMoney = chgWalletMoney;
    }

    public Double getChgFrozenMoney() {
        return chgFrozenMoney;
    }

    public void setChgFrozenMoney(Double chgFrozenMoney) {
        this.chgFrozenMoney = chgFrozenMoney;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getZxbj() {
        return zxbj;
    }

    public void setZxbj(Integer zxbj) {
        this.zxbj = zxbj;
    }
}
