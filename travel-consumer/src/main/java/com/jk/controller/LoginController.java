package com.jk.controller;

import com.jk.model.UserLoginBean;
import com.jk.model.arr;
import com.jk.service.TravelService;
import com.jk.utils.CheckImgUtil;
import com.jk.utils.OSSClientUtil;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: LoginController
 * @Author: zs
 * @Description: 登录注册实现
 * @CreateDate: 2020/01/08
 * @Version: 1.0
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private TravelService travelService;

    /**
     * 跳转到login(登录)页面
     * @author      作者姓名
     * @param :        参数说明
     * @return: null      返回值说明
     * @exception
     * @date        2020/01/08
     */

    @GetMapping("toIndex")
    public String  toIndex(){

        return "index";
    }

    //获取图片验证码

    @GetMapping("gainImgCode")
    @ResponseBody
    public void gainImgCode (HttpServletRequest requeset, HttpServletResponse response) throws Exception {

        CheckImgUtil.checkImg(requeset,response);
    }

    //获取短信验证码
    @GetMapping("gainCodeMsg")
    @ResponseBody
    public String gainCodeMsg (String userAccount){

       return  travelService.gainCodeMsg(userAccount);
    }

    //登录
    @GetMapping("msgLogin")
    @ResponseBody
    public String msgLogin (String userAccount, String userCode, String userPass, HttpSession session){
        //验证验证码
        String checkcode = session.getAttribute("checkcode").toString();
        if(!userCode.equalsIgnoreCase(checkcode)){

            return "验证码错误";
        }
        //验证用户名
        UserLoginBean ulb =  travelService.queryUserName(userAccount);
        if(ulb == null){

            return "账号不存在";
        }
        //验证密码
        if(!userPass.equals(ulb.getUserPass())){

            return "密码错误";
        }
        session.setAttribute(session.getId(),ulb);
        return "登录成功";
    }

    //图片
    /**
     * OSS阿里云上传图片
     */
    @RequestMapping("updaloadImg")
    @ResponseBody
    public String uploadImg(MultipartFile imgg)throws IOException {
        if (imgg == null || imgg.getSize() <= 0) {
            throw new IOException("file不能为空");
        }
        OSSClientUtil ossClient=new OSSClientUtil();
        String name = ossClient.uploadImg2Oss(imgg);
        String imgUrl = ossClient.getImgUrl(name);
        String[] split = imgUrl.split("\\?");
        return split[0];
    }



    /**
     * 跳转到register(注册)页面
     * @author      作者姓名
     * @param :        参数说明
     * @return: null      返回值说明
     * @exception
     * @date        2020/01/08
     */
    @GetMapping("toRegister")
    public String  toRegister(){

        return "register";
    }

    //注册
    @PutMapping("zhuce")
    @ResponseBody
    public String zhuce (UserLoginBean ulb){
        String s =    travelService.zhuce(ulb);
        System.out.println(s);
        return s;
    }





    //跳转主界面
    @GetMapping("toTest")
    public String toTest (){

        return "home/test";
    }






    //阿里云
    @GetMapping("toALiYun")
    public String  toALiYun(){

        return "test/aLiYun";
    }

    @GetMapping("totestRiLi")
    public String  totestRiLi(){

        return "test/riLi";
    }


    //测试日历插件
    @GetMapping("queryTestRiLi")
    @ResponseBody
    public List<arr> queryTestRiLi (){
        List<arr> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr a = new arr();

            a.setDay("2020-01-1"+i);
            a.setPrice("300"+i);
            list.add(a);
        }
        //JSONArray array=JSONArray.fromObject(a);
        return list;
    }







}
