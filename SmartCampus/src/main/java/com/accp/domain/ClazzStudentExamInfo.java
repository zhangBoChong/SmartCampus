package com.accp.domain;

import java.util.List;

public class ClazzStudentExamInfo {
	private Studentinfo stu;
	private List<Havetask> examlist;
	public Studentinfo getStu() {
		return stu;
	}
	public void setStu(Studentinfo stu) {
		this.stu = stu;
	}
	public List<Havetask> getExamlist() {
		return examlist;
	}
	public void setExamlist(List<Havetask> examlist) {
		this.examlist = examlist;
	}
}
