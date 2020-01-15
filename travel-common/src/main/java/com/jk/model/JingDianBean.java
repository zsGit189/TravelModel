package com.jk.model;

/**
 * @ClassName: JingDianBean
 * @Author: zs
 * @Description: java类作用描述
 * @CreateDate: 2020/01/10
 * @Version: 1.0
 */
public class JingDianBean {

    private Integer jdId;//景点表Id
    private String jdName;//景点名称
    private String jdEnglish;
    private String jdImg1;//图片
    private String jdImg2;//图片
    private String jdImg3;//图片
    private String jdDiZhi;//地址
    private String jdTeShe;//景点特色
    private Integer jdTuanYou;//团游Id
    private String jdInfo;//景点描述
    private Integer renqi;//人气
    private String faBuTime;//发布时间
    private String jdXingJi;//星级
    private Integer jdPrice;//门票
    private Integer  jdpriceWang;

    private Integer page;//当前页
    private Integer rows;//每页条数

    public String getJdEnglish() {
        return jdEnglish;
    }

    public void setJdEnglish(String jdEnglish) {
        this.jdEnglish = jdEnglish;
    }

    public Integer getJdpriceWang() {
        return jdpriceWang;
    }

    public void setJdpriceWang(Integer jdpriceWang) {
        this.jdpriceWang = jdpriceWang;
    }

    public Integer getJdPrice() {
        return jdPrice;
    }

    public void setJdPrice(Integer jdPrice) {
        this.jdPrice = jdPrice;
    }

    public String getJdXingJi() {
        return jdXingJi;
    }

    public void setJdXingJi(String jdXingJi) {
        this.jdXingJi = jdXingJi;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "JingDianBean{" +
                "jdId=" + jdId +
                ", jdName='" + jdName + '\'' +
                ", jdImg1='" + jdImg1 + '\'' +
                ", jdImg2='" + jdImg2 + '\'' +
                ", jdImg3='" + jdImg3 + '\'' +
                ", jdDiZhi='" + jdDiZhi + '\'' +
                ", jdTeShe='" + jdTeShe + '\'' +
                ", jdTuanYou=" + jdTuanYou +
                ", jdInfo='" + jdInfo + '\'' +
                ", renqi=" + renqi +
                ", faBuTime='" + faBuTime + '\'' +
                '}';
    }

    public Integer getJdId() {
        return jdId;
    }

    public void setJdId(Integer jdId) {
        this.jdId = jdId;
    }

    public String getJdName() {
        return jdName;
    }

    public void setJdName(String jdName) {
        this.jdName = jdName;
    }

    public String getJdImg1() {
        return jdImg1;
    }

    public void setJdImg1(String jdImg1) {
        this.jdImg1 = jdImg1;
    }

    public String getJdImg2() {
        return jdImg2;
    }

    public void setJdImg2(String jdImg2) {
        this.jdImg2 = jdImg2;
    }

    public String getJdImg3() {
        return jdImg3;
    }

    public void setJdImg3(String jdImg3) {
        this.jdImg3 = jdImg3;
    }

    public String getJdDiZhi() {
        return jdDiZhi;
    }

    public void setJdDiZhi(String jdDiZhi) {
        this.jdDiZhi = jdDiZhi;
    }

    public String getJdTeShe() {
        return jdTeShe;
    }

    public void setJdTeShe(String jdTeShe) {
        this.jdTeShe = jdTeShe;
    }

    public Integer getJdTuanYou() {
        return jdTuanYou;
    }

    public void setJdTuanYou(Integer jdTuanYou) {
        this.jdTuanYou = jdTuanYou;
    }

    public String getJdInfo() {
        return jdInfo;
    }

    public void setJdInfo(String jdInfo) {
        this.jdInfo = jdInfo;
    }

    public Integer getRenqi() {
        return renqi;
    }

    public void setRenqi(Integer renqi) {
        this.renqi = renqi;
    }

    public String getFaBuTime() {
        return faBuTime;
    }

    public void setFaBuTime(String faBuTime) {
        this.faBuTime = faBuTime;
    }
}
