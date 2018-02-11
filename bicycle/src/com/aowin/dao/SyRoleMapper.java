package com.aowin.dao;

import com.aowin.pojo.SyRole;

import java.util.List;

public interface SyRoleMapper {
    void insertSyRole(SyRole syRole);
    void deleteSyRoleByRoleId(Integer roleId);
    void updateSyRole(SyRole syRole);
    List<SyRole> findAllSyRoles();
    SyRole findSyRoleByRoleId(Integer roleId);
    List<SyRole> findSyRoleByRoleName(String roleName);
    List<SyRole> findSyRoleByFullName(String roleName);
}
