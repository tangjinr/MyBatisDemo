package com.tangz.mybatisdemo;

/**
 * Author: tangzhen
 * Package: com.tangz.mybatisdemo
 * Name: UserOp
 * Date: 2017/6/1
 * Time: 22:43
 */

public interface UserOp {

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(int id);

    public User getUser(int id);
}
