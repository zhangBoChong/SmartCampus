package com.accp.domain;

import java.util.Date;

public class TaskStage {
    private Integer stageid;

    private Date stagestarttime;

    private Date stageendtime;

    private String stageaccessories;

    private Integer taskid;

    private Integer delete;

    private String k1;

    private String k2;

    public Integer getStageid() {
        return stageid;
    }

    public void setStageid(Integer stageid) {
        this.stageid = stageid;
    }

    public Date getStagestarttime() {
        return stagestarttime;
    }

    public void setStagestarttime(Date stagestarttime) {
        this.stagestarttime = stagestarttime;
    }

    public Date getStageendtime() {
        return stageendtime;
    }

    public void setStageendtime(Date stageendtime) {
        this.stageendtime = stageendtime;
    }

    public String getStageaccessories() {
        return stageaccessories;
    }

    public void setStageaccessories(String stageaccessories) {
        this.stageaccessories = stageaccessories;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
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