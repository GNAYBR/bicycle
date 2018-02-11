package com.aowin.pojo;

/*
* Card
* 办卡信息实体
* */
public class Card {
    private Integer cardId;
    private String cardCode;
    private Integer cardType;
    private String name;
    private String idCard;
    private String sex;
    private String telphone;
    private String mobile;
    private String email;
    private String address;
    private String work;
    private String zxbj;
    private Double monthlyMoney;
    private Double frozenMoney;
    private Double walletMoney;
    private Integer status;

    @Override
    public String toString() {
        return "Card{" +
                "CardId=" + cardId +
                ", cardCode='" + cardCode + '\'' +
                ", cardType=" + cardType +
                ", name='" + name + '\'' +
                ", idCard='" + idCard + '\'' +
                ", sex='" + sex + '\'' +
                ", telphone='" + telphone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", work='" + work + '\'' +
                ", zxbj='" + zxbj + '\'' +
                ", monthlyMoney=" + monthlyMoney +
                ", frozenMoney=" + frozenMoney +
                ", walletMoney=" + walletMoney +
                ", status=" + status +
                '}';
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        cardId = cardId;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getZxbj() {
        return zxbj;
    }

    public void setZxbj(String zxbj) {
        this.zxbj = zxbj;
    }

    public Double getMonthlyMoney() {
        return monthlyMoney;
    }

    public void setMonthlyMoney(Double monthlyMoney) {
        this.monthlyMoney = monthlyMoney;
    }

    public Double getFrozenMoney() {
        return frozenMoney;
    }

    public void setFrozenMoney(Double frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    public Double getWalletMoney() {
        return walletMoney;
    }

    public void setWalletMoney(Double walletMoney) {
        this.walletMoney = walletMoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
