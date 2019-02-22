package com.accp.domain;

public class VessionGradeMajorid {
    private Integer vgmid;

    private Integer bid;

    private Integer majorid;
    private VessionGrade vessionGrade;
    
    public VessionGrade getVessionGrade() {
		return vessionGrade;
	}

	public void setVessionGrade(VessionGrade vessionGrade) {
		this.vessionGrade = vessionGrade;
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