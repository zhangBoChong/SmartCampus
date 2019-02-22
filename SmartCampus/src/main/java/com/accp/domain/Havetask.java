package com.accp.domain;

public class Havetask {
    private Integer taskId;

    private Integer topicId;

    private Integer sid;

    private String havetaskXuandaan;

    private Double havetaskDafen;

    private Integer examinationId;
    
    private Examination examobj;
    private Double score;//试卷考试分数
    private Integer mistakecount; //题目做错总次数
    private Studentinfo stuobj;
    
    public Studentinfo getStuobj() {
		return stuobj;
	}

	public void setStuobj(Studentinfo stuobj) {
		this.stuobj = stuobj;
	}

	public Integer getMistakecount() {
		return mistakecount;
	}

	public void setMistakecount(Integer mistakecount) {
		this.mistakecount = mistakecount;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Examination getExamobj() {
		return examobj;
	}

	public void setExamobj(Examination examobj) {
		this.examobj = examobj;
	}

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

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
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

    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }
}