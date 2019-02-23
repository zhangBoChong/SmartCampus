package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.accp.mapper.ClassroomMapper;
import com.accp.mapper.ClazzMapper;
import com.accp.mapper.ClazzScheduleMapper;
import com.accp.mapper.ClazzStudentMapper;
import com.accp.mapper.ClazzTeacherMapper;
import com.accp.mapper.ClazzpositionMapper;
import com.accp.mapper.CourseMapper;
import com.accp.mapper.CourseTeacherMapper;
import com.accp.mapper.GradeMapper;
import com.accp.mapper.MajorMapper;
import com.accp.mapper.ScheduleMapper;
import com.accp.mapper.StaffMapper;
import com.accp.mapper.StudentinfoMapper;
import com.accp.mapper.VessionGradeMajoridCourseMapper;
import com.accp.mapper.VessionGradeMajoridMapper;
import com.accp.mapper.VessionGradeMapper;
import com.accp.mapper.VessionMapper;
import com.accp.service.ZBCCourseService;
@Service
public class ZBCCourseServiceImpl implements ZBCCourseService{
	@Autowired
	VessionMapper vessionMapper;
	@Autowired
	VessionGradeMapper vessionGradeMapper;
	@Autowired
	VessionGradeMajoridMapper vessionGradeMajoridMapper;
	@Autowired
	VessionGradeMajoridCourseMapper vessionGradeMajoridCourseMapper;
	@Autowired
	MajorMapper majorMapper;
	@Autowired
	GradeMapper gradeMapper;
	@Autowired
	CourseMapper courseMapper;
	@Autowired
	CourseTeacherMapper courseTeacherMapper;
	@Autowired
	StaffMapper staffMapper;
	@Autowired
	ClazzTeacherMapper clazzTeacherMapper;
	@Autowired
	ClazzMapper clazzMapper;
	@Autowired
	ScheduleMapper scheduleMapper;
	@Autowired
	ClazzScheduleMapper clazzScheduleMapper;
	@Autowired
	ClassroomMapper classroomMapper;
	@Autowired
	ClazzStudentMapper clazzStudentMapper;
	@Autowired
	ClazzpositionMapper clazzpositionMapper;
	@Autowired
	StudentinfoMapper  studentinfoMapper;
	@Override
	public List<Vession> queryVessions() {
		List<Vession> list=vessionMapper.queryVessions();
		return list;
	}
	@Override
	public List<VessionGrade> queryByVessionGradeVid(Integer vid) {
		List<VessionGrade> list=vessionGradeMapper.queryByVessionGradeVid(vid);
		for (VessionGrade vg : list) {
			vg.setGrade(gradeMapper.selectBygid(vg.getGid()));
		}
		return list;
	}
	@Override
	public List<VessionGradeMajorid> queryVessionGradeMajoridByBid(Integer bid) {
		List<VessionGradeMajorid> list=vessionGradeMajoridMapper.queryVessionGradeMajoridByBid(bid);
		for (VessionGradeMajorid vgm : list) {
			vgm.setMajor(majorMapper.selectBymajorid(vgm.getMajorid()));
		}
		return list;
	}
	@Override
	public List<VessionGradeMajoridCourse> queryVessionGradeMajoridCourseByvgmid(Integer vgmid) {
		List<VessionGradeMajoridCourse> list=vessionGradeMajoridCourseMapper.queryVessionGradeMajoridCourseByvgmid(vgmid);
		for (VessionGradeMajoridCourse vgmc : list) {
			vgmc.setCourse(courseMapper.selectBycourseid(vgmc.getCourseid()));
		}
		return list;
	}
	@Override
	public Grade selectBygid(Integer gid) {
		Grade grade=gradeMapper.selectBygid(gid);
		return grade;
	}
	@Override
	public Major selectBymajorid(Integer majorid) {
		Major major=majorMapper.selectBymajorid(majorid);
		return major;
	}
	@Override
	public Course selectBycourseid(Integer courseid) {
		Course course=courseMapper.selectBycourseid(courseid);
		return course;
	}
	@Override
	public List<CourseTeacher> queryCourseTeacherBycvgmid(Integer cvgmid) {
		List<CourseTeacher> list=courseTeacherMapper.queryCourseTeacherBycvgmid(cvgmid);
		for (CourseTeacher ct : list) {
			ct.setStaff(staffMapper.selectBytid(ct.getTid()));
		}
		return list;
	}
	@Override
	public Staff selectBytid(Integer tid) {
		Staff staff=staffMapper.selectBytid(tid);
		return staff;
	}
	@Override
	public List<ClazzTeacher> queryClazzTeacherByctid(Integer ctid) {
		List<ClazzTeacher> list=clazzTeacherMapper.queryClazzTeacherByctid(ctid);
		for (ClazzTeacher clazzTeacher : list) {
			Clazz clazz=clazzMapper.selectBycid(clazzTeacher.getCid());
			clazz.setStaff(staffMapper.selectBytid(clazz.getTid()));
			clazzTeacher.setClazz(clazz);
			
		}
		return list;
	}
	@Override
	public Clazz selectBycid(Integer cid) {
		Clazz clazz=clazzMapper.selectBycid(cid);		
		return clazz;
	}
	@Override
	public int insertCourse(Course course) {
		int count=courseMapper.insertCourse(course);
		return count;
	}
	@Override
	public int insertVessionGradeMajoridCourse(VessionGradeMajoridCourse record) {
		int count=vessionGradeMajoridCourseMapper.insertVessionGradeMajoridCourse(record);
		return count;
	}
	@Override
	public List<Clazz> queryBybid(Integer bid) {
		List<Clazz> list=clazzMapper.queryBybid(bid);
		return list;
	}
	@Override
	public int insertSchedule(List<Schedule> list) {
		int count=scheduleMapper.insertSchedule(list);
		return count;
	}
	@Override
	public List<Schedule> queryByTime(Schedule record) {
		List<Schedule> list=scheduleMapper.queryByTime(record);
		return list;
	}
	@Override
	public int insertClazzSchedule(List<ClazzSchedule> list) {
		int count=clazzScheduleMapper.insertClazzSchedule(list);
		return count;
	}
	@Override
	public ClazzSchedule selectByClazzSchedulecid(Integer cid) {
		ClazzSchedule cs=clazzScheduleMapper.selectByClazzSchedulecid(cid);
		return cs;
	}
	@Override
	public int updateClazzSchedule(ClazzSchedule clazzSchedule) {
		int count=clazzScheduleMapper.updateClazzSchedule(clazzSchedule);
		return count;
	}
	@Override
	public List<ClazzSchedule> queryClazzSchedule(Integer cid,String datetime1,String datetime2) {
		List<ClazzSchedule> list=clazzScheduleMapper.queryClazzSchedule(cid,datetime1,datetime2);		
		int number=0;
		for (ClazzSchedule c : list) {
			c.setCname(clazzMapper.selectBycid(c.getCid()).getCname());
			c.setSchedule(scheduleMapper.queryByScheduleid(c.getScheduleid()));
			Classroom list1=classroomMapper.queryByroom();
			Classroom list2=classroomMapper.queryByroom1();			
			if(c.getScheduleid()==0) {				
				if(number%2==0) {					
					c.setClassroomid(list1.getClassroomid());
					c.setClassroomname(classroomMapper.queryByRoomId(c.getClassroomid()).getClassroomname());
					ClazzSchedule CS=new ClazzSchedule();
					CS.setApm(c.getApm());
					CS.setCid(c.getCid());
					CS.setClassroomid(c.getClassroomid());
					CS.setCname(c.getCname());
					CS.setCsid(c.getCsid());
					CS.setDatetime(c.getDatetime());
					CS.setScheduleid(c.getScheduleid());
					clazzScheduleMapper.updateClassroomId(CS);
					classroomMapper.updateRoom(list1.getClassroomid());				
					ClazzTeacher ct=clazzTeacherMapper.queryBycid(cid);
					if(ct!=null) {						
						c.setCourseschedule(ct.getCourseschedule());//当前课程进度						
						CourseTeacher ctt=courseTeacherMapper.queryByctid(ct.getCtid());
						c.setTname(staffMapper.selectBytid(ctt.getTid()).getTname());
						VessionGradeMajoridCourse vgmc=vessionGradeMajoridCourseMapper.selectBycvgmid(ctt.getCvgmid());
						c.setCoursename(courseMapper.selectBycourseid(vgmc.getCourseid()).getCoursename());
						c.setCoursetime(courseMapper.selectBycourseid(vgmc.getCourseid()).getCoursetime());
						
						ct.setCourseschedule(ct.getCourseschedule()+1);					
						if(ct.getCourseschedule()>courseMapper.selectBycourseid(vgmc.getCourseid()).getCoursetime()) {
							ct.setStatus(0);
							ct.setCourseschedule(ct.getCourseschedule()-1);
							clazzTeacherMapper.updatecourseschedule(ct);
							//改下一本书的课程状态
							clazzTeacherMapper.updatetwo(cid);
							
						}else {
							clazzTeacherMapper.updatecourseschedule(ct);
						}
						
					}else {
						
					}
					
					
				}else {
					c.setClassroomid(list2.getClassroomid());
					c.setClassroomname(classroomMapper.queryByRoomId(c.getClassroomid()).getClassroomname());
					ClazzSchedule CS=new ClazzSchedule();
					CS.setApm(c.getApm());
					CS.setCid(c.getCid());
					CS.setClassroomid(c.getClassroomid());
					CS.setCname(c.getCname());
					CS.setCsid(c.getCsid());
					CS.setDatetime(c.getDatetime());
					CS.setScheduleid(c.getScheduleid());
					clazzScheduleMapper.updateClassroomId(CS);
					classroomMapper.updateRoom(list2.getClassroomid());
				}
				//System.out.println("班级"+c.getCid());
				//System.out.println("日程编号"+c.getScheduleid());
				//System.out.println("apm"+c.getApm());
				number++;
			}
			
		}
		
		return list;
	}
	@Override
	public Schedule queryByScheduleid(Integer scheduleid) {
		Schedule schedule=scheduleMapper.queryByScheduleid(scheduleid);
		return schedule;
	}
	@Override
	public int addVession(String vname) {
		int count=vessionMapper.addVession(vname);
		return count;
	}
	@Override
	public Classroom queryByroom() {
		Classroom list=classroomMapper.queryByroom();
		return list;
	}
	@Override
	public Classroom queryByroom1() {
		Classroom list=classroomMapper.queryByroom1();
		return list;
	}
	@Override
	public int updateRoom(Integer classroomId) {
		int count=classroomMapper.updateRoom(classroomId);
		return count;
	}
	@Override
	public int updateClassroomId(ClazzSchedule clazzSchedule) {
		int count=clazzScheduleMapper.updateClassroomId(clazzSchedule);
		return count;
	}
	@Override
	public int updateRooms() {
		int count=classroomMapper.updateRooms();
		return count;
	}
	@Override
	public Classroom queryByRoomId(Integer classroomid) {
		Classroom clazz=classroomMapper.queryByRoomId(classroomid);
		return clazz;
	}
	@Override
	public ClazzTeacher queryBycid(Integer cid) {
		ClazzTeacher ct=clazzTeacherMapper.queryBycid(cid);
		return ct;
	}
	@Override
	public CourseTeacher queryByctid(Integer ctid) {
		CourseTeacher ct=courseTeacherMapper.queryByctid(ctid);
		return ct;
	}
	@Override
	public VessionGradeMajoridCourse selectBycvgmid(Integer cvgmid) {
		VessionGradeMajoridCourse vgmc=vessionGradeMajoridCourseMapper.selectBycvgmid(cvgmid);
		return vgmc;
	}
	@Override
	public int updatecourseschedule(ClazzTeacher record) {
		int count=clazzTeacherMapper.updatecourseschedule(record);
		return count;
	}
	@Override
	public int updatetwo(Integer cid) {
		int ct=clazzTeacherMapper.updatetwo(cid);
		return ct;
	}
	@Override
	public int insertGrade(Grade grade) {
		int count=gradeMapper.insertGrade(grade);
		return count;
	}
	@Override
	public int insertVG(VessionGrade vg) {
		int count=vessionGradeMapper.insertVG(vg);
		return count;
	}
	@Override
	public int updateStatus(Integer cid, String datetime1, String datetime2) {
		int count=clazzScheduleMapper.updateStatus(cid, datetime1, datetime2);
		return count;
	}
	@Override
	public List<ClazzSchedule> queryBycids(Integer cid) {
		List<ClazzSchedule> list=clazzScheduleMapper.queryBycids(cid);
		return list;
	}
	@Override
	public List<Clazz> queryAllclazz() {
		List<Clazz> list=clazzMapper.queryAllclazz();
		return list;
	}
	@Override
	public List<ClazzSchedule> queryClazzSchedule1(Integer cid, String datetime1, String datetime2) {
		List<ClazzSchedule> list=clazzScheduleMapper.queryClazzSchedule1(cid, datetime1, datetime2);
		ClazzTeacher ct=clazzTeacherMapper.queryBycid(cid);
		CourseTeacher ctt=courseTeacherMapper.queryByctid(ct.getCtid());
		VessionGradeMajoridCourse vgmc=vessionGradeMajoridCourseMapper.selectBycvgmid(ctt.getCvgmid());
		for (ClazzSchedule cs : list) {
			if(cs.getScheduleid()==0) {
				cs.setClassroomname(classroomMapper.queryByRoomId(cs.getClassroomid()).getClassroomname());
				cs.setTname(staffMapper.selectBytid(ctt.getTid()).getTname());
				cs.setCoursename(courseMapper.selectBycourseid(vgmc.getCourseid()).getCoursename());
			}else {
				cs.setSchedule(scheduleMapper.queryByScheduleid(cs.getScheduleid()));
			}
		}
		return list;
	}
	@Override
	public List<Clazz> queryClazzs() {
		List<Clazz> list=clazzMapper.queryClazzs();
		for (Clazz clazz : list) {
			VessionGrade vg=vessionGradeMapper.queryByVGbid(clazz.getBid());
			Grade g=gradeMapper.selectBygid(vg.getGid());
			clazz.setGname(g.getGname());
			clazz.setStaff(staffMapper.selectBytid(clazz.getTid()));
			ClazzTeacher ct=clazzTeacherMapper.queryBycid(clazz.getCid());
			try {
				CourseTeacher ctt=courseTeacherMapper.queryByctid(ct.getCtid());
				clazz.setTname(staffMapper.selectBytid(ctt.getTid()).getTname());
				clazz.setCount(clazzStudentMapper.countstu(clazz.getCid()));
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		return list;
	}
	@Override
	public VessionGrade queryByVGbid(Integer bid) {
		VessionGrade vg=vessionGradeMapper.queryByVGbid(bid);
		return vg;
	}
	@Override
	public int countstu(Integer cid) {
		int count=clazzStudentMapper.countstu(cid);
		return count;
	}
	@Override
	public List<ClazzStudent> queryByClzStucid(Integer cid) {
		List<ClazzStudent> list=clazzStudentMapper.queryByClzStucid(cid);
		for (ClazzStudent cs : list) {
			if(cs.getClazzpositionid()==0) {
				cs.setClazzPositionName("无");
			}else {
				cs.setClazzPositionName(clazzpositionMapper.queryBypositionid(cs.getClazzpositionid()).getClazzpositionname());
			}			
			cs.setStu(studentinfoMapper.queryBystusid(cs.getSid()));
		}
		return list;
	}
	@Override
	public Clazzposition queryBypositionid(Integer positionid) {
		Clazzposition cp=clazzpositionMapper.queryBypositionid(positionid);
		return cp;
	}
	@Override
	public Studentinfo queryBystusid(Integer sid) {
		Studentinfo stu=studentinfoMapper.queryBystusid(sid);
		return stu;
	}
	@Override
	public List<Clazzposition> queryAllclazzpositions() {
		List<Clazzposition> list=clazzpositionMapper.queryAllclazzpositions();
		return list;
	}
	@Override
	public int updateStudentinfo(Studentinfo stu) {
		int count=studentinfoMapper.updateStudentinfo(stu);
		return count;
	}
	@Override
	public int updateclazzStudent(ClazzStudent record) {
		int count=clazzStudentMapper.updateclazzStudent(record);
		return count;
	}
	@Override
	public int insertStudentinfo(Studentinfo stu) {
		int num=(int)(Math.random()*9000)+1000;	
		stu.setSnumber(String.valueOf(num));
		int count=studentinfoMapper.insertStudentinfo(stu);	
		return count;
	}
	@Override
	public int insertclazzStudentinfos(ClazzStudent stu) {
		int count=clazzStudentMapper.insertclazzStudentinfos(stu);
		return count;
	}
	
	

}
