package com.accp.domain;

public class CourseTeacher {
    private Integer ctid;

    private Integer cvgmid;

    private Integer tid;
	
	private Integer courseid;
    
    private Staff staff;
    
	private ClazzTeacher clzteacherobj;//获得班级编号
	private Staff stfobj;//获得教员信息
	private ClazzSchedule clzscheduleobj;//班级名+上课课时
	
	private Course courseobj;
	private Clazz clzobj;
	
	public Course getCourseobj() {
		return courseobj;
	}

	public void setCourseobj(Course courseobj) {
		this.courseobj = courseobj;
	}

	public Clazz getClzobj() {
		return clzobj;
	}

	public void setClzobj(Clazz clzobj) {
		this.clzobj = clzobj;
	}

	public Integer getCourseid() {
		return courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

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
