package com.accp.domain;

public class VessionGrade {
    private Integer bid;

    private Integer vid;

    private Integer gid;
    
    private Vession vession;
    
    private Grade grade;
    
    public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Vession getVession() {
		return vession;
	}

	public void setVession(Vession vession) {
		this.vession = vession;
	}

	public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }
}