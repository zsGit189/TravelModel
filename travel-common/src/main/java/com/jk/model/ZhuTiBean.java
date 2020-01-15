package com.jk.model;

/**
 * @ClassName: ZhuTiBean
 * @Author: zs
 * @Description: java类作用描述
 * @CreateDate: 2020/01/10
 * @Version: 1.0
 */
public class ZhuTiBean {

    private Integer zhitiId;
    private String zhuTiName;

    @Override
    public String toString() {
        return "ZhuTiBean{" +
                "zhitiId=" + zhitiId +
                ", zhuTiName='" + zhuTiName + '\'' +
                '}';
    }

    public Integer getZhitiId() {
        return zhitiId;
    }

    public void setZhitiId(Integer zhitiId) {
        this.zhitiId = zhitiId;
    }

    public String getZhuTiName() {
        return zhuTiName;
    }

    public void setZhuTiName(String zhuTiName) {
        this.zhuTiName = zhuTiName;
    }

}
