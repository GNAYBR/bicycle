package com.aowin.controller;


import com.aowin.Exception.MyException;
import com.aowin.pojo.BicycleCatagory;
import com.aowin.pojo.SyUser;
import com.aowin.service.BicycleCatagoryService;
import com.aowin.util.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BicycleCatagoryController {
    @Autowired
    BicycleCatagoryService bicycleCatagoryServiceImpl;

    @RequestMapping("/bicycleCatagory/main.do")
    public String catagoryMian(Model model) {
        System.out.println(bicycleCatagoryServiceImpl.findAllBicycleCatagory());
        model.addAttribute("bicycleCatagories", bicycleCatagoryServiceImpl.findAllBicycleCatagory());
        return "/WEB-INF/jsp/bicycleCatagory/main_catagory.jsp";
    }

    @RequestMapping("/bicycleCatagory/delete.do")
    public String catagoryDelete(Model model, Integer catagoryId) {
        String status = bicycleCatagoryServiceImpl.deleteBicycleCatagoryById(catagoryId);
        if (status.equals("success")) {
            return "/bicycleCatagory/main.do";
        } else {
            model.addAttribute("error", "未知错误");
            return "/WEB-INF/jsp/error.jsp";
        }
    }

    @RequestMapping("/bicycleCatagory/toUpdate.do")
    public String catagoryToUpdate(Model model, Integer catagoryId, HttpSession session){
        BicycleCatagory bicycleCatagory = bicycleCatagoryServiceImpl.findBicycleCatagoryById(catagoryId);
        SyUser syUser = (SyUser) session.getAttribute("syUser");
        if (syUser.getUserId() != bicycleCatagory.getUserId()) {
            model.addAttribute("error", "这个类型不是你创建的哦!");
            return "/WEB-INF/jsp/error.jsp";
        }
        model.addAttribute("bicycleCatagory", bicycleCatagory);
        return "/WEB-INF/jsp/bicycleCatagory/update_catagory.jsp";
    }

    @RequestMapping("/bicycleCatagory/update.do")
    public String catagoryUpdate(Model model, BicycleCatagory bicycleCatagory) throws Exception {
        String status = bicycleCatagoryServiceImpl.updateBicycleCatagory(bicycleCatagory);
        if (status.equals("success")) {
            return "/bicycleCatagory/main.do";
        }else {
            throw new Exception("未知错误");
        }
    }

    @RequestMapping("/bicycleCatagory/toInsert.do")
    public String catagoryToInsert() {
        return "/WEB-INF/jsp/bicycleCatagory/insert_catagory.jsp";
    }

    @RequestMapping("/bicycleCatagory/insert.do")
    public String catagoryInsert(Model model, BicycleCatagory bicycleCatagory, HttpSession session) throws Exception{
        if (bicycleCatagory.getCatagoryName()==null || bicycleCatagory.getCatagoryName().trim().equals("")){
            throw new Exception("类型名为空");
        }

        SyUser syUser = (SyUser) session.getAttribute("syUser");
        bicycleCatagory.setUserId(syUser.getUserId());
        bicycleCatagory.setOperatorTime(TimeUtils.getInstance().getNowTimeFormat());
        String status = bicycleCatagoryServiceImpl.insertBicycleCatagory(bicycleCatagory);
        if (status.equals("success")) {
            return "/bicycleCatagory/main.do";
        } else {
            throw new MyException("未知错误");
        }
    }
}
