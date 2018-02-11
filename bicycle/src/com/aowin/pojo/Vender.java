package com.aowin.pojo;


/*
* VENDER
* 供应商表实体
* */
public class Vender {
    private Integer venderId;
    private String venderCode;
    private String venderType;
    private String venderName;
    private String address;
    private String telphone;
    private String contacts;
    private String productLicense;
    private String bussinessRegistrationNo;
    private Integer registeredCapital;
    private Integer UserId;
    private String createTime;
    private String zxbj;
    private String remark;

    @Override
    public String toString() {
        return "Vender{" +
                "venderId=" + venderId +
                ", venderCode='" + venderCode + '\'' +
                ", venderType='" + venderType + '\'' +
                ", venderName='" + venderName + '\'' +
                ", address='" + address + '\'' +
                ", telphone='" + telphone + '\'' +
                ", contacts='" + contacts + '\'' +
                ", productLicense='" + productLicense + '\'' +
                ", bussinessRegistrationNo='" + bussinessRegistrationNo + '\'' +
                ", registeredCapital=" + registeredCapital +
                ", UserId=" + UserId +
                ", createTime='" + createTime + '\'' +
                ", zxbj='" + zxbj + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getVenderId() {
        return venderId;
    }

    public void setVenderId(Integer venderId) {
        this.venderId = venderId;
    }

    public String getVenderCode() {
        return venderCode;
    }

    public void setVenderCode(String venderCode) {
        this.venderCode = venderCode;
    }

    public String getVenderType() {
        return venderType;
    }

    public void setVenderType(String venderType) {
        this.venderType = venderType;
    }

    public String getVenderName() {
        return venderName;
    }

    public void setVenderName(String venderName) {
        this.venderName = venderName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getProductLicense() {
        return productLicense;
    }

    public void setProductLicense(String productLicense) {
        this.productLicense = productLicense;
    }

    public String getBussinessRegistrationNo() {
        return bussinessRegistrationNo;
    }

    public void setBussinessRegistrationNo(String bussinessRegistrationNo) {
        this.bussinessRegistrationNo = bussinessRegistrationNo;
    }

    public Integer getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(Integer registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getZxbj() {
        return zxbj;
    }

    public void setZxbj(String zxbj) {
        this.zxbj = zxbj;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
