package com.accp.mapper;

import com.accp.domain.Studentinfo;
import com.accp.domain.StudentinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StudentinfoMapper {
	int insertStudentinfo(Studentinfo stu);
	int updateStudentinfo(Studentinfo stu);
	Studentinfo queryBystusid(Integer sid);
    
	//可以升学的学员
	List<Studentinfo> canupclazzBysidArray(Integer [] sid);
	//学员所有考试信息--(不确定)
	Studentinfo studentexam(Integer sid);
	//所有新生
	List<Studentinfo> selectBystatus();
	//根据学员编号查询
	Studentinfo selectBysid(Integer sid);
	//删除-修改状态 0正常、1删除
	
	
	//按sid查询学生表
    Studentinfo queryBysid1(@Param("sid") Integer sid);
    
    //修改学生状态
    int updatestudentstatus(@Param("status") Integer status,@Param("sid") Integer sid);
    
    //
    List<Studentinfo> queryBysidnnn(@Param("sid") Integer sid);
	
	
	//个人详情页面，个人基本信息（班级、年级、学号）
	Studentinfo selectallinfo(Integer sid);
	
    long countByExample(StudentinfoExample example);

    int deleteByExample(StudentinfoExample example);
    
    int deleteByPrimaryKey(Integer sid);

    int insert(Studentinfo record);
    //新增学员
    int insertSelective(Studentinfo record);

    List<Studentinfo> selectByExample(StudentinfoExample example);
    
    Studentinfo selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);

    int updateByExample(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);
    //修改
    int updateByPrimaryKeySelective(Studentinfo record);

    int updateByPrimaryKey(Studentinfo record);
    
    List<Studentinfo> queryAllStudent();
    
    Character characterName(int characterId);
    
    List<Studentinfo> queryStudent(@Param("sname")String sname,@Param("age1")Integer age1,@Param("age2")Integer age2,@Param("sex")Integer sex,@Param("characterId")Integer characterId);
    
    int updateStudent1(int sid);
    
    int updateStudent2(int sid);
    
    int updateStudent3();
    
    int updateStudent4();
    
    List<Studentinfo> queryStudent2();
    
    int updateStudent5();
    
    int studentQuantity();
    
    int studentQuantity2();

    int updateStudent6(int sid);
}