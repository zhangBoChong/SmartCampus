package com.accp.domain;
import java.util.List;

public class ExaminationTm {
    private Integer examination_tm_id;

    private Integer topic_id;

    private Integer examination_id;

    private Double examination_tm_xzt;

    private Double examination_tm_wdt;
    
    private Integer mistakecount; //题目做错总次数
    private Topic topicobj;//题目集合
    private List<Havetaskexam> mistakestu;//题目做错的学员集合
    
    
	public List<Havetaskexam> getMistakestu() {
		return mistakestu;
	}

	public void setMistakestu(List<Havetaskexam> mistakestu) {
		this.mistakestu = mistakestu;
	}

	public Topic getTopicobj() {
		return topicobj;
	}

	public void setTopicobj(Topic topicobj) {
		this.topicobj = topicobj;
	}

	public Integer getMistakecount() {
		return mistakecount;
	}

	public void setMistakecount(Integer mistakecount) {
		this.mistakecount = mistakecount;
	}

	public Integer getExamination_tm_id() {
		return examination_tm_id;
	}

	public void setExamination_tm_id(Integer examination_tm_id) {
		this.examination_tm_id = examination_tm_id;
	}

	public Integer getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(Integer topic_id) {
		this.topic_id = topic_id;
	}

	public Integer getExamination_id() {
		return examination_id;
	}

	public void setExamination_id(Integer examination_id) {
		this.examination_id = examination_id;
	}

	public Double getExamination_tm_xzt() {
		return examination_tm_xzt;
	}

	public void setExamination_tm_xzt(Double examination_tm_xzt) {
		this.examination_tm_xzt = examination_tm_xzt;
	}

	public Double getExamination_tm_wdt() {
		return examination_tm_wdt;
	}

	public void setExamination_tm_wdt(Double examination_tm_wdt) {
		this.examination_tm_wdt = examination_tm_wdt;
	}
}