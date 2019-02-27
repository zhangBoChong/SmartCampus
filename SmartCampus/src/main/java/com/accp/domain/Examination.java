package com.accp.domain;

import java.util.Date;

public class Examination {
    private Integer examination_id;

    private Integer bid;

    private Integer courseId;

    private Integer sectionId;

    private Integer tid;

    private Double examination_zf;

    private Integer examination_lx_id;

    private Date examination_kstime;
    private Date examination_jstime;
    private String examination_mc;
    
    
	private ExaminationLx examlxtype;
    private Course coursename;
    private Staff teachername;
    private Havetask examscore;


	public Havetask getExamscore() {
		return examscore;
	}

	public void setExamscore(Havetask examscore) {
		this.examscore = examscore;
	}

	public ExaminationLx getExamlxtype() {
		return examlxtype;
	}

	public void setExamlxtype(ExaminationLx examlxtype) {
		this.examlxtype = examlxtype;
	}

	public Course getCoursename() {
		return coursename;
	}

	public void setCoursename(Course coursename) {
		this.coursename = coursename;
	}

	public Staff getTeachername() {
		return teachername;
	}

	public void setTeachername(Staff teachername) {
		this.teachername = teachername;
	}

	public Integer getExamination_id() {
		return examination_id;
	}

	public void setExamination_id(Integer examination_id) {
		this.examination_id = examination_id;
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

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Double getExamination_zf() {
		return examination_zf;
	}

	public void setExamination_zf(Double examination_zf) {
		this.examination_zf = examination_zf;
	}

	public Integer getExamination_lx_id() {
		return examination_lx_id;
	}

	public void setExamination_lx_id(Integer examination_lx_id) {
		this.examination_lx_id = examination_lx_id;
	}

	public Date getExamination_kstime() {
		return examination_kstime;
	}

	public void setExamination_kstime(Date examination_kstime) {
		this.examination_kstime = examination_kstime;
	}
	
	public Date getExamination_jstime() {
		return examination_jstime;
	}

	public void setExamination_jstime(Date examination_jstime) {
		this.examination_jstime = examination_jstime;
	}

	public String getExamination_mc() {
		return examination_mc;
	}

	public void setExamination_mc(String examination_mc) {
		this.examination_mc = examination_mc;
	}
}