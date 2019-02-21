package com.accp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.domain.Classroom;
import com.accp.domain.Clazz;
import com.accp.domain.ClazzSchedule;
import com.accp.domain.ClazzStudent;
import com.accp.domain.ClazzTeacher;
import com.accp.domain.Clazzposition;
import com.accp.domain.Course;
import com.accp.domain.CourseTeacher;
import com.accp.domain.Grade;
import com.accp.domain.Major;
import com.accp.domain.Schedule;
import com.accp.domain.Staff;
import com.accp.domain.Studentinfo;
import com.accp.domain.Vession;
import com.accp.domain.VessionGrade;
import com.accp.domain.VessionGradeMajorid;
import com.accp.domain.VessionGradeMajoridCourse;



public interface ZBCCourseService {
	//查版本
	List<Vession> queryVessions();
	//查版本年级中间表
	List<VessionGrade> queryByVessionGradeVid(Integer vid);
	//查版本年级专业中间表
	List<VessionGradeMajorid> queryVessionGradeMajoridByBid(Integer bid);
	//查版本年级专业课程中间表
	List<VessionGradeMajoridCourse> queryVessionGradeMajoridCourseByvgmid(Integer vgmid);
	//查年级
	Grade selectBygid(Integer gid);
	//查专业
	Major selectBymajorid(Integer majorid);
	//查课程
	Course selectBycourseid(Integer courseid);
	//查教员课程中间表
	List<CourseTeacher> queryCourseTeacherBycvgmid(Integer cvgmid);
	//查教员
	Staff selectBytid(Integer tid);
	//查班级教员中间表
	List<ClazzTeacher> queryClazzTeacherByctid(Integer ctid);
	//查班级
	Clazz selectBycid(Integer cid);
	//新增课程
	 int insertCourse(Course course);
	//新增版本年级专业课程中间表
	 int insertVessionGradeMajoridCourse(VessionGradeMajoridCourse record);
	//根据版本年级中间表编号查班级表
	 List<Clazz> queryBybid(Integer bid);
	 //新增日程
	 int insertSchedule(List<Schedule> list);
	 //查日程
	 List<Schedule> queryByTime(Schedule record);
	 //生成课表
	 int insertClazzSchedule(List<ClazzSchedule> list);
	 //根据年级班级预渲染下次要排课的开始日期
	 ClazzSchedule selectByClazzSchedulecid(Integer cid);
	 //课表绑定日程
	 int updateClazzSchedule(ClazzSchedule clazzSchedule);
	 //查课表
	 List<ClazzSchedule> queryClazzSchedule(Integer cid,String datetime1,String datetime2);
	 //查已发布的课表
	 List<ClazzSchedule> queryClazzSchedule1(Integer cid,String datetime1,String datetime2);
	 //根据日程编号查日程
	 Schedule queryByScheduleid(Integer scheduleid);
	 //新增版本
	 int addVession(String vname);
	 //查教室
	 Classroom queryByroom();		
	 //查自习室包括上机室
	 Classroom queryByroom1();	
	 //修改教室启用状态
	 int updateRoom(Integer classroomId);
	 //绑定课表的教室编号
	 int updateClassroomId(ClazzSchedule clazzSchedule);
	 //重置教室状态
	 int updateRooms();
	 //根据编号查询教室名称
	 Classroom queryByRoomId(Integer classroomid);
	 //根据班级编号查询班级教师表
	 ClazzTeacher queryBycid(Integer cid);
	 //查询课程教师表
	 CourseTeacher queryByctid(Integer ctid);
	 //vgmc表
	 VessionGradeMajoridCourse selectBycvgmid(Integer cvgmid);
	 //修改课程进度
	 int updatecourseschedule(ClazzTeacher record);
	 //改下一本书的教员的任课状态
	 ClazzTeacher updatetwo(Integer cid);
	 //新增年级
	 int insertGrade(Grade grade);
	 //新增年级版本表
	 int insertVG(VessionGrade vg);
	 //发布课表
	 int updateStatus(Integer cid,String datetime1,String datetime2);
	 //查课表班级时间区间数据
	 List<ClazzSchedule> queryBycids(Integer cid);
	 //查所有正常状态的班级
	 List<Clazz> queryAllclazz();
	 //查所有班级
	 List<Clazz> queryClazzs();
	 //查VG表
	 VessionGrade queryByVGbid(Integer bid);
	 //查班级人数
	 int countstu(Integer cid);
	 //查班级人员
	 List<ClazzStudent> queryByClzStucid(Integer cid);
	 //查班委
	 Clazzposition queryBypositionid(Integer positionid);
	 //查单个学生基本信息
	 Studentinfo queryBystusid(Integer sid);
	 //查所有班级职位
	 List<Clazzposition> queryAllclazzpositions();
	 //修改学生信息
	 int updateStudentinfo(Studentinfo stu);
	 //班委任免
	 int updateclazzStudent(ClazzStudent record);
	 //新增新学生
	 int insertStudentinfo(Studentinfo stu);
	 //新增班级学生表
	 int insertclazzStudentinfos(ClazzStudent stu);
}
