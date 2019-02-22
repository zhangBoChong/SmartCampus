package com.accp.domain;

public class Section {
    private Integer sectionId;

    private String sectionName;

    private Integer cvgmId;

    private Integer status;

    private Integer courseTime;

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public Integer getCvgmId() {
		return cvgmId;
	}

	public void setCvgmId(Integer cvgmId) {
		this.cvgmId = cvgmId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(Integer courseTime) {
		this.courseTime = courseTime;
	}

    
}