package com.jk.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jk.mapper.TravelServerMapper;
import com.jk.model.JingDianBean;
import com.jk.model.TuanYouBean;
import com.jk.model.UserLoginBean;
import com.jk.utils.CheckSumBuilder;
import com.jk.utils.CommonConf;
import com.jk.utils.HttpClientUtil;
import com.jk.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: TravelServerServiceImpl
 * @Author: zs
 * @Description: java类作用描述
 * @CreateDate: 2020/01/06
 * @Version: 1.0
 */
@Service
public class TravelServerServiceImpl implements TravelServerService{

    @Autowired
    private TravelServerMapper travelServerMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    //获取短信验证码
    @Override
    public String gainCodeMsg(String userAccount) {
        //1、判断手机号是否存在
        UserLoginBean ulb = travelServerMapper.queryUserAccount(userAccount);
        if(ulb != null){
            return "手机号已经注册,换个再来";
        }




//        //2、发送短信验证码
//        String url = "https://api.netease.im/sms/sendcode.action";
//        //header参数
//        HashMap<String, Object> header = new HashMap<String, Object>();
//        header.put("AppKey", "728fe4227250932c3194f52a33f38202");//开发者平台分配的appkey
//        String nonce = UUID.randomUUID().toString();
//        header.put("Nonce", nonce);//随机数（最大长度128个字符）
//        String curTime = String.valueOf(System.currentTimeMillis()/1000);
//        header.put("CurTime", curTime);//当前UTC时间戳，从1970年1月1日0点0 分0 秒开始到现在的秒数(String)
//        //SHA1(AppSecret + Nonce + CurTime)，三个参数拼接的字符串，进行SHA1哈希计算，转化成16进制字符(String，小写)
//        String appSecret = "b8b6048c326c";
//        String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce, curTime);
//        header.put("CheckSum",checkSum);
//
//
//        //body的参数
//        HashMap<String, Object> params = new HashMap<String, Object>();
//        params.put("mobile", userAccount);//手机号
//        params.put("templateid", 14839040);//模板编号(如不指定则使用配置的默认模版)
//        //验证码 999999 100000
//        long code = Math.round((Math.random()*899999+100000));
//        params.put("authCode", code);//客户自定义验证码，长度为4～10个数字
//
//        String str = HttpClientUtil.post3(url, params,header);
//
//        JSONObject obj = JSON.parseObject(str);
//        int recode = obj.getIntValue("code");
//        if(recode!=200){
//            return "验证码发送失败！";
//        }
//        String s = obj.getString("obj");

        //3、存入redis：验证码
        String  code = String.valueOf(Math.round((Math.random()*899900+100000)));//临时验证码
        System.out.println("123验证码"+code);
        String key = CommonConf.MEG_CODE+userAccount;
        stringRedisTemplate.opsForValue().set(key,code,3, TimeUnit.MINUTES);//设置3分钟过期时间

        //获取验证码的手机号存入redis
        stringRedisTemplate.opsForValue().set(CommonConf.H_PHONE,userAccount,3, TimeUnit.MINUTES);


        return "验证码发送成功！";
    }



    @Override
    public String zhuce(UserLoginBean ulb) {
        //1、判断是否和获取验证码的手机号一致
        String codePhone = stringRedisTemplate.opsForValue().get(CommonConf.H_PHONE);
        if(!codePhone.equals(ulb.getUserAccount()) ){

            return "手机号错误";
        }
        //判断验证码是否过期
        String key =  CommonConf.MEG_CODE+ulb.getUserAccount();
        Boolean flag = stringRedisTemplate.hasKey(key);
        if(flag){//已过期
            Integer count = Integer.parseInt(stringRedisTemplate.opsForValue().get(key));
            if(count<=0){

                return "验证码失效,重新获取";
            }
        }

        //判断输入的验证码是否一致
        if(!ulb.getUserCode().equals(stringRedisTemplate.opsForValue().get(key))){

            return "验证码错误";
        }

        ulb.setUserPass(Md5Util.getMd532(ulb.getUserPass()));
        travelServerMapper.saveZhuce(ulb);
        return "注册成功";
    }



    @Override
    public UserLoginBean queryUserName(String userAccount) {

        return travelServerMapper.queryUserAccount(userAccount);
    }

    @Override
    public HashMap<String, Object> queryTravelList(Integer page,Integer rows) {
        List<TuanYouBean> list = travelServerMapper.queryTravelList();
        HashMap<String, Object> map = new HashMap<>();
        map.put("rows",list);
        return map;
    }

    @Override
    public HashMap<String, Object> queryTravelListNew() {
        List<TuanYouBean> list = travelServerMapper.queryTravelListNew();
        HashMap<String, Object> map = new HashMap<>();
        map.put("rows",list);
        return map;
    }

    @Override
    public JingDianBean toXiangQing(Integer jdId) {

        return travelServerMapper.toXiangQing(jdId);
    }


    @Override
    public HashMap<String, Object> queryJingDIanList() {
        List<JingDianBean> list = travelServerMapper.queryJingDIanList();
        HashMap<String, Object> map = new HashMap<>();
        map.put("rows",list);
        return map;
    }



}
