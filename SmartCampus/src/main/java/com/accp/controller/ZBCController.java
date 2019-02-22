package com.accp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Clazz;
import com.accp.domain.ClazzSchedule;
import com.accp.domain.ClazzStudent;
import com.accp.domain.ClazzTeacher;
import com.accp.domain.Clazzposition;
import com.accp.domain.Course;
import com.accp.domain.CourseTeacher;
import com.accp.domain.Grade;
import com.accp.domain.Schedule;
import com.accp.domain.Studentinfo;
import com.accp.domain.Vession;
import com.accp.domain.VessionGrade;
import com.accp.domain.VessionGradeMajorid;
import com.accp.domain.VessionGradeMajoridCourse;
import com.accp.mapper.ClazzStudentMapper;
import com.accp.service.ZBCCourseService;


@Controller
public class ZBCController {
	@Autowired
	ZBCCourseService zbcService;
	@RequestMapping("/Tomain")
	public String Tomain() {
		return "main";
	}
	@RequestMapping("/Tonav")
	public String Tonav() {
		return "nav";
	}
	//跳入课程查看页面
	@RequestMapping("/TocourseIndex")
	public String TocourseIndex() {
		return "courseIndex";
	}
	//跳入添加版本页面
	@RequestMapping("/AddVession")
	public String AddVession() {
		return "addVession";
	}
	//跳入查询课程页面
	@RequestMapping("/selectSchedule")
	public String selectSchedule() {
		return "selectSchedule";
	}
	//跳入班级查看页面
	@RequestMapping("/Toclazzs")
	public String Toclazzs() {
		return "clazzs";
	}
	@RequestMapping("/AddGrade")
	public String AddGrade() {
		return "addGrade";
	}
	//查版本
	@RequestMapping("/ToVessions")
	@ResponseBody
	public List<Vession> AllVessions(){
		List<Vession> list=zbcService.queryVessions();
		return list;
	}
	
	//根据版本查年级
	@RequestMapping("/ToGrades")
	@ResponseBody
	public List<VessionGrade> ToGrades(int vid){
		List<VessionGrade> list=zbcService.queryByVessionGradeVid(vid);
		return list;
	}
	//根据bid查专业
	@RequestMapping("/ToMajors")
	@ResponseBody
	public List<VessionGradeMajorid> ToMajors(int bid){
		List<VessionGradeMajorid> list=zbcService.queryVessionGradeMajoridByBid(bid);
		return list;
	}
	//根据vgmid查课程
	@RequestMapping("/ToCourses")
	@ResponseBody
	public List<VessionGradeMajoridCourse> ToCourses(int vgmid){
		List<VessionGradeMajoridCourse> list=zbcService.queryVessionGradeMajoridCourseByvgmid(vgmid);
		return list;
	}
	//根据cvgmid查教员
	@RequestMapping("/ToTeachers")
	@ResponseBody
	public List<CourseTeacher> ToTeachers(int cvgmid){
		List<CourseTeacher> list=zbcService.queryCourseTeacherBycvgmid(cvgmid);
		return list;
	}
	//根据ctid查班级
	@RequestMapping("/ToClazzs")
	@ResponseBody
	public List<ClazzTeacher> ToClazzs(int ctid){
		List<ClazzTeacher> list=zbcService.queryClazzTeacherByctid(ctid);
		return list;
	}
	//新增课程
	@RequestMapping("/AddCourse")
	@ResponseBody
	public int AddCourse(@Param("course")Course course,@Param("vgmid")Integer vgmid) {
		zbcService.insertCourse(course);
		VessionGradeMajoridCourse vgmc=new VessionGradeMajoridCourse();
		vgmc.setCourseid(course.getCourseId());
		vgmc.setVgmid(vgmid);
		int count1=zbcService.insertVessionGradeMajoridCourse(vgmc);
		return count1;
	}
	//根据bid查班级
		@RequestMapping("/BybidToClazzs")
		@ResponseBody
		public List<Clazz> BybidToClazzs(int bid){
			List<Clazz> list=zbcService.queryBybid(bid);
			return list;
		}
	//查询日程
		@RequestMapping("/SelectSchedule")
		@ResponseBody
		public List<Schedule> SelectSchedule(@Param("schedule")Schedule schedule,@Param("clazzs")int clazzs){
			schedule.setCid(clazzs);
			List<Schedule> list=zbcService.queryByTime(schedule);
			for (Schedule sd : list) {
				sd.setClazz(zbcService.selectBycid(clazzs));
			}
			return list;
		}
		
