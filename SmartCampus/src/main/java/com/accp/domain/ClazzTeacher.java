package com.accp.domain;

public class ClazzTeacher {
    private Integer tcid;

    private Integer ctid;

	private Integer tid;

    private Integer cid;

    private Integer status;

    private Integer courseschedule;

    private Clazz clazz;
    

    public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public Integer getTcid() {
        return tcid;
    }

    public void setTcid(Integer tcid) {
        this.tcid = tcid;
    }

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCourseschedule() {
        return courseschedule;
    }

    public void setCourseschedule(Integer courseschedule) {
        this.courseschedule = courseschedule;
    }

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}
    
}