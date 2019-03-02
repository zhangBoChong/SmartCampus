package com.accp.domain;

import java.util.List;

public class TanClassinfo {
	private Clazz clzobj;
	private List<ClazzStudentExamInfo> clslist;
	private List<ClazzStudent> clsattencelist;
	
	public Clazz getClzobj() {
		return clzobj;
	}
	public void setClzobj(Clazz clzobj) {
		this.clzobj = clzobj;
	}
	public List<ClazzStudentExamInfo> getClslist() {
		return clslist;
	}
	public void setClslist(List<ClazzStudentExamInfo> clslist) {
		this.clslist = clslist;
	}
	public List<ClazzStudent> getClsattencelist() {
		return clsattencelist;
	}
	public void setClsattencelist(List<ClazzStudent> clsattencelist) {
		this.clsattencelist = clsattencelist;
	}
}
