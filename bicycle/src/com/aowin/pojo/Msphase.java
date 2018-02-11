package com.aowin.pojo;


/*
* MSPHASE
* 权限表实体
* */
public class Msphase {

    private Integer phaseid;
    private String url;
    private String description;

    @Override
    public String toString() {
        return "Msphase{" +
                "phaseid=" + phaseid +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getPhaseid() {
        return phaseid;
    }

    public void setPhaseid(Integer phaseid) {
        this.phaseid = phaseid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
