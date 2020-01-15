package com.jk.model;

import java.beans.Transient;

/**
 * @ClassName: UserLoginBean
 * @Author: zs
 * @Description: java类作用描述
 * @CreateDate: 2020/01/08
 * @Version: 1.0
 */
public class UserLoginBean {


    private Integer userId;
    private String userName;//用户名称
    private String userAccount;//用户账号
    private String userPass;//密码
    private String usermailbox;//邮箱
    private Integer userSex;//性别
    private String  userImg;//头像


    private String userCode;


    public String getUsermailbox() {
        return usermailbox;
    }

    public void setUsermailbox(String usermailbox) {
        this.usermailbox = usermailbox;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserCode() {
        return userCode;
    }

    @Override
    public String toString() {
        return "UserLoginBean{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userPass='" + userPass + '\'' +
                ", usermailbox='" + usermailbox + '\'' +
                ", userSex=" + userSex +
                ", userImg='" + userImg + '\'' +
                ", userCode='" + userCode + '\'' +
                '}';
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

}
