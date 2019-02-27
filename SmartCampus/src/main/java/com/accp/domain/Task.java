package com.accp.domain;

import java.util.Date;

public class Task {
    private Integer task_id;

    private Integer bid;

    private Integer courseId;

    private Integer sectionId;

    private Integer tid;

    private Double task_zf;

    private Integer task_lx_id;

    private Date task_kstime;

    private Date task_jstime;

    private String task_mc;
    
	public String getTask_mc() {
		return task_mc;
	}

	public void setTask_mc(String task_mc) {
		this.task_mc = task_mc;
	}

	public Integer getTask_id() {
		return task_id;
	}

	public void setTask_id(Integer task_id) {
		this.task_id = task_id;
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

	public Double getTask_zf() {
		return task_zf;
	}

	public void setTask_zf(Double task_zf) {
		this.task_zf = task_zf;
	}

	public Integer getTask_lx_id() {
		return task_lx_id;
	}

	public void setTask_lx_id(Integer task_lx_id) {
		this.task_lx_id = task_lx_id;
	}

	public Date getTask_kstime() {
		return task_kstime;
	}

	public void setTask_kstime(Date task_kstime) {
		this.task_kstime = task_kstime;
	}

	public Date getTask_jstime() {
		return task_jstime;
	}

	public void setTask_jstime(Date task_jstime) {
		this.task_jstime = task_jstime;
	}

}