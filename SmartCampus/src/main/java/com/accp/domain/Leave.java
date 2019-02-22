package com.accp.domain;

import java.util.Date;

public class Leave {
    private Integer leaveid;

    private Integer studentid;

    private String studentname;

    private Integer studentgread;

    private Integer studentclass;

    private Date startime;

    private Date endtime;

    private String main;

    private Integer teacher;

    private String k1;

    private String k2;

    public Integer getLeaveid() {
        return leaveid;
    }

    public void setLeaveid(Integer leaveid) {
        this.leaveid = leaveid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public Integer getStudentgread() {
        return studentgread;
    }

    public void setStudentgread(Integer studentgread) {
        this.studentgread = studentgread;
    }

    public Integer getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(Integer studentclass) {
        this.studentclass = studentclass;
    }

    public Date getStartime() {
        return startime;
    }

    public void setStartime(Date startime) {
        this.startime = startime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public Integer getTeacher() {
        return teacher;
    }

    public void setTeacher(Integer teacher) {
        this.teacher = teacher;
    }

    public String getK1() {
        return k1;
    }

    public void setK1(String k1) {
        this.k1 = k1;
    }

    public String getK2() {
        return k2;
    }

    public void setK2(String k2) {
        this.k2 = k2;
    }
}