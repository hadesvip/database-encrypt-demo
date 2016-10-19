package com.domain;

/**
 * 用户信息
 * Created by wangyong on 16-10-19.
 */
public class User {

    /**
     * 用户编号
     */
    private long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPwd;

    /**
     * 用户描述
     */
    private String userDesc;

    /**
     * 用户邮箱
     */
    private String userEmail;

    public long getUserId() {
        return userId;
    }

    public User setUserId(long userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public User setUserPwd(String userPwd) {
        this.userPwd = userPwd;
        return this;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public User setUserDesc(String userDesc) {
        this.userDesc = userDesc;
        return this;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public User setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }
}
