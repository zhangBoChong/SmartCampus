package com.accp.domain;

import java.util.Date;

public class Attence {
    private Integer attenceid;

    private Integer studentid;

    private String studentname;

    private Integer studentgreadid;

    private Integer studentclassid;

    private Integer studentteacher;

    private Date time;

    private Integer attence;

    private String k1;

    private String k2;

    public Integer getAttenceid() {
        return attenceid;
    }

    public void setAttenceid(Integer attenceid) {
        this.attenceid = attenceid;
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

    public Integer getStudentgreadid() {
        return studentgreadid;
    }

    public void setStudentgreadid(Integer studentgreadid) {
        this.studentgreadid = studentgreadid;
    }

    public Integer getStudentclassid() {
        return studentclassid;
    }

    public void setStudentclassid(Integer studentclassid) {
        this.studentclassid = studentclassid;
    }

    public Integer getStudentteacher() {
        return studentteacher;
    }

    public void setStudentteacher(Integer studentteacher) {
        this.studentteacher = studentteacher;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getAttence() {
        return attence;
    }

    public void setAttence(Integer attence) {
        this.attence = attence;
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