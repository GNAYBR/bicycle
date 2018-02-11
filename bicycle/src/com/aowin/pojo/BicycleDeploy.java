package com.aowin.pojo;

/*
* BICYCLE_DEPLOY
* 车辆调配明细 实体
* */
public class BicycleDeploy {
    private Integer deployId;
    private Integer bicycleId;
    private Integer fromPileId;
    private Integer toPileId;
    private Integer fromCardId;
    private String fromTime;
    private Integer toCardId;
    private String toTime;
    private String toReason;
    private String fromReason;
    private String remark;
    private String status;

    @Override
    public String toString() {
        return "BicycleDeploy{" +
                "deployId=" + deployId +
                ", bicycleId=" + bicycleId +
                ", fromPileId=" + fromPileId +
                ", toPileId=" + toPileId +
                ", fromCardId=" + fromCardId +
                ", fromTime='" + fromTime + '\'' +
                ", toCardId=" + toCardId +
                ", toTime='" + toTime + '\'' +
                ", toReason='" + toReason + '\'' +
                ", fromReason='" + fromReason + '\'' +
                ", remark='" + remark + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Integer getDeployId() {
        return deployId;
    }

    public void setDeployId(Integer deployId) {
        this.deployId = deployId;
    }

    public Integer getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(Integer bicycleId) {
        this.bicycleId = bicycleId;
    }

    public Integer getFromPileId() {
        return fromPileId;
    }

    public void setFromPileId(Integer fromPileId) {
        this.fromPileId = fromPileId;
    }

    public Integer getToPileId() {
        return toPileId;
    }

    public void setToPileId(Integer toPileId) {
        this.toPileId = toPileId;
    }

    public Integer getFromCardId() {
        return fromCardId;
    }

    public void setFromCardId(Integer fromCardId) {
        this.fromCardId = fromCardId;
    }

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public Integer getToCardId() {
        return toCardId;
    }

    public void setToCardId(Integer toCardId) {
        this.toCardId = toCardId;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public String getToReason() {
        return toReason;
    }

    public void setToReason(String toReason) {
        this.toReason = toReason;
    }

    public String getFromReason() {
        return fromReason;
    }

    public void setFromReason(String fromReason) {
        this.fromReason = fromReason;
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
