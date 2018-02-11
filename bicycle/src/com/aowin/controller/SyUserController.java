package com.aowin.controller;


import com.aowin.pojo.SyRole;
import com.aowin.pojo.SyUser;
import com.aowin.pojo.VO.PageBean;
import com.aowin.service.SyRoleService;
import com.aowin.service.SyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SyUserController {
    @Autowired
    SyUserService syUserServiceImpl;

    @Autowired
    SyRoleService syRoleServiceImpl;

    @RequestMapping("/syuser/main.do")
    public String userMain(Model model,Integer currentPage){
        PageBean userPageBean = syUserServiceImpl.findSyUserPage(currentPage);
        model.addAttribute("pageBean",userPageBean);

        List<SyRole> syRoles = syRoleServiceImpl.findAllSyRole();
        model.addAttribute("syRoles",syRoles);
        return "/WEB-INF/jsp/zzjgxx/admin_syuser.jsp";
    }

    @RequestMapping("/syuser/signOut.do")
    public String userSignOut(Integer userId,Model model){
        String status = syUserServiceImpl.signOutSyUserByUser(syUserServiceImpl.findSyUserByUserId(userId));
        if (status.equals("success")){
            return "/syuser/main.do?currentPage=1";
        }else{
            model.addAttribute("error","未知错误");
            return "/WEB-INF/jsp/error.jsp";
        }
    }

    @RequestMapping("/syuser/toUpdate.do")
    public String toUpdate(Model model,Integer userId){
        SyUser syUser = syUserServiceImpl.findSyUserByUserId(userId);
        List<SyRole> syRoles = syRoleServiceImpl.findAllSyRole();
        model.addAttribute("syUser",syUser);
        model.addAttribute("syRoles",syRoles);

        return "/WEB-INF/jsp/zzjgxx/update_syuser.jsp";
    }

    @RequestMapping("/syuser/update.do")
    public String update(Model model,SyUser syUser){
        String status = syUserServiceImpl.updateUser(syUser);
        if (status.equals("success")){
            return "/syuser/main.do?currentPage=1";
        }else{
            model.addAttribute("error","未知错误!");
            return "/WEB-INF/jsp/error.jsp";
        }
    }

    @RequestMapping("/syuser/toInsert.do")
    public String toInsert(Model model){
        List<SyRole> syRoles = syRoleServiceImpl.findAllSyRole();
        model.addAttribute("syRoles",syRoles);
        return "/WEB-INF/jsp/zzjgxx/insert_syuser.jsp";
    }

    @RequestMapping("/syuser/insert.do")
    public String insert(Model model,SyUser syUser){
        syUser.setActiveFlag(1);
        syUser.setZxbj("0");
        String status = syUserServiceImpl.insertUser(syUser);
        if (status.equals("success")){
            return "/syuser/main.do?currentPage=1";
        }else if (status.equals("rename")){
            model.addAttribute("error","登录账户重名!");
            return "/WEB-INF/jsp/error.jsp";
        }else{
            model.addAttribute("error","未知错误!");
            return "/WEB-INF/jsp/error.jsp";
        }
    }

    @RequestMapping("/syuser/find.do")
    public String find(Model model,Integer currentPage,String userName,Integer roleId){

        PageBean pageBean = syUserServiceImpl.findUsersBySyUsernameAndRoleId(currentPage,userName,roleId);
        model.addAttribute("pageBean",pageBean);
        List<SyRole> syRoles = syRoleServiceImpl.findAllSyRole();
        model.addAttribute("syRoles",syRoles);
        model.addAttribute("userName",userName);
        model.addAttribute("roleId",roleId);
        System.out.println(pageBean);
        return "/WEB-INF/jsp/zzjgxx/admin_syuser_find.jsp";
    }
}
