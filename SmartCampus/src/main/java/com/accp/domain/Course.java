package com.accp.domain;

public class Course {
    private Integer courseid;

    private String coursename;

    private Integer coursetime;

    

    public Integer getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(Integer coursetime) {
        this.coursetime = coursetime;
    }
    private Integer courseTime;

	public Integer getCourseid() {
		return courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Integer getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(Integer courseTime) {
		this.courseTime = courseTime;
	}
	
}