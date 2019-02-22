package com.accp.domain;

public class Course {
    private Integer courseId;

    private String courseName;

    private Integer coursetime;

    

    public Integer getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(Integer coursetime) {
        this.coursetime = coursetime;
    }
    private Integer courseTime;

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(Integer courseTime) {
		this.courseTime = courseTime;
	}
	
}