package com.tangz.mybatisdemo.resultmap;

/**
 * Author: tangzhen
 * Package: com.tangz.mybatisdemo.resultmap
 * Name: Course
 * Date: 2017/6/2
 * Time: 17:13
 */

public class Course {
    private int id;
    private String courseName;
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
