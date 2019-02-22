package com.accp.domain;

import java.util.List;

public class VessionGradeMajoridCourse {
    private Integer cvgmid;

    private Integer vgmid;

    private Integer courseid;
    private VessionGradeMajorid vgjd;
    private Course course;
    private Major major;
    private List<Ctc> ctc;
    

	

	public List<Ctc> getCtc() {
		return ctc;
	}

	public void setCtc(List<Ctc> ctc) {
		this.ctc = ctc;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public VessionGradeMajorid getVgjd() {
		return vgjd;
	}

	public void setVgjd(VessionGradeMajorid vgjd) {
		this.vgjd = vgjd;
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