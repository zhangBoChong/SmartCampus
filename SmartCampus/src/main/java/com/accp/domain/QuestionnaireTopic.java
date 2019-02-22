package com.accp.domain;

public class QuestionnaireTopic {
    private Integer topicid;

    private String problem;

    private Integer questionnaireid;

    private Integer delete;

    public Integer getTopicid() {
        return topicid;
    }

    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public Integer getQuestionnaireid() {
        return questionnaireid;
    }

    public void setQuestionnaireid(Integer questionnaireid) {
        this.questionnaireid = questionnaireid;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }
}