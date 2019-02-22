package com.accp.domain;

import java.util.Date;
import java.util.List;

public class ClazzSchedule {
    private Integer csid;

    private Date datetime;

    private Integer cid;

    private Integer classroomid;

    private Integer apm;

    private Integer scheduleid;
    
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


	public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
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
}