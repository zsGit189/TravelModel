package com.jk.service;

import com.jk.model.JingDianBean;
import com.jk.model.TuanYouBean;
import com.jk.model.UserLoginBean;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * @InterfaceName: TravelServer
 * @Author: zs
 * @Description: 接口作用描述
 * @CreateDate: 2020/01/06
 * @Version: 1.0
 */
public interface  TravelServer {

    @GetMapping("loginSer/gainProCodeMsg")
    String gainCodeMsg(@RequestParam("userAccount") String userAccount);

    @GetMapping("loginSer/queryUserName")
    UserLoginBean queryUserName(@RequestParam("userAccount") String userAccount);

    @PutMapping("loginSer/zhuce")
    String zhuce(@RequestBody UserLoginBean ulb);

    @PostMapping("loginSer/queryTravelList")
    HashMap<String, Object> queryTravelList(@RequestParam("page") Integer page,@RequestParam("rows") Integer  rows);

    @PostMapping("loginSer/queryTravelListNew")
    HashMap<String, Object> queryTravelListNew();

    @GetMapping("loginSer/queryJingDIanList")
    HashMap<String, Object> queryJingDIanList();


    @GetMapping("loginSer/toXiangQing")
    JingDianBean toXiangQing(@RequestParam("jdId") Integer jdId);
}
