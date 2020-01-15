package com.jk.controller;

import com.jk.model.JingDianBean;
import com.jk.model.UserLoginBean;
import com.jk.service.TravelServer;
import com.jk.service.TravelServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName: TravelServerController
 * @Author: zs
 * @Description: 后台管理层
 * @CreateDate: 2020/01/06
 * @Version: 1.0
 */
@RestController
public class TravelServerController implements TravelServer {

    @Autowired
    private TravelServerService travelServerService;

    //获取验证码
    @Override
    public String gainCodeMsg(String userAccount) {

        return travelServerService.gainCodeMsg(userAccount);
    }

    @Override
    public UserLoginBean queryUserName(String userAccount) {

        return travelServerService.queryUserName(userAccount);
    }

    @Override
    public String zhuce(UserLoginBean ulb) {

        return travelServerService.zhuce(ulb);
    }

    @Override
    public HashMap<String, Object> queryTravelList(Integer page, Integer rows) {

        return travelServerService.queryTravelList(page,rows);
    }

    @Override
    public HashMap<String, Object> queryTravelListNew() {

        return travelServerService.queryTravelListNew();
    }

    @Override
    public HashMap<String, Object> queryJingDIanList() {

        return travelServerService.queryJingDIanList();
    }

    @Override
    public JingDianBean toXiangQing(Integer jdId) {

        return travelServerService.toXiangQing(jdId);
    }


}
