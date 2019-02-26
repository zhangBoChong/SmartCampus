package com.accp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.domain.Clazz;
import com.accp.domain.ClazzTeacher;
import com.accp.domain.Course;
import com.accp.domain.CourseTeacher;
import com.accp.domain.Staff;
import com.accp.domain.Studentinfo;

public interface WYLService {
	List<Studentinfo> queryAllStudent();

    List<Studentinfo> queryStudent(@Param("sname")String sname,@Param("age1")Integer age1,@Param("age2")Integer age2,@Param("sex")Integer sex,@Param("characterId")Integer characterId);
    
    int updateStudent1(int sid);
    
    int updateStudent2(int sid);
    
    int updateStudent3();
    
    int updateStudent4();
    
	List<Staff> queryAllStaff(int postId);
	
	List<Staff> queryStaff(@Param("postId")Integer postId,@Param("tid")Integer tid,@Param("tname")String tname,@Param("age1")Integer age1,@Param("age2")Integer age2,@Param("sex")Integer sex,@Param("characterId")Integer characterId);
	
	List<Course> queryAllCourse();

	int insert(Clazz clazz);

	int courseTeacherinsert(CourseTeacher courseTeacher);

    int clazzTeacherinsert(Integer ctid,Integer cid);
    
    List<Studentinfo> queryStudent2();

    int clazzStudentinsert(Integer cid,Integer sid);
    
    int updateStudent5();
	
	int mc();
	
	int insert2(Clazz clazz);
    
    int studentQuantity();
    
    int studentQuantity2();

    int updateStudent6(int sid);
	
	Staff queryStaff2();

	Staff queryStaff3();
	
	int updateClazz(@Param("tid")Integer tid,@Param("cid")Integer cid);
}
