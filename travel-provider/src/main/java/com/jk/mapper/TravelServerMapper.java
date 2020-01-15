package com.jk.mapper;

import com.jk.model.JingDianBean;
import com.jk.model.TuanYouBean;
import com.jk.model.UserLoginBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName: TravelServerMapper
 * @Author: zs
 * @Description: 接口作用描述
 * @CreateDate: 2020/01/06
 * @Version: 1.0
 */
@Repository
public interface TravelServerMapper {

    UserLoginBean queryUserAccount(@Param("userAccount") String userAccount);

    void saveZhuce(UserLoginBean ulb);

    List<TuanYouBean> queryTravelList();

    List<JingDianBean> queryJingDIanList();

    List<TuanYouBean> queryTravelListNew();

    JingDianBean toXiangQing(@Param("jdId") Integer jdId);
}
