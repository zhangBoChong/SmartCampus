package com.accp.domain;

public class Havetaskexam {
    private Integer examinationId;

    private Integer topicId;

    private Integer csid;

    private String havetaskXuandaan;

    private Double havetaskDafen;
    
    private Examination examobj;
    private Double score;//试卷考试分数
    private Integer mistakecount; //题目做错总次数
    private ClazzStudent cstuobj;

    public Examination getExamobj() {
		return examobj;
	}

	public void setExamobj(Examination examobj) {
		this.examobj = examobj;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getMistakecount() {
		return mistakecount;
	}

	public void setMistakecount(Integer mistakecount) {
		this.mistakecount = mistakecount;
	}

	public ClazzStudent getCstuobj() {
		return cstuobj;
	}

	public void setCstuobj(ClazzStudent cstuobj) {
		this.cstuobj = cstuobj;
	}

	public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
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