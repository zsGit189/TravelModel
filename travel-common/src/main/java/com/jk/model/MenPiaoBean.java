package com.jk.model;

/**
 * @ClassName: MenPiaoBean
 * @Author: zs
 * @Description: java类作用描述
 * @CreateDate: 2020/01/10
 * @Version: 1.0
 */
public class MenPiaoBean {

    private Integer menPiaoId;//门票Id
    private Integer danjiPrice;//淡季门票价格
    private Integer wangjiPrice;//忘记门票价格
    private Integer cheWang;//缆车旺季价格
    private Integer cheDan;//缆车淡季价格


    @Override
    public String toString() {
        return "MenPiaoBean{" +
                "menPiaoId=" + menPiaoId +
                ", danjiPrice=" + danjiPrice +
                ", wangjiPrice=" + wangjiPrice +
                ", cheWang=" + cheWang +
                ", cheDan=" + cheDan +
                '}';
    }

    public Integer getMenPiaoId() {
        return menPiaoId;
    }

    public void setMenPiaoId(Integer menPiaoId) {
        this.menPiaoId = menPiaoId;
    }

    public Integer getDanjiPrice() {
        return danjiPrice;
    }

    public void setDanjiPrice(Integer danjiPrice) {
        this.danjiPrice = danjiPrice;
    }

    public Integer getWangjiPrice() {
        return wangjiPrice;
    }

    public void setWangjiPrice(Integer wangjiPrice) {
        this.wangjiPrice = wangjiPrice;
    }

    public Integer getCheWang() {
        return cheWang;
    }

    public void setCheWang(Integer cheWang) {
        this.cheWang = cheWang;
    }

    public Integer getCheDan() {
        return cheDan;
    }

    public void setCheDan(Integer cheDan) {
        this.cheDan = cheDan;
    }
}
