package com.aowin.pojo;

/*
* REPAIR_RECORD
* 车辆维修记录
* */
public class RepairRecord {
    private Integer recordId;
    private Integer bicycleId;
    private String repairType;
    private String repairPart;
    private String repairResult;
    private Double fee;
    private String repairer;
    private String repairDate;
    private String remark;
    private Integer userId;
    private String operatorTime;

    @Override
    public String toString() {
        return "RepairRecord{" +
                "recordId=" + recordId +
                ", bicycleId=" + bicycleId +
                ", repairType='" + repairType + '\'' +
                ", repairPart='" + repairPart + '\'' +
                ", repairResult='" + repairResult + '\'' +
                ", fee=" + fee +
                ", repairer='" + repairer + '\'' +
                ", repairDate='" + repairDate + '\'' +
                ", remark='" + remark + '\'' +
                ", userId=" + userId +
                ", operatorTime='" + operatorTime + '\'' +
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

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public String getRepairPart() {
        return repairPart;
    }

    public void setRepairPart(String repairPart) {
        this.repairPart = repairPart;
    }

    public String getRepairResult() {
        return repairResult;
    }

    public void setRepairResult(String repairResult) {
        this.repairResult = repairResult;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getRepairer() {
        return repairer;
    }

    public void setRepairer(String repairer) {
        this.repairer = repairer;
    }

    public String getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(String repairDate) {
        this.repairDate = repairDate;
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
