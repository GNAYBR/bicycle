package com.aowin.pojo;

/*
* BYCYCLE_STATION
* 车辆_车点实体
* */
public class BicycleStation {
    private Integer stationId;
    private String stationCode;
    private String stationName;
    private Double longitude;
    private Double latitude;
    private Integer bicyclePileNum;
    private String address;
    private String personInCharge;
    private String buildTime;
    private String runTime;
    private Integer userId;
    private String createTime;
    private String remark;

    @Override
    public String toString() {
        return "BicycleStation{" +
                "stationId=" + stationId +
                ", stationCode='" + stationCode + '\'' +
                ", stationName='" + stationName + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", bicyclePileNum=" + bicyclePileNum +
                ", address='" + address + '\'' +
                ", personInCharge='" + personInCharge + '\'' +
                ", buildTime='" + buildTime + '\'' +
                ", runTime='" + runTime + '\'' +
                ", userId=" + userId +
                ", createTime='" + createTime + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getBicyclePileNum() {
        return bicyclePileNum;
    }

    public void setBicyclePileNum(Integer bicyclePileNum) {
        this.bicyclePileNum = bicyclePileNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
