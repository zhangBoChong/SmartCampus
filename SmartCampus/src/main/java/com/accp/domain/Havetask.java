package com.accp.domain;

public class Havetask {
    private Integer taskId;

    private Integer topicId;

    private Integer csid;

    private String havetaskXuandaan;

    private Double havetaskDafen;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public String getHavetaskXuandaan() {
        return havetaskXuandaan;
    }

    public void setHavetaskXuandaan(String havetaskXuandaan) {
        this.havetaskXuandaan = havetaskXuandaan;
    }

    public Double getHavetaskDafen() {
        return havetaskDafen;
    }

    public void setHavetaskDafen(Double havetaskDafen) {
        this.havetaskDafen = havetaskDafen;
    }
}