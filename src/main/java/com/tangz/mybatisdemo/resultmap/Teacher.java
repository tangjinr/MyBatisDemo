package com.tangz.mybatisdemo.resultmap;

/**
 * Author: tangzhen
 * Package: com.tangz.mybatisdemo.resultmap
 * Name: Teacher
 * Date: 2017/6/2
 * Time: 17:13
 */

public class Teacher {

    private int id;
    private String teacherName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
