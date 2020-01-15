package com.jk.service;

import com.jk.model.JingDianBean;
import com.jk.model.TuanYouBean;
import com.jk.model.UserLoginBean;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * @InterfaceName: TravelServerService
 * @Author: zs
 * @Description: 接口作用描述
 * @CreateDate: 2020/01/06
 * @Version: 1.0
 */
@Repository
public interface TravelServerService {

    String gainCodeMsg(String userAccount);

    UserLoginBean queryUserName(String userAccount);

    String zhuce(UserLoginBean ulb);

    HashMap<String, Object> queryTravelList(Integer page, Integer rows);

    HashMap<String, Object> queryJingDIanList();

    HashMap<String, Object> queryTravelListNew();

    JingDianBean toXiangQing(Integer jdId);
}
