package com.accp.domain;

public class Topic {
    private Integer topic_id;

    private String topic_name;

    private Integer topic_lx_id;

    private String topic_level;

    private Integer topic_zqcount;

    private Integer sectionId;

    private Integer topic_count;

    private Integer bid;

    private Integer courseId;
    
    private Integer topic_deete;

	public Integer getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(Integer topic_id) {
		this.topic_id = topic_id;
	}

	public String getTopic_name() {
		return topic_name;
	}

	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}

	public Integer getTopic_lx_id() {
		return topic_lx_id;
	}

	public void setTopic_lx_id(Integer topic_lx_id) {
		this.topic_lx_id = topic_lx_id;
	}

	public String getTopic_level() {
		return topic_level;
	}

	public void setTopic_level(String topic_level) {
		this.topic_level = topic_level;
	}

	public Integer getTopic_zqcount() {
		return topic_zqcount;
	}

	public void setTopic_zqcount(Integer topic_zqcount) {
		this.topic_zqcount = topic_zqcount;
	}

	
	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public Integer getTopic_count() {
		return topic_count;
	}

	public void setTopic_count(Integer topic_count) {
		this.topic_count = topic_count;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getTopic_deete() {
		return topic_deete;
	}

	public void setTopic_deete(Integer topic_deete) {
		this.topic_deete = topic_deete;
	}
    
    
   
}