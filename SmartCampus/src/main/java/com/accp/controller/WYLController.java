package com.accp.controller;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Clazz;
import com.accp.domain.Course;
import com.accp.domain.CourseTeacher;
import com.accp.domain.Staff;
import com.accp.domain.Studentinfo;
import com.accp.service.WYLService;

@Controller
public class WYLController {
	
	@Autowired
	WYLService wylService;
	
	//自动开班
	@RequestMapping("/automaticClass")
	@ResponseBody
	public List<Clazz> automaticClass(CourseTeacher courseTeacher,Clazz clazz){
		System.out.println("预生成班级");
		//报名人数
		int sl = wylService.studentQuantity();
		int cnr = wylService.studentQuantity2();
		int wcnr = sl-cnr;
		int zu = (int)sl/20;
		System.out.println(zu);
		int rs = sl/zu;
		System.out.println(rs);
		for (int i = 0; i < zu; i++) {
			int count = 0;
			int a = 0;
			int b = 0;
			//报名学生信息
			List<Studentinfo> list = wylService.queryAllStudent();
			//获取三天后的时间
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(new Date());
			calendar.add(Calendar.DATE, 3);
			Date date=calendar.getTime();
			System.out.println(date);
			//班级的名称
			int mc = wylService.mc();
			String mc2=(mc+1)+"班";
			System.out.println(mc2);
			//创建班级
	        clazz.setCname(mc2);
	        clazz.setStarttime(date);
	        wylService.insert2(clazz);
	        int clazzid=clazz.getCid();
			System.out.println("班级id："+clazzid);
			if(i==zu-1) {
				for (int k = 0; k < sl; k++) {
					if(list.get(count).getStatus2()==0) {
						wylService.updateStudent6(list.get(count).getSid());
						wylService.clazzStudentinsert(clazzid, list.get(count).getSid());
					}
					count++;
				}
			}else {
				for (int j = 0; j < rs;) {
					if(list.get(count).getStatus2()==0) {
						if(list.get(count).getAge()>17) {
							if(a < cnr/zu) {
								wylService.updateStudent6(list.get(count).getSid());
								wylService.clazzStudentinsert(clazzid, list.get(count).getSid());
								a++;
								j++;
								count++;
								continue;
							}
						}else {
							if(b < wcnr/zu) {
								wylService.updateStudent6(list.get(count).getSid());
								wylService.clazzStudentinsert(clazzid, list.get(count).getSid());
								b++;
								j++;
								count++;
								continue;
							}
						}
						if(a==cnr/zu && b==wcnr/zu) {
							wylService.updateStudent6(list.get(count).getSid());
							wylService.clazzStudentinsert(clazzid, list.get(count).getSid());
							j++;
						}
					}
					count++;
				}
			}
			Staff staff = wylService.queryStaff2();
			courseTeacher.setTid(staff.getTid());
			courseTeacher.setCourseid(1);
			wylService.courseTeacherinsert(courseTeacher);
			System.out.println(courseTeacher.getCtid());
			int ctid=courseTeacher.getCtid();
			
			wylService.clazzTeacherinsert(ctid, clazzid);
			
			staff = wylService.queryStaff2();
			courseTeacher.setTid(staff.getTid());
			courseTeacher.setCourseid(12);
			wylService.courseTeacherinsert(courseTeacher);
			System.out.println(courseTeacher.getCtid());
			ctid=courseTeacher.getCtid();
			
			wylService.clazzTeacherinsert(ctid, clazzid);
			
			staff = wylService.queryStaff3();
			wylService.updateClazz(staff.getTid(), clazzid);
		}
		return null;
	}
	
	//添加班级，学生等数据
	@RequestMapping("/offerAcourse")
	public String offerAcourse(CourseTeacher courseTeacher,Clazz clazz,String mc,String rq,String js,Integer id,Integer id2,Integer id3,Integer id11,Integer id22) throws ParseException {
		System.out.println("添加班级，学生等数据");
		
		clazz.setCname(mc);
		clazz.setTid(id3);
		SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		clazz.setStarttime(sdf1.parse(rq));
		clazz.setIntroduce(js);
		wylService.insert(clazz);
		System.out.println(clazz.getCid());
		int clazzid=clazz.getCid();
		
		courseTeacher.setTid(id);
		courseTeacher.setCourseid(id11);
		wylService.courseTeacherinsert(courseTeacher);
		System.out.println(courseTeacher.getCtid());
		int ctid=courseTeacher.getCtid();
		
		wylService.clazzTeacherinsert(ctid, clazzid);
		
		courseTeacher.setTid(id2);
		courseTeacher.setCourseid(id22);
		wylService.courseTeacherinsert(courseTeacher);
		System.out.println(courseTeacher.getCtid());
		ctid=courseTeacher.getCtid();
		
		wylService.clazzTeacherinsert(ctid, clazzid);
		
		List<Studentinfo> list = wylService.queryStudent2();
		for (Studentinfo studentinfo : list) {
			wylService.clazzStudentinsert(clazzid, studentinfo.getSid());
		}
		
		wylService.updateStudent5();
		
		System.out.println("新建班级成功！");
		
		return "redirect:Tomain";
	}
	
	//查询所有教员，老师
	@RequestMapping("/queryAllStaff")
	@ResponseBody
	public List<Staff> queryAllStaff(int postId){
		System.out.println("查询所有教员，老师");
		List<Staff> list = wylService.queryAllStaff(postId);
		return list;
	}
	
	//查询8.0版本S1的课程
	@RequestMapping("/queryAllCourse")
	@ResponseBody
	public List<Course> queryAllCourse(){
		System.out.println("查询8.0版本S1的课程");
		List<Course> list = wylService.queryAllCourse();
		return list;
	}
	
	//按条件查询教员，老师
	@RequestMapping("/queryStaff")
	@ResponseBody
	public List<Staff> queryStaff(Integer postId,Integer tid, String tname, Integer age1, Integer age2, Integer sex, Integer characterId){
		System.out.println("按条件查询教员，老师");
		System.out.println("1"+tid);
		System.out.println("2"+tname);
		System.out.println("3"+age1);
		System.out.println("4"+age2);
		System.out.println("5"+sex);
		System.out.println("6"+characterId);
		List<Staff> list = wylService.queryStaff(postId,tid, tname, age1, age2, sex, characterId);
		return list;
	}
	
	//查询所有学生
	@RequestMapping("/queryAllStudent")
	@ResponseBody
	public List<Studentinfo> queryAllStudent(){
		System.out.println("查询所有学生");
		List<Studentinfo> list = wylService.queryAllStudent();
		return list;
	}
	
	//按条件查询学生
	@RequestMapping("/queryStudent")
	@ResponseBody
	public List<Studentinfo> queryStudent(String sname, Integer age1, Integer age2, Integer sex, Integer characterId){
		System.out.println("按条件查询学生");
		System.out.println("1"+sname);
		System.out.println("2"+age1);
		System.out.println("3"+age2);
		System.out.println("4"+sex);
		System.out.println("5"+characterId);
		List<Studentinfo> list = wylService.queryStudent(sname, age1, age2, sex, characterId);
		return list;
	}
	
	//修改学员选择状态为1
	@RequestMapping("/updateStudent1")
	@ResponseBody
	public String updateStudent1(int sid){
		System.out.println("修改选择状态为1");
		wylService.updateStudent1(sid);
		return null;
	}
	
	//修改学员选择状态为0
	@RequestMapping("/updateStudent2")
	@ResponseBody
	public String updateStudent2(int sid){
		System.out.println("修改选择状态为0");
		wylService.updateStudent2(sid);
		return null;
	}
	
	//批量修改学员选择状态为1
	@RequestMapping("/updateStudent3")
	@ResponseBody
	public String updateStudent3(){
		System.out.println("批量修改选择状态为1");
		wylService.updateStudent3();
		return null;
	}
	
	//批量修改学员选择状态为0
	@RequestMapping("/updateStudent4")
	@ResponseBody
	public String updateStudent4(){
		System.out.println("批量修改选择状态为0");
		wylService.updateStudent4();
		return null;
	}
	
	//手动开班页面
	@RequestMapping("/TomanualOperation")
	public String TomanualOperation() {
		return "manualOperation";
	}
	
	//选择老师，教员页面
	@RequestMapping("/TomanualOperation2")
	public String TomanualOperation2(String mc,String rq,String js,Model model) {
		model.addAttribute("mc", mc);
		model.addAttribute("rq", rq);
		model.addAttribute("js", js);
		return "manualOperation2";
	}
	
	//自动开班页面
	@RequestMapping("/ToautoStart")
	public String ToautoStart(Model model) {
		int sl = wylService.studentQuantity();
		model.addAttribute("sl", sl);
		return "autoStart";
	}
}
