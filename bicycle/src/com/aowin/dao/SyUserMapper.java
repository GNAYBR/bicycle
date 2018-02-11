package com.aowin.dao;

import com.aowin.pojo.SyUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SyUserMapper {

    void insertSyUser(SyUser syUser);
    void updateSyUser(SyUser syUser);
    void signOutSyUserByUserId(Integer userId);
    SyUser findSyUserByUserId(Integer userId);
    List<SyUser> findSyUser(@Param("begin")Integer begin,@Param("end")Integer end);
    List<SyUser> findSyUserLoggedOut();
    List<SyUser> findSyUserByRoleId(Integer roleId);
    List<SyUser> findSyUserByLoginName(String LoginName);
    List<SyUser> findSyUserByUserName(String userName);
    Integer findCountRows();
    List<SyUser> findSyUsersByUserNameAndRoleId(@Param("begin")Integer begin,@Param("end")Integer end,
                                                @Param("userName") String userName,@Param("roleId") Integer roleId);
    Integer findCountRowsByUserNameAndRoleId(@Param("userName") String userName,@Param("roleId") Integer roleId);
}
