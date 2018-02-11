package com.aowin.service.impl;

import com.aowin.dao.SyUserMapper;
import com.aowin.pojo.VO.PageBean;
import com.aowin.pojo.SyRole;
import com.aowin.pojo.SyUser;
import com.aowin.service.SyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SyUserServiceImpl implements SyUserService {
    @Autowired
    SyUserMapper syUserMapper;


    @Transactional
    @Override
    public String insertUser(SyUser syUser) {
        List<SyUser> users = syUserMapper.findSyUserByLoginName(syUser.getLoginname());
        if (users.size()>0){
            return "rename";
        }
        syUserMapper.insertSyUser(syUser);
        return "success";
    }

    @Transactional
    @Override
    public String updateUser(SyUser syUser) {
        syUserMapper.updateSyUser(syUser);
        return "success";
    }

    @Transactional
    @Override
    public String signOutSyUserByUser(SyUser syUser) {
        syUserMapper.signOutSyUserByUserId(syUser.getUserId());
        return "success";
    }

    @Override
    public SyUser findSyUserByUserId(Integer userId) {
        return syUserMapper.findSyUserByUserId(userId);
    }

    @Override
    public List<SyUser> findSyUserLoggedOut() {
        return syUserMapper.findSyUserLoggedOut();
    }

    @Override
    public List<SyUser> findSyUserByRole(SyRole syRole) {
        return syUserMapper.findSyUserByRoleId(syRole.getRoleId());
    }

    @Override
    public List<SyUser> findSyUserByLoginName(String loginName) {
        return syUserMapper.findSyUserByLoginName(loginName);
    }

    @Override
    public List<SyUser> findSyUserByUserName(String userName) {
        return syUserMapper.findSyUserByUserName(userName);
    }

    @Override
    public PageBean findSyUserPage(Integer currentPage) {
        PageBean pageBean = new PageBean();
        Integer countRows = syUserMapper.findCountRows();

        pageBean.setCurrentPage(currentPage);
        pageBean.setCountRows(countRows);
        pageBean.setPageSize(5);
        if (countRows%pageBean.getPageSize()==0){
            pageBean.setTotalPage(countRows/pageBean.getPageSize());
        }else{
            pageBean.setTotalPage(countRows/pageBean.getPageSize()+1);
        }
        pageBean.setSyUsers(syUserMapper.findSyUser((currentPage-1)*pageBean.getPageSize(),currentPage*pageBean.getPageSize()));

        return pageBean;
    }


    @Override
    public String UserLogin(SyUser syUser) {
        List<SyUser> syUsers = syUserMapper.findSyUserByLoginName(syUser.getLoginname());
        if (syUsers.size()==0){
            return "no_such_user";
        }else if (syUsers.size()>1){
            return null;
        }else if (!syUsers.get(0).getPassword().equals(syUser.getPassword())){
            return "wrong_password";
        }else if (syUsers.get(0).getPassword().equals(syUser.getPassword())){
            return "success";
        }
        return null;
    }

    @Override
    public PageBean findUsersBySyUsernameAndRoleId(Integer currentPage, String userName, Integer roleId) {
        PageBean pageBean = new PageBean();
        Integer countRows = syUserMapper.findCountRowsByUserNameAndRoleId(userName,roleId);

        pageBean.setCurrentPage(currentPage);
        pageBean.setCountRows(countRows);
        pageBean.setPageSize(5);
        if (countRows%pageBean.getPageSize()==0){
            pageBean.setTotalPage(countRows/pageBean.getPageSize());
        }else{
            pageBean.setTotalPage(countRows/pageBean.getPageSize()+1);
        }
        pageBean.setSyUsers(syUserMapper.findSyUsersByUserNameAndRoleId((currentPage-1)*pageBean.getPageSize(),currentPage*pageBean.getPageSize(),userName,roleId));

        return pageBean;
    }
}
