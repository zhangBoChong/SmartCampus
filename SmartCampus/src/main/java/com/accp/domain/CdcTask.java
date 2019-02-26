package com.accp.domain;

import java.util.List;

public class CdcTask {
	private int taskId;
	private String taskName;
	private String taskContent;
	private int publisherId;
	private String startTime;
	private String endTime;
	private int delete;
	private List<TaskStage> lists;
	private TaskMiddle middle;
	public TaskMiddle getMiddle() {
		return middle;
	}
	public void setMiddle(TaskMiddle middle) {
		this.middle = middle;
	}
	public List<TaskStage> getLists() {
		return lists;
	}
	public void setLists(List<TaskStage> lists) {
		this.lists = lists;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskContent() {
		return taskContent;
	}
	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getDelete() {
		return delete;
	}
	public void setDelete(int delete) {
		this.delete = delete;
	}
}
