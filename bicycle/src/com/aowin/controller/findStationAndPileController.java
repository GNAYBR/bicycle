package com.aowin.controller;

import com.aowin.pojo.BicyclePile;
import com.aowin.pojo.BicycleStation;
import com.aowin.service.BicycleToPileService;
import com.aowin.service.StationAndPileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class findStationAndPileController {

    @Autowired
    StationAndPileService stationAndPileServiceImpl;

    @Autowired


    @RequestMapping("/stationAndPile/main.do")
    public String stationAndPileMain(){
        return "/WEB-INF/jsp/stationAndPile/admin_stationAndPile.jsp";
    }

    @RequestMapping("/stationAndPile/find.do")
    public String find(String stationName, String address, Model model){
        List<BicycleStation> stations = stationAndPileServiceImpl.findStationsByNameAndAddress(stationName,address);
        model.addAttribute("stations",stations);

        return "/WEB-INF/jsp/stationAndPile/find_stationAndPile.jsp";
    }

    @RequestMapping("/stationAndPile/piles.do")
    public String piles(Model model,Integer stationId){
        List<BicyclePile> piles = stationAndPileServiceImpl.findPileByStationId(stationId);
        model.addAttribute("piles",piles);
        return "/WEB-INF/jsp/stationAndPile/piles_stationAndPile.jsp";
    }

    @RequestMapping("/stationAndPile/bicycle.do")
    public String bicycle(Model model,Integer bicycleId){
        model.addAttribute("bicycle",stationAndPileServiceImpl.findBicycleInfoByBicycleId(bicycleId));
        return "/WEB-INF/jsp/stationAndPile/bicycle_stationAndPile.jsp";
    }
}
