package com.accp.domain;

public class ClazzStudent {
    private Integer czid;

    private Integer cid;

    private Integer sid;

    private Integer status;

    private Integer clazzpositionid;
    
    private String clazzPositionName;
    private Studentinfo stu;
    
    private Clazz cobj;
    
    private Studentinfo stuobj;
    
    private AttenceCount acountobj;
    
    private Clazz clazz;
   

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public AttenceCount getAcountobj() {
		return acountobj;
	}

	public void setAcountobj(AttenceCount acountobj) {
		this.acountobj = acountobj;
	}

	public Studentinfo getStuobj() {
		return stuobj;
	}

	public void setStuobj(Studentinfo stuobj) {
		this.stuobj = stuobj;
	}

	public Clazz getCobj() {
		return cobj;
	}

	public void setCobj(Clazz cobj) {
		this.cobj = cobj;
	}
    
    public Studentinfo getStu() {
		return stu;
	}

	public void setStu(Studentinfo stu) {
		this.stu = stu;
	}

	public String getClazzPositionName() {
		return clazzPositionName;
	}

	public void setClazzPositionName(String clazzPositionName) {
		this.clazzPositionName = clazzPositionName;
	}

	public Integer getCzid() {
        return czid;
    }

    public void setCzid(Integer czid) {
        this.czid = czid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getClazzpositionid() {
        return clazzpositionid;
    }

    public void setClazzpositionid(Integer clazzpositionid) {
        this.clazzpositionid = clazzpositionid;
    }
}