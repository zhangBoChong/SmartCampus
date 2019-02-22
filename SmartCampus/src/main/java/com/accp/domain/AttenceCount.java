package com.accp.domain;

public class AttenceCount {
	private Integer normalcount;
	private Integer latecount;
	private Integer truant;
	private Integer vacate;
	
	public Integer getNormalcount() {
		return normalcount;
	}
	public void setNormalcount(Integer normalcount) {
		this.normalcount = normalcount;
	}
	public Integer getLatecount() {
		return latecount;
	}
	public void setLatecount(Integer latecount) {
		this.latecount = latecount;
	}
	public Integer getTruant() {
		return truant;
	}
	public void setTruant(Integer truant) {
		this.truant = truant;
	}
	public Integer getVacate() {
		return vacate;
	}
	public void setVacate(Integer vacate) {
		this.vacate = vacate;
	}
	
	
	public AttenceCount() {
		super();
	}
	public AttenceCount(Integer normalcount, Integer latecount, Integer truant, Integer vacate) {
		super();
		this.normalcount = normalcount;
		this.latecount = latecount;
		this.truant = truant;
		this.vacate = vacate;
	}
	
	
}