	//ajax添加日程
		@RequestMapping("/AddSchedule")
		@ResponseBody
		public int AddSchedule(@Param("clzss") int[] clzss,@Param("datestart") String datestart,@Param("dateend") String dateend,@Param("tname") String tname,@Param("title") String title,@Param("outline") String outline,@Param("startqj") int startqj,@Param("endqj") int endqj) throws ParseException{
			List<Schedule> list=new ArrayList<Schedule>();
			for (int i = 0; i < clzss.length; i++) {
				Schedule schedule=new Schedule();
				schedule.setCid(clzss[i]);
				schedule.setDatestart(datestart);
				schedule.setDateend(dateend);
				schedule.setOutline(outline);
				schedule.setTitle(title);
				schedule.setTname(tname);
				schedule.setStartqj(startqj);
				schedule.setEndqj(endqj);
				list.add(schedule);
			}		
			int count=zbcService.insertSchedule(list);
			return count;
		}
	@RequestMapping("/TocourseArrange")
	public String TocourseArrange() {
		return "courseArrange";
	}
	//生成课表
	@RequestMapping("/AddClazzSchedule")
	@ResponseBody
	public int AddClazzSchedule(@Param("clzss") int clzss,@Param("datestart") String datestart,@Param("dateend") String dateend){
		List<ClazzSchedule> list=new ArrayList<ClazzSchedule>();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		Date d1;
		Date d2;
		try {
			d1 = sdf.parse(datestart);
			d2=sdf.parse(dateend);
			long daysBetween=(d2.getTime()-d1.getTime()+1000000)/(60*60*24*1000)+1;
			//System.out.println("共计 "+daysBetween+" 天");
			//System.out.println(clzss);			
				Calendar begin=Calendar.getInstance();
				begin.setTime(d1);//给定起始时间		
				for (int j = 0; j <daysBetween; j++) {
					String dt=sdf.format(begin.getTime());
					ClazzSchedule clazzSchedule=new ClazzSchedule();
					clazzSchedule.setDatetime(dt);
					clazzSchedule.setCid(clzss);
					clazzSchedule.setApm(0);
					ClazzSchedule clazzSchedule1=new ClazzSchedule();
					clazzSchedule1.setDatetime(dt);
					clazzSchedule1.setCid(clzss);
					clazzSchedule1.setApm(1);
					list.add(clazzSchedule);
					list.add(clazzSchedule1);
					begin.add(Calendar.DAY_OF_MONTH, 1);
				}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
			int count=zbcService.insertClazzSchedule(list);
			//查询出当前周的日程安排
			Schedule record=new Schedule();
			record.setCid(clzss);
			record.setDatestart(datestart);
			record.setDateend(dateend);
			List<Schedule> slist=zbcService.queryByTime(record);
			//循环绑定日程
			for (Schedule sd : slist) {
				//System.out.println("日程id"+sd.getScheduleid()+"日程班级"+sd.getCid()+sd.getDatestart()+sd.getDateend()+sd.getStartqj()+sd.getEndqj());
				Date d3;
				Date d4;
				try {
					d3 = sdf.parse(sd.getDatestart());
					d4=sdf.parse(sd.getDateend());
					long daysBetween1=(d4.getTime()-d3.getTime()+1000000)/(60*60*24*1000)+1;
					Calendar begin=Calendar.getInstance();
					begin.setTime(d3);//给定起始时间
					for (int j = 0; j <daysBetween1; j++) {
						String dt=sdf.format(begin.getTime());
						if(j==0 && sd.getStartqj()==1) {							
							ClazzSchedule clazzSchedules=new ClazzSchedule();
							clazzSchedules.setScheduleid(sd.getScheduleid());
							clazzSchedules.setCid(sd.getCid());
							clazzSchedules.setDatetime(dt);
							clazzSchedules.setApm(1);
							zbcService.updateClazzSchedule(clazzSchedules);
						}else if(j==daysBetween1-1 && sd.getEndqj()==0) {
							ClazzSchedule clazzSchedules=new ClazzSchedule();
							clazzSchedules.setScheduleid(sd.getScheduleid());
							clazzSchedules.setCid(sd.getCid());
							clazzSchedules.setDatetime(dt);
							clazzSchedules.setApm(1);
							zbcService.updateClazzSchedule(clazzSchedules);
						}else{
							ClazzSchedule clazzSchedule=new ClazzSchedule();
							clazzSchedule.setScheduleid(sd.getScheduleid());
							clazzSchedule.setCid(sd.getCid());
							clazzSchedule.setDatetime(dt);
							clazzSchedule.setApm(0);
							zbcService.updateClazzSchedule(clazzSchedule);
							ClazzSchedule clazzSchedules=new ClazzSchedule();
							clazzSchedules.setScheduleid(sd.getScheduleid());
							clazzSchedules.setCid(sd.getCid());
							clazzSchedules.setDatetime(dt);
							clazzSchedules.setApm(1);
							zbcService.updateClazzSchedule(clazzSchedules);
						}					
						begin.add(Calendar.DAY_OF_MONTH, 1);
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		return count;
	}
	//查下次要排课的时间
	@RequestMapping("/selectNextTime")
	@ResponseBody
	public	List<Object> selectNextTime(int bid) throws ParseException {
		ClazzSchedule clazzSchedule=zbcService.selectByClazzSchedulecid(bid);
		String nextTime=null;
		List<Object> list=new ArrayList<Object>();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		Calendar begin=Calendar.getInstance();
		Calendar begin1=Calendar.getInstance();
		if(clazzSchedule!=null) {			
			nextTime=clazzSchedule.getDatetime();			
			Date d1=sdf.parse(nextTime);			
			begin.setTime(d1);//给定起始时间	
			begin.add(Calendar.DAY_OF_MONTH, 1);			
			nextTime=sdf.format(begin.getTime());
			begin1.setTime(sdf.parse(nextTime));
			begin1.add(Calendar.DAY_OF_MONTH, 6);
			//System.out.println("下次要排课的日期:"+nextTime);
			//System.out.println("下次要排课的截至日期:"+sdf.format(begin1.getTime()));
			list.add(nextTime);
			list.add(sdf.format(begin1.getTime()));	
		}		
		return list;
	}
	//渲染课表
	@RequestMapping("/queryClazzSchedule")
	@ResponseBody
	public List<ClazzSchedule> queryClazzSchedule(@Param("cid")Integer cid,@Param("datetime1")String datetime1,@Param("datetime2")String datetime2){
		List<ClazzSchedule> list=zbcService.queryClazzSchedule(cid, datetime1, datetime2);
		return list;
	}
	@RequestMapping("/updateStatus")
	@ResponseBody
	public int updateStatus(@Param("cid")Integer cid,@Param("datetime1")String datetime1,@Param("datetime2")String datetime2) {
		int count=zbcService.updateStatus(cid, datetime1, datetime2);
		return count;
	}
	//重置教室
	@RequestMapping("/updateRoom")
	@ResponseBody
	public int updateRoom(){
		int count=zbcService.updateRooms();
		return count;
	}
	//添加版本
	@RequestMapping("/insertVession")
	@ResponseBody
	public int insertVession(String vname) {
		int count=zbcService.addVession(vname);
		return count;
	}
	//添加年级
	@RequestMapping("/insertVG")
	@ResponseBody
	public int insertVG(String gname,int vid) {
		Grade grade=new Grade();
		grade.setGname(gname);
		zbcService.insertGrade(grade);
		VessionGrade vg=new VessionGrade();
		vg.setGid(grade.getGid());
		vg.setVid(vid);
		int count=zbcService.insertVG(vg);
		return count;
	}
	//显示所有正常状态班级
	@RequestMapping("/clazzStatus")
	@ResponseBody
	public List<Clazz> clazzStatus(){
		List<Clazz> list=zbcService.queryAllclazz();
		return list;
	}
	//根据cid查出最近的一周
	@RequestMapping("/clazzTime")
	@ResponseBody
	public List<ClazzSchedule> clazzTime(Integer cid){
		List<ClazzSchedule> list=zbcService.queryBycids(cid);
		return list;
	}
	//查询课表
	@RequestMapping("/queryClazzSchedule1")
	@ResponseBody
	public List<ClazzSchedule> queryClazzSchedule1(@Param("cid")Integer cid,@Param("datetime1")String datetime1,@Param("datetime2")String datetime2){
		List<ClazzSchedule> list=zbcService.queryClazzSchedule1(cid, datetime1, datetime2);
		return list;
	}
	//查询班级数据
	@RequestMapping("/queryClazzs")
	@ResponseBody
	public List<Clazz> queryClazzs(){
		List<Clazz> list=zbcService.queryClazzs();
		return list;				
	}
	//班级详细
	@RequestMapping("/clazzstu")
	@ResponseBody
	public List<ClazzStudent> clazzstu(Integer cid){
		List<ClazzStudent> list=zbcService.queryByClzStucid(cid);
		return list;
	}
	//查所有班级职位
	@RequestMapping("/clazzpositions")
	@ResponseBody
	public List<Clazzposition> clazzposition(){
		List<Clazzposition> list=zbcService.queryAllclazzpositions();
		return list;
	}
	//查看单个学生信息
	@RequestMapping("/stuinfos")
	@ResponseBody
	public Studentinfo stuinfos(Integer sid) {
		Studentinfo stu=zbcService.queryBystusid(sid);
		return stu;
	}
	//修改学生信息
	@RequestMapping("/updatestu")
	@ResponseBody
	public int updatestu(Studentinfo stu) {
		int count=zbcService.updateStudentinfo(stu);
		return count;
	}
	//班委任免
	@RequestMapping("/clazzposition")
	@ResponseBody
	public int clazzposition(ClazzStudent clz) {
		int count=zbcService.updateclazzStudent(clz);
		return count;
	}
	//新增学员
	@RequestMapping("/addStudent")
	@ResponseBody
	public int addStudent(Studentinfo stu,int cid) {
		int count=zbcService.insertStudentinfo(stu);
		ClazzStudent cs=new ClazzStudent();
		cs.setCid(cid);
		cs.setSid(stu.getSid());
		int count1=zbcService.insertclazzStudentinfos(cs);
		return count1;
	}
}



