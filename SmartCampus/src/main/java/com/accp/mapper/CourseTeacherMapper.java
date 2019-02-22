package com.accp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.accp.domain.CourseTeacher;

@Mapper
public interface CourseTeacherMapper {
	int courseTeacherinsert(CourseTeacher courseTeacher);
}
