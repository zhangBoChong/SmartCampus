package com.accp.domain;

public class Topic {
    private Integer topicId;

    private String topicName;

    private Integer topicLxId;

    private String topicLevel;

    private Integer topicZqcount;

    private Integer sectionid;

    private Integer topicCount;

    private Integer bid;

    private Integer courseid;
    
    private Section seobj;

    public Section getSeobj() {
		return seobj;
	}

	public void setSeobj(Section seobj) {
		this.seobj = seobj;
	}

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Integer getTopicLxId() {
        return topicLxId;
    }

    public void setTopicLxId(Integer topicLxId) {
        this.topicLxId = topicLxId;
    }

    public String getTopicLevel() {
        return topicLevel;
    }

    public void setTopicLevel(String topicLevel) {
        this.topicLevel = topicLevel;
    }

    public Integer getTopicZqcount() {
        return topicZqcount;
    }

    public void setTopicZqcount(Integer topicZqcount) {
        this.topicZqcount = topicZqcount;
    }

    public Integer getSectionid() {
        return sectionid;
    }

    public void setSectionid(Integer sectionid) {
        this.sectionid = sectionid;
    }

    public Integer getTopicCount() {
        return topicCount;
    }

    public void setTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
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
}