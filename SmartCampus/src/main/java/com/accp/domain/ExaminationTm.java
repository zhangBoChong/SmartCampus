package com.accp.domain;

import java.util.List;

public class ExaminationTm {
    private Integer examinationTmId;

    private Integer topicId;

    private Integer examinationId;

    private Double examinationTmXzt;

    private Double examinationTmWdt;
    
    private Integer mistakecount; //题目做错总次数
    private Topic topicobj;//题目集合
    private List<Havetask> mistakestu;//题目做错的学员集合
    
    
	public List<Havetask> getMistakestu() {
		return mistakestu;
	}

	public void setMistakestu(List<Havetask> mistakestu) {
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

	public Integer getExaminationTmId() {
        return examinationTmId;
    }

    public void setExaminationTmId(Integer examinationTmId) {
        this.examinationTmId = examinationTmId;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    public Double getExaminationTmXzt() {
        return examinationTmXzt;
    }

    public void setExaminationTmXzt(Double examinationTmXzt) {
        this.examinationTmXzt = examinationTmXzt;
    }

    public Double getExaminationTmWdt() {
        return examinationTmWdt;
    }

    public void setExaminationTmWdt(Double examinationTmWdt) {
        this.examinationTmWdt = examinationTmWdt;
    }
}