package com.accp.domain;

public class TaskMiddle {

	private int middleId; //id
	private int publisherId;//发布人id
	private int taskId;//任务id
	private int ryId;//接收人id
	private int state;//接收人状态
	private int taskstate;//任务状态id
	private Staff publisher;
	private CdcTask cdcTask;
	private Staff staff;
	private Studentinfo studentInfo;
	
	public Staff getPublisher() {
		return publisher;
	}
	public void setPublisher(Staff publisher) {
		this.publisher = publisher;
	}
	public CdcTask getCdcTask() {
		return cdcTask;
	}
	public void setCdcTask(CdcTask cdcTask) {
		this.cdcTask = cdcTask;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Studentinfo getStudentInfo() {
		return studentInfo;
	}
	public void setStudentInfo(Studentinfo studentInfo) {
		this.studentInfo = studentInfo;
	}
	public int getMiddleId() {
		return middleId;
	}
	public void setMiddleId(int middleId) {
		this.middleId = middleId;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public int getRyId() {
		return ryId;
	}
	public void setRyId(int ryId) {
		this.ryId = ryId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getTaskstate() {
		return taskstate;
	}
	public void setTaskstate(int taskstate) {
		this.taskstate = taskstate;
	}
	
}