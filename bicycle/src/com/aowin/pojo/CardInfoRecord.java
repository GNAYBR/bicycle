package com.aowin.pojo;

/*
* CARD_INFO_RECORD
* 卡信息记录表实体
* */
public class CardInfoRecord {
    private Integer RecordId;
    private Integer cardId;
    private Integer infoType;
    private String createTime;
    private Integer userId;
    private String remark;

    @Override
    public String toString() {
        return "CardInfoRecord{" +
                "RecordId=" + RecordId +
                ", cardId=" + cardId +
                ", infoType=" + infoType +
                ", createTime='" + createTime + '\'' +
                ", userId=" + userId +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getRecordId() {
        return RecordId;
    }

    public void setRecordId(Integer recordId) {
        RecordId = recordId;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getInfoType() {
        return infoType;
    }

    public void setInfoType(Integer infoType) {
        this.infoType = infoType;
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
}
