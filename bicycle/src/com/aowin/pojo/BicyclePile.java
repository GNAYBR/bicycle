package com.aowin.pojo;


/*BICYCLE_PILE
* 车辆_车桩实体
* */
public class BicyclePile {
    private Integer pileId;
    private Integer venderId;
    private String pileCode;
    private Integer stationId;
    private String status;
    private String installTime;
    private String disassemblyTime;
    private Integer userId;
    private String operatorTime;
    private String bicycleId;
    private String remark;

    @Override
    public String toString() {
        return "BicyclePile{" +
                "pileId=" + pileId +
                ", venderId=" + venderId +
                ", pileCode='" + pileCode + '\'' +
                ", stationId=" + stationId +
                ", status='" + status + '\'' +
                ", installTime='" + installTime + '\'' +
                ", disassemblyTime='" + disassemblyTime + '\'' +
                ", userId=" + userId +
                ", operatorTime='" + operatorTime + '\'' +
                ", bicycleId='" + bicycleId + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getPileId() {
        return pileId;
    }

    public void setPileId(Integer pileId) {
        this.pileId = pileId;
    }

    public Integer getVenderId() {
        return venderId;
    }

    public void setVenderId(Integer venderId) {
        this.venderId = venderId;
    }

    public String getPileCode() {
        return pileCode;
    }

    public void setPileCode(String pileCode) {
        this.pileCode = pileCode;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInstallTime() {
        return installTime;
    }

    public void setInstallTime(String installTime) {
        this.installTime = installTime;
    }

    public String getDisassemblyTime() {
        return disassemblyTime;
    }

    public void setDisassemblyTime(String disassemblyTime) {
        this.disassemblyTime = disassemblyTime;
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

    public String getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(String bicycleId) {
        this.bicycleId = bicycleId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
