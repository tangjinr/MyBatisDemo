package com.tangz.mybatisdemo;

import org.apache.ibatis.annotations.Select;

/**
 * Author: tangzhen
 * Package: com.tangz.mybatisdemo
 * Name: GetUserInfo
 * Date: 2017/5/31
 * Time: 21:23
 */

public interface GetUserInfoAnnotation {

    @Select("select * from user_t where id = #{id}")
    public User getUser(int id);
}