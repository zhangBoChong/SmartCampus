package com.accp.domain;

import java.util.Date;

public class Interview {
    private Integer interviewid;

    private Integer interviewteacherid;

    private Integer interviewstudentid;

    private String interviewproblem;

    private String interviewfeedback;

    private Date interviewtime;

    public Integer getInterviewid() {
        return interviewid;
    }

    public void setInterviewid(Integer interviewid) {
        this.interviewid = interviewid;
    }

    public Integer getInterviewteacherid() {
        return interviewteacherid;
    }

    public void setInterviewteacherid(Integer interviewteacherid) {
        this.interviewteacherid = interviewteacherid;
    }

    public Integer getInterviewstudentid() {
        return interviewstudentid;
    }

    public void setInterviewstudentid(Integer interviewstudentid) {
        this.interviewstudentid = interviewstudentid;
    }

    public String getInterviewproblem() {
        return interviewproblem;
    }

    public void setInterviewproblem(String interviewproblem) {
        this.interviewproblem = interviewproblem;
    }

    public String getInterviewfeedback() {
        return interviewfeedback;
    }

    public void setInterviewfeedback(String interviewfeedback) {
        this.interviewfeedback = interviewfeedback;
    }

    public Date getInterviewtime() {
        return interviewtime;
    }

    public void setInterviewtime(Date interviewtime) {
        this.interviewtime = interviewtime;
    }
}