package com.accp.mapper;

import com.accp.domain.Course;
import com.accp.domain.CourseExample;
import com.accp.domain.Studentinfo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CourseMapper {
	List<Course> queryAllCourse();
}