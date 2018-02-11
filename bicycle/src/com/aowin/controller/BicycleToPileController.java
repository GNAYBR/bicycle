package com.aowin.controller;

import com.aowin.pojo.BicyclePile;
import com.aowin.pojo.SyUser;
import com.aowin.pojo.VO.PageBean;
import com.aowin.service.BicycleToPileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BicycleToPileController {

    @Autowired
    BicycleToPileService bicycleToPileServiceImpl;

    @RequestMapping("/toPile/main.do")
    public String toPileMain(Model model, Integer currentPage) {
        PageBean pageBean = bicycleToPileServiceImpl.findBicycleInfoPage(currentPage);
        model.addAttribute("bicycleInfoPage", pageBean);
        return "/WEB-INF/jsp/bicycleToPile/main_toPile.jsp";
    }

    @RequestMapping("/toPile/chooseStation.do")
    public String findStation(Model model, Integer bicycleId) {
        model.addAttribute("stations", bicycleToPileServiceImpl.findStationsWithEmptyPile());
        model.addAttribute("bicycleId", bicycleId);
        return "/WEB-INF/jsp/bicycleToPile/chooseStation_toPile.jsp";
    }

    @RequestMapping("/toPile/choosePile.do")
    public String findPile(Model model, Integer bicycleId, Integer stationId) {
        List<BicyclePile> piles = bicycleToPileServiceImpl.findEmptyPileByStationId(stationId);
        System.out.println(bicycleId);
        model.addAttribute("piles",piles);
        model.addAttribute("bicycleId",bicycleId);
        return "/WEB-INF/jsp/bicycleToPile/choosePile_toPile.jsp";
    }

    @RequestMapping("/toPile/intoPile.do")
    public String intoPile(Model model, Integer bicycleId, Integer pileId, HttpSession session){
        System.out.println(bicycleId);
        System.out.println(pileId);
        SyUser syUser = (SyUser)session.getAttribute("syUser");
        String status = bicycleToPileServiceImpl.putBicycleInPile(bicycleId,pileId,syUser);

        if (status.equals("alreadyInPile")){
            model.addAttribute("error","该车已入桩");
            return "/WEB-INF/jsp/error.jsp";
        }else if(status.equals("hadBicycle")){
            model.addAttribute("error","手慢了,该车桩已有车");
            return "/WEB-INF/jsp/error.jsp";
        }else if (status.equals("success")){
            return "/WEB-INF/jsp/success.jsp";
        }else{
            model.addAttribute("error","未知错误");
            return "/WEB-INF/jsp/error.jsp";
        }

    }
}
