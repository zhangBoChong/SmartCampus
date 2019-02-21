package com.accp.domain;

public class CourseTeacher {
    private Integer ctid;

    private Integer cvgmid;

    private Integer tid;
    
    private Staff staff;
    

    public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public Integer getCvgmid() {
        return cvgmid;
    }

    public void setCvgmid(Integer cvgmid) {
        this.cvgmid = cvgmid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}