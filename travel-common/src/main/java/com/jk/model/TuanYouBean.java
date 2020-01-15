package com.jk.model;

/**
 * @ClassName: TuanYouBean
 * @Author: zs
 * @Description: java类作用描述
 * @CreateDate: 2020/01/10
 * @Version: 1.0
 */
public class TuanYouBean {

    private Integer tuanYouId;//团游Id
    private Integer jingDianId;//景点Id
    private String tuanName;//团游套餐名称
    private String liangDian;//团游亮点
    private String chuYouRiQi;//出游日期类型
    private String tuJIngJingDian;//途径地点
    private Integer youWanZhuTiId;//游玩主题Id
    private Integer baotuanprice;//团游套餐价格
    private String tianshu;//天数
    private Integer jiaoyaoxingchengId;//简要行程Id
    private String chufaRiQi;//出发日期
    private String img1;
    private Integer menpiaoId;//门票Id

    public Integer getMenpiaoId() {
        return menpiaoId;
    }

    public void setMenpiaoId(Integer menpiaoId) {
        this.menpiaoId = menpiaoId;
    }

    //临时字段
    private Integer page;//当前页
    private Integer rows;//每页条数
    private String zhuTiName;

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getChufaRiQi() {
        return chufaRiQi;
    }

    public void setChufaRiQi(String chufaRiQi) {
        this.chufaRiQi = chufaRiQi;
    }

    public String getZhuTiName() {
        return zhuTiName;
    }

    public void setZhuTiName(String zhuTiName) {
        this.zhuTiName = zhuTiName;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "TuanYouBean{" +
                "tuanYouId=" + tuanYouId +
                ", jingDianId=" + jingDianId +
                ", tuanName='" + tuanName + '\'' +
                ", liangDian='" + liangDian + '\'' +
                ", chuYouRiQi='" + chuYouRiQi + '\'' +
                ", tuJIngJingDian='" + tuJIngJingDian + '\'' +
                ", youWanZhuTiId=" + youWanZhuTiId +
                ", baotuanprice=" + baotuanprice +
                ", tianshu='" + tianshu + '\'' +
                ", jiaoyaoxingchengId=" + jiaoyaoxingchengId +
                '}';
    }

    public Integer getTuanYouId() {
        return tuanYouId;
    }

    public void setTuanYouId(Integer tuanYouId) {
        this.tuanYouId = tuanYouId;
    }

    public Integer getJingDianId() {
        return jingDianId;
    }

    public void setJingDianId(Integer jingDianId) {
        this.jingDianId = jingDianId;
    }

    public String getTuanName() {
        return tuanName;
    }

    public void setTuanName(String tuanName) {
        this.tuanName = tuanName;
    }

    public String getLiangDian() {
        return liangDian;
    }

    public void setLiangDian(String liangDian) {
        this.liangDian = liangDian;
    }

    public String getChuYouRiQi() {
        return chuYouRiQi;
    }

    public void setChuYouRiQi(String chuYouRiQi) {
        this.chuYouRiQi = chuYouRiQi;
    }

    public String getTuJIngJingDian() {
        return tuJIngJingDian;
    }

    public void setTuJIngJingDian(String tuJIngJingDian) {
        this.tuJIngJingDian = tuJIngJingDian;
    }

    public Integer getYouWanZhuTiId() {
        return youWanZhuTiId;
    }

    public void setYouWanZhuTiId(Integer youWanZhuTiId) {
        this.youWanZhuTiId = youWanZhuTiId;
    }

    public Integer getBaotuanprice() {
        return baotuanprice;
    }

    public void setBaotuanprice(Integer baotuanprice) {
        this.baotuanprice = baotuanprice;
    }

    public String getTianshu() {
        return tianshu;
    }

    public void setTianshu(String tianshu) {
        this.tianshu = tianshu;
    }

    public Integer getJiaoyaoxingchengId() {
        return jiaoyaoxingchengId;
    }

    public void setJiaoyaoxingchengId(Integer jiaoyaoxingchengId) {
        this.jiaoyaoxingchengId = jiaoyaoxingchengId;
    }
}
