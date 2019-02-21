package com.accp.domain;

public class VessionGradeMajoridCourse {
    private Integer cvgmid;

    private Integer vgmid;

    private Integer courseid;
    
    private Course course;
    

    public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Integer getCvgmid() {
        return cvgmid;
    }

    public void setCvgmid(Integer cvgmid) {
        this.cvgmid = cvgmid;
    }

    public Integer getVgmid() {
        return vgmid;
    }

    public void setVgmid(Integer vgmid) {
        this.vgmid = vgmid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }
}