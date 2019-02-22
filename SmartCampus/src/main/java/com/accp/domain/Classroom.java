package com.accp.domain;

public class Classroom {
    private Integer classroomid;

    private String classroomname;

    private Integer floorid;

    private Integer status;

    private Integer type;

    private Integer accommodate;
    
    private Floor fobj;
    
    public Floor getFobj() {
		return fobj;
	}

	public void setFobj(Floor fobj) {
		this.fobj = fobj;
	}

	public Classroom() {
		super();
	}

	public Classroom(String classroomname, Integer floorid, Integer type) {
		super();
		this.classroomname = classroomname;
		this.floorid = floorid;
		this.type = type;
	}

	public Integer getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(Integer classroomid) {
        this.classroomid = classroomid;
    }

    public String getClassroomname() {
        return classroomname;
    }

    public void setClassroomname(String classroomname) {
        this.classroomname = classroomname;
    }

    public Integer getFloorid() {
        return floorid;
    }

    public void setFloorid(Integer floorid) {
        this.floorid = floorid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAccommodate() {
        return accommodate;
    }

    public void setAccommodate(Integer accommodate) {
        this.accommodate = accommodate;
    }
}