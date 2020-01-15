package com.jk.model;

/**
 * @ClassName: arr
 * @Author: zs
 * @Description: java类作用描述
 * @CreateDate: 2020/01/11
 * @Version: 1.0
 */
public class arr {

    private String day;
    private String price;

    @Override
    public String toString() {
        return "arr{" +
                "day='" + day + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
