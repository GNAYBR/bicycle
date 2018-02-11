package com.aowin.pojo.VO;

import com.aowin.pojo.Msphase;
import com.aowin.pojo.SyRole;

import java.util.List;

public class SyRoleVo {
    private SyRole syRole;
    private List<Msphase> msphases;

    public SyRole getSyRole() {
        return syRole;
    }

    public void setSyRole(SyRole syRole) {
        this.syRole = syRole;
    }

    public List<Msphase> getMsphases() {
        return msphases;
    }

    public void setMsphases(List<Msphase> msphases) {
        this.msphases = msphases;
    }

    @Override
    public String toString() {
        return "SyRoleVo{" +
                "syRole=" + syRole +
                ", msphases=" + msphases +
                '}';
    }
}
