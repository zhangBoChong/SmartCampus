package com.accp.service;

import java.util.List;

import com.accp.domain.CourseTeacher;

public interface CourseTeacherInfoService {
	public List<CourseTeacher> selectTeachercoursetime(Integer tid,Integer datetime);
	public List<CourseTeacher> chateachercourseclassBytidtan(Integer tid);
}
