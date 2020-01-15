package com.jk.controller;

import com.jk.model.JingDianBean;
import com.jk.model.TuanYouBean;
import com.jk.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @ClassName: TravelController
 * @Author: zs
 * @Description: 前台访问的控制层
 * @CreateDate: 2020/01/06
 * @Version: 1.0
 */
@Controller
@RequestMapping("travel")
public class TravelController {

    @Autowired
    private TravelService travelService;


    //查询团游景点
    @PostMapping("queryTravelList")
    @ResponseBody
    public HashMap<String ,Object> queryTravelList ( ){

        HashMap<String, Object> map = travelService.queryTravelList(1,5);
        Object rows = map.get("rows");
        return map;
    }


    //查询最新团游景点
    @PostMapping("queryTravelListNew")
    @ResponseBody
    public HashMap<String ,Object> queryTravelListNew ( ){
        HashMap<String, Object> map = travelService.queryTravelListNew();
        return map;
    }

    /**
     * 首页查询单个景点
     * @author      作者姓名
     * @param :        参数说明
     * @return: null      景点集合
     * @exception
     * @date        2020/01/11
     */
    @GetMapping("queryJingDIanList")
    @ResponseBody
    public  HashMap<String ,Object> queryJingDIanList(){

        return travelService.queryJingDIanList();
    }


    //跳转目的地
    @GetMapping("toMuDD")
    public String toMuDD (){

        return "muDeDi/MuDeDi";
    }


    //跳转景点详情页
    @GetMapping("toXiangQing")
    public String toXiangQing (Integer jdId, Model model){

        JingDianBean jdb =  travelService.toXiangQing(jdId);
        model.addAttribute("j",jdb);
        return "JingDian/JingdianShow";
    }





}
