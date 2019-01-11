package com.accp.domain;

import java.util.Date;

public class Task {
    private Integer taskId;

    private Integer bid;

    private Integer courseid;

    private Integer sectionid;

    private Integer tid;

    private Double taskZf;

    private Integer taskLxId;

    private Date taskKstime;

    private Date taskJstime;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getSectionid() {
        return sectionid;
    }

    public void setSectionid(Integer sectionid) {
        this.sectionid = sectionid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Double getTaskZf() {
        return taskZf;
    }

    public void setTaskZf(Double taskZf) {
        this.taskZf = taskZf;
    }

    public Integer getTaskLxId() {
        return taskLxId;
    }

    public void setTaskLxId(Integer taskLxId) {
        this.taskLxId = taskLxId;
    }

    public Date getTaskKstime() {
        return taskKstime;
    }

    public void setTaskKstime(Date taskKstime) {
        this.taskKstime = taskKstime;
    }

    public Date getTaskJstime() {
        return taskJstime;
    }

    public void setTaskJstime(Date taskJstime) {
        this.taskJstime = taskJstime;
    }
}