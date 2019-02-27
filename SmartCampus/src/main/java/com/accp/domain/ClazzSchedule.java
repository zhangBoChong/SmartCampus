package com.accp.domain;

public class ClazzSchedule {
    private Integer csid;
    private String datetime;
    private Integer cid;
    private Integer classroomid;
    private Integer apm;
    private Integer scheduleid;
    private String cname;
    private Schedule schedule;
    private String classroomname;
    private Integer status;
    private String tname;//教员名称
    private String coursename;//课程名称
    private Integer courseschedule;//课程进度
    private Integer coursetime;//总课时
    private Integer coutime;//课时
    private Clazz clzobj;//班级名
    
    public Integer getCoutime() {
		return coutime;
	}

	public void setCoutime(Integer coutime) {
//		coutime=coutime/2;
		this.coutime = coutime/2;
	}

	public Clazz getClzobj() {
		return clzobj;
	}

	public void setClzobj(Clazz clzobj) {
		this.clzobj = clzobj;
	}
    
    public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Integer getCourseschedule() {
		return courseschedule;
	}

	public void setCourseschedule(Integer courseschedule) {
		this.courseschedule = courseschedule;
	}

	public Integer getCoursetime() {
		return coursetime;
	}

	public void setCoursetime(Integer coursetime) {
		this.coursetime = coursetime;
	}

	public String getClassroomname() {
		return classroomname;
	}

	public void setClassroomname(String classroomname) {
		this.classroomname = classroomname;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getApm() {
		return apm;
	}

	public void setApm(Integer apm) {
		this.apm = apm;
	}

	public Integer getScheduleid() {
		return scheduleid;
	}

	public void setScheduleid(Integer scheduleid) {
		this.scheduleid = scheduleid;
	}

	public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

   
    public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(Integer classroomid) {
        this.classroomid = classroomid;
    }
}