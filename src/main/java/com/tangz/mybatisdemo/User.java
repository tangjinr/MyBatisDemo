package com.tangz.mybatisdemo;

/**
 * Author: tangzhen
 * Package: com.tangz.mybatisdemo
 * Name: User
 * Date: 2017/5/31
 * Time: 19:03
 */

public class User {
    private int id;
    private String userName;
    private int account;

    // 参数最好不要使用简单类型如int, long等，改用对象模式Integer, Long等
    public User(Integer id, String userName, Integer account) {
        this.id = id;
        this.userName = userName;
        this.account = account;
    }

    public User(String userName, Integer account) {
        this.userName = userName;
        this.account = account;
    }

    public User() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }
}
