package com.aowin.dao;

import com.aowin.pojo.SyPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SyPermissionMapper {

    void insertSyPermission(SyPermission syPermission);
    void deleteSyPermissionByPermissionId(Integer permissionId);
    void deleteSyPermissionByRoleIdAndPhaseId(@Param("roleid")Integer roleId,@Param("phaseId")Integer phaseId);
    List<SyPermission> findSyPermissionByRoleId(Integer roleId);
    void deleteSyPermissionByRoleId(Integer roleId);

}
