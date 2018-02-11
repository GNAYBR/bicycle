package com.aowin.controller;


import com.aowin.Exception.MyException;
import com.aowin.pojo.BicycleCatagory;
import com.aowin.pojo.SyUser;
import com.aowin.pojo.VO.BicycleOrderVo;
import com.aowin.pojo.Vender;
import com.aowin.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BicyclePurchaseController {
    @Autowired
    SyUserService syUserServiceImpl;
    @Autowired
    SyRoleService syRoleServiceImpl;
    @Autowired
    BicycleCatagoryService bicycleCatagoryServiceImpl;
    @Autowired
    VenderService venderServiceImpl;
    @Autowired
    BicyclePurchaseService bicyclePurchaseServiceImpl;

    @RequestMapping("/purchase/toInsert.do")
    public String purchaseToInsert(Model model) {
        List<SyUser> syUsers = syUserServiceImpl.findSyUserByRole(syRoleServiceImpl.findSyRoleByRoleId(2));
        List<BicycleCatagory> catagories = bicycleCatagoryServiceImpl.findAllBicycleCatagory();
        List<Vender> venders = venderServiceImpl.findAllVenders();
        model.addAttribute("personsInCharge", syUsers);
        model.addAttribute("venders", venders);
        model.addAttribute("catagories", catagories);
        return "/WEB-INF/jsp/bicyclePurchase/insert_purchase.jsp";
    }

    @RequestMapping("/purchase/insert.do")
    public String purchaseInsert(BicycleOrderVo bicycleOrderVo, Model model, HttpSession session) throws Exception{
        System.out.println(bicycleOrderVo);
        SyUser syUser = (SyUser)session.getAttribute("syUser");
        String status = bicyclePurchaseServiceImpl.newBicyclePurchase(bicycleOrderVo,syUser);
        if (status.equals("success")){
            return "/purchase/toInsert.do";
        }else {
           throw new MyException("采购失败!");
        }
    }
}
