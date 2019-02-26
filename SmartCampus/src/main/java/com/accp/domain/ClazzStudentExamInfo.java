package com.accp.domain;

import java.util.List;

public class ClazzStudentExamInfo {
	private Studentinfo stu;
	private List<Havetaskexam> examlist;
	public Studentinfo getStu() {
		return stu;
	}
	public void setStu(Studentinfo stu) {
		this.stu = stu;
	}
	public List<Havetaskexam> getExamlist() {
		return examlist;
	}
	public void setExamlist(List<Havetaskexam> examlist) {
		this.examlist = examlist;
	}
}
