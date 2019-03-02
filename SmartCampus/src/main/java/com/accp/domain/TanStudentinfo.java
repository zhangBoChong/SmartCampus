package com.accp.domain;

import java.util.List;

public class TanStudentinfo {
	private Studentinfo stuobj;
	private List<Havetaskexam> elist;
	private AttenceCount acount;
	
	public Studentinfo getStuobj() {
		return stuobj;
	}
	public void setStuobj(Studentinfo stuobj) {
		this.stuobj = stuobj;
	}
	public List<Havetaskexam> getElist() {
		return elist;
	}
	public void setElist(List<Havetaskexam> elist) {
		this.elist = elist;
	}
	public AttenceCount getAcount() {
		return acount;
	}
	public void setAcount(AttenceCount acount) {
		this.acount = acount;
	}

}
