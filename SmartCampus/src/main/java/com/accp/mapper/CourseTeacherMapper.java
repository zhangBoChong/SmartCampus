package com.accp.mapper;

import com.accp.domain.CourseTeacher;
import com.accp.domain.CourseTeacherExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CourseTeacherMapper {
	CourseTeacher queryByctid(Integer ctid);
	List<CourseTeacher> queryCourseTeacherBycvgmid(Integer cvgmid);

	//班级现任教员信息(教员所带的班级)
	List<CourseTeacher> chaclzteacherBytid(@Param("tid") Integer tid);
	List<CourseTeacher> chateachercourseclassBytidtan(Integer tid);
	
    long countByExample(CourseTeacherExample example);

    int deleteByExample(CourseTeacherExample example);

    int deleteByPrimaryKey(Integer ctid);

    int insert(CourseTeacher record);

    int insertSelective(CourseTeacher record);

    List<CourseTeacher> selectByExample(CourseTeacherExample example);

    CourseTeacher selectByPrimaryKey(Integer ctid);

    int updateByExampleSelective(@Param("record") CourseTeacher record, @Param("example") CourseTeacherExample example);

    int updateByExample(@Param("record") CourseTeacher record, @Param("example") CourseTeacherExample example);

    int updateByPrimaryKeySelective(CourseTeacher record);

    int updateByPrimaryKey(CourseTeacher record);

	int courseTeacherinsert(CourseTeacher courseTeacher);
}
