package com.aowin.pojo.VO;

import com.aowin.pojo.BicycleInfo;
import com.aowin.pojo.SyUser;

import java.util.List;

public class PageBean {
    private Integer currentPage;
    private Integer countRows;
    private Integer totalPage;
    private Integer pageSize;

    private List<SyUser> syUsers;
    private List<BicycleInfo> bicycleInfos;

    public List<BicycleInfo> getBicycleInfos() {
        return bicycleInfos;
    }

    public void setBicycleInfos(List<BicycleInfo> bicycleInfos) {
        this.bicycleInfos = bicycleInfos;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getCountRows() {
        return countRows;
    }

    public void setCountRows(Integer countRows) {
        this.countRows = countRows;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<SyUser> getSyUsers() {
        return syUsers;
    }

    public void setSyUsers(List<SyUser> syUsers) {
        this.syUsers = syUsers;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "currentPage=" + currentPage +
                ", countRows=" + countRows +
                ", totalPage=" + totalPage +
                ", pageSize=" + pageSize +
                ", syUsers=" + syUsers +
                ", bicycleInfos=" + bicycleInfos +
                '}';
    }
}
