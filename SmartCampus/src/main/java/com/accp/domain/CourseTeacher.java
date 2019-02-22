package com.accp.domain;

public class CourseTeacher {
    private Integer ctid;

    private Integer cvgmid;

    private Integer tid;
   

	private ClazzTeacher clzteacherobj;//获得班级编号
    private Staff stfobj;//获得教员信息
    private ClazzSchedule clzscheduleobj;//班级名+上课课时

    public ClazzSchedule getClzscheduleobj() {
		return clzscheduleobj;
	}

	public void setClzscheduleobj(ClazzSchedule clzscheduleobj) {
		this.clzscheduleobj = clzscheduleobj;
	}

	public ClazzTeacher getClzteacherobj() {
		return clzteacherobj;
	}

	public void setClzteacherobj(ClazzTeacher clzteacherobj) {
		this.clzteacherobj = clzteacherobj;
	}

	public Staff getStfobj() {
		return stfobj;
	}

	public void setStfobj(Staff stfobj) {
		this.stfobj = stfobj;
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