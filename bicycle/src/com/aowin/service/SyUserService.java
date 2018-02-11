package com.aowin.service;

import com.aowin.pojo.VO.PageBean;
import com.aowin.pojo.SyRole;
import com.aowin.pojo.SyUser;

import java.util.List;

public interface SyUserService {
    String insertUser(SyUser syUser);
    String updateUser(SyUser syUser);
    String signOutSyUserByUser(SyUser syUser);

    SyUser findSyUserByUserId(Integer userId);

    //List<SyUser> findSyUser(Integer begin,Integer end);

    List<SyUser> findSyUserLoggedOut();
    List<SyUser> findSyUserByRole(SyRole syRole);
    List<SyUser> findSyUserByLoginName(String loginName);
    List<SyUser> findSyUserByUserName(String userName);
    PageBean findSyUserPage(Integer currentPage);
    String UserLogin(SyUser syUser);
    PageBean findUsersBySyUsernameAndRoleId(Integer currentPage,String userName,Integer roleId);
}
