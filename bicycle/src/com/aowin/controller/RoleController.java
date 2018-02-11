package com.aowin.controller;

import com.aowin.pojo.Msphase;
import com.aowin.pojo.SyRole;
import com.aowin.pojo.VO.SyRoleVo;
import com.aowin.service.MsphaseService;
import com.aowin.service.SyRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RoleController {

    @Autowired
    SyRoleService syRoleServiceImpl;

    @Autowired
    MsphaseService msphaseServiceImpl;

    @RequestMapping("/role/main.do")
    public String roleMain(Model model){
        List<SyRoleVo> syRoleVos = syRoleServiceImpl.findAllSyRoleVo();
        model.addAttribute("syRoleVos",syRoleVos);
        return "/WEB-INF/jsp/zzjgxx/admin_syrole.jsp";
    }

    @RequestMapping("/role/toUpdate.do")
    public String roleToUpdate(Model model,Integer roleId){
        SyRoleVo syRoleVo = syRoleServiceImpl.findSyRoleVoByRoleId(roleId);
        model.addAttribute("syRoleVo",syRoleVo);
        model.addAttribute("msphases",msphaseServiceImpl.findAllMsphase());
        return "/WEB-INF/jsp/zzjgxx/update_syrole.jsp";
    }

    @RequestMapping("/role/update.do")
    public String roleUpdate(SyRoleVo syRoleVo,Model model){
        if (syRoleVo.getSyRole().getRoleName()==null || syRoleVo.getSyRole().getRoleName().trim().equals("")){
            model.addAttribute("error","未知错误");
            return "/WEB-INF/jsp/error.jsp";
        }
        String status = syRoleServiceImpl.updateSyRole(syRoleVo);
        if (status.equals("rename")){
            model.addAttribute("error","角色重名");
            return "/WEB-INF/jsp/error.jsp";
        }else if (status.equals("success")){
            return "/role/main.do";
        }else {
            model.addAttribute("error","未知错误");
            return "/WEB-INF/jsp/error.jsp";
        }
    }


    @RequestMapping("/role/delete.do")
    public String roleDelete(Model model,Integer roleId){
        String status = syRoleServiceImpl.deleteSyRoleByRoleId(roleId);
        if (status.equals("success")){
            return "/role/main.do";
        }else {
            model.addAttribute("error","未知错误");
            return "/WEB-INF/jsp/error.jsp";
        }
    }

    @RequestMapping("/role/find.do")
    public String roleFind(String rolename,Model model){
        List<SyRoleVo> syRoleVos = syRoleServiceImpl.findSyRoleVoByRolename(rolename);
        model.addAttribute("syRoleVos",syRoleVos);
        return "/WEB-INF/jsp/zzjgxx/admin_syrole.jsp";
    }

    @RequestMapping("/role/toInsert.do")
    public String roleToInsert(Model model){
        List<Msphase> msphases = msphaseServiceImpl.findAllMsphase();
        model.addAttribute("msphases",msphases);

        return "/WEB-INF/jsp/zzjgxx/insert_syrole.jsp";
    }
    @RequestMapping("/role/insert.do")
    public String roleInsert(SyRoleVo syRoleVo,Model model){
        if (syRoleVo.getSyRole().getRoleName()==null || syRoleVo.getSyRole().getRoleName().trim().equals("")){
            model.addAttribute("error","角色名不可为空!");
            return "/WEB-INF/jsp/error.jsp";
        }
        String status = syRoleServiceImpl.insertSyRole(syRoleVo);
        if (status.equals("rename")){
            model.addAttribute("error","角色重名");
            return "/WEB-INF/jsp/error.jsp";
        }else if (status.equals("success")){
            return "/role/main.do";
        }else {
            model.addAttribute("error","未知错误");
            return "/WEB-INF/jsp/error.jsp";
        }

    }
}
