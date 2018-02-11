package com.aowin.controller;


import com.aowin.dao.SyUserMapper;
import com.aowin.pojo.Msphase;
import com.aowin.pojo.SyRole;
import com.aowin.pojo.SyUser;
import com.aowin.service.MsphaseService;
import com.aowin.service.SyRoleService;
import com.aowin.service.SyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    SyUserService syUserServiceImpl;
    @Autowired
    SyRoleService syRoleServiceImpl;
    @Autowired
    MsphaseService msphaseServiceImpl;




    @RequestMapping("/user/logout.do")
    public String userLogout(HttpSession session){
        session.setAttribute("syUser",null);
        session.setAttribute("username",null);
        return "redirect:/";
    }

    @RequestMapping(value = "/user/login.do")
    public String userLogin(HttpSession session, SyUser syUser){
        String loginStatus = syUserServiceImpl.UserLogin(syUser);
        if (loginStatus.equals("no_such_user")){
            session.setAttribute("message","用户不存在");
            return "redirect:/";
        }else if (loginStatus.equals("wrong_password")){
            session.setAttribute("message","账户密码错误");
            return "redirect:/";
        }else if (loginStatus.equals("success")){
            syUser = syUserServiceImpl.findSyUserByLoginName(syUser.getLoginname()).get(0);
            if (!syUser.getZxbj().equals("0")){
                session.setAttribute("error","账户已注销");
                return "/WEB-INF/jsp/error.jsp";
            }
            session.setAttribute("syUser",syUser);
            session.setAttribute("username",syUser.getUsername());
            SyRole syRole = syRoleServiceImpl.findSyRoleBySyUser(syUser);
            session.setAttribute("syRole",syRole);
            session.setAttribute("msphases",msphaseServiceImpl.findMsphasesBySyRole(syRole));
            return "/WEB-INF/jsp/index.jsp";
        }
        session.setAttribute("error","未知错误");
        return "/WEB-INF/jsp/error.jsp";
    }



    @RequestMapping("/index.do")
    public String index(){
        return "/WEB-INF/jsp/index.jsp";
    }

}
