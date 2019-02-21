package com.accp.domain;

public class VessionGradeMajorid {
    private Integer vgmid;

    private Integer bid;

    private Integer majorid;
    
    private Major major;
    
    public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Integer getVgmid() {
        return vgmid;
    }

    public void setVgmid(Integer vgmid) {
        this.vgmid = vgmid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }
}