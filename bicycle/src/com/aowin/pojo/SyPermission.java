package com.aowin.pojo;


/*
* SYPERMISSION
* 授权表实体
* */
public class SyPermission {
    private Integer permissionid;
    private Integer roleid;
    private Integer phaseid;


    @Override
    public String toString() {
        return "SyPermission{" +
                "permissionid=" + permissionid +
                ", roleid=" + roleid +
                ", phaseid='" + phaseid + '\'' +
                '}';
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPhaseid() {
        return phaseid;
    }

    public void setPhaseid(Integer phaseid) {
        this.phaseid = phaseid;
    }
}
