package com.tangz.mybatisdemo.resultmap;

import java.util.List;

/**
 * Author: tangzhen
 * Package: com.tangz.mybatisdemo.resultmap
 * Name: User
 * Date: 2017/6/2
 * Time: 17:11
 */

public class User {

    private int id;
    private String userName;
    private String corp;
    private List<Course> courses;

    public User(Integer id, String userName, String corp) {
        this.id = id;
        this.userName = userName;
        this.corp = corp;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
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

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }
}
