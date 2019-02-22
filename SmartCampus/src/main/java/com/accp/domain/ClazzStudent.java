package com.accp.domain;

public class ClazzStudent {
    private Integer czid;

    private Integer cid;

    private Integer sid;

    private Integer status;

    private Integer clazzpositionid;
    
    private Clazz clazz;

    public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
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