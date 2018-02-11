package com.aowin.controller;

import com.aowin.dao.MsphaseMapper;
import com.aowin.pojo.Msphase;
import com.aowin.service.MsphaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MsphaseController {
    @Autowired
    MsphaseService msphaseServiceImple;

    @RequestMapping("/msphase/main.do")
    public String msphaseMain(Model model){
        List<Msphase> msphases = msphaseServiceImple.findAllMsphase();
        model.addAttribute("msphases",msphases);
        return "/WEB-INF/jsp/zzjgxx/admin_msphase.jsp";
    }

    @RequestMapping("/msphase/find.do")
    public String findMsphase(String description,Model model){

        System.out.println(description);
        List<Msphase> msphases = msphaseServiceImple.findMsphaseByDescription(description);
        model.addAttribute("msphases",msphases);
        return "/WEB-INF/jsp/zzjgxx/admin_msphase.jsp";
    }

    @RequestMapping("/msphase/toInsert.do")
    public String toInsert(){
        return "/WEB-INF/jsp/zzjgxx/insert_msphase.html";
    }


    @RequestMapping("/msphase/insert.do")
    public String insert(Model model,Msphase msphase){
        System.out.println(msphase);
        if (msphase.getUrl()==null || msphase.getUrl().trim().equals("")){
            model.addAttribute("error","未知错误");
            return "/WEB-INF/jsp/error.jsp";
        }
        String status = msphaseServiceImple.insertMsphase(msphase);

        if (status.equals("success")){
            return "/msphase/main.do";
        }else if (status.equals("rename")){
            model.addAttribute("error","权限重名");
            return "/WEB-INF/jsp/error.jsp";
        }else {
            model.addAttribute("error","未知错误");
            return "/WEB-INF/jsp/error.jsp";
        }
    }

    @RequestMapping("/msphase/delete.do")
    public String delete(Model model,Integer phaseId){
        String status = msphaseServiceImple.deleteMsphaseByPhaseid(phaseId);
        if (status.equals("success")){
            return "/msphase/main.do";
        }else {
            model.addAttribute("error","未知错误");
            return "/WEB-INF/jsp/error.jsp";
        }
    }

    @RequestMapping("/msphase/toUpdate.do")
    public String toUpdate(Model model,Integer phaseId){
        Msphase msphase = msphaseServiceImple.findMsphaseByPhaseId(phaseId);
        model.addAttribute("updateMsphase",msphase);
        return "/WEB-INF/jsp/zzjgxx/update_msphase.jsp";
    }
    @RequestMapping("/msphase/update.do")
    public String update(Model model,Msphase msphase){
        if (msphase.getUrl()==null || msphase.getUrl().trim().equals("")){
            model.addAttribute("error","未知错误");
            return "/WEB-INF/jsp/error.jsp";
        }
        String status = msphaseServiceImple.updateMsphase(msphase);
        if (status.equals("success")){
            return "/msphase/main.do";
        }else if (status.equals("rename")){
            model.addAttribute("error","权限重名");
            return "/WEB-INF/jsp/error.jsp";
        }
        model.addAttribute("error","未知错误");
        return "/WEB-INF/jsp/error.jsp";
    }
}
