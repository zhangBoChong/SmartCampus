package com.accp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.AttenceCount;
import com.accp.domain.Classroom;
import com.accp.domain.Clazz;
import com.accp.domain.ClazzStudent;
import com.accp.domain.ClazzStudentExamInfo;
import com.accp.domain.CourseTeacher;
import com.accp.domain.Examination;
import com.accp.domain.ExaminationFb;
import com.accp.domain.ExaminationTm;
import com.accp.domain.Floor;
import com.accp.domain.Havetaskexam;
import com.accp.domain.Login;
import com.accp.domain.Parents;
import com.accp.domain.Staff;
import com.accp.domain.Studentinfo;
import com.accp.domain.TanClassinfo;
import com.accp.domain.TanStudentinfo;
import com.accp.service.AttenceInfoService;
import com.accp.service.ClassRoomService;
import com.accp.service.ClazzInfoService;
import com.accp.service.CourseTeacherInfoService;
import com.accp.service.ExaminationInfoService;
import com.accp.service.StudentinfoService;

@Controller
public class TanController {
	@Autowired
	StudentinfoService stuservice;
	@Autowired
	ExaminationInfoService einfoservice;
	@Autowired
	ClazzInfoService cservice;
	@Autowired
	AttenceInfoService ainfoservice;
	@Autowired
	CourseTeacherInfoService coteaservice;
	@Autowired
	ClassRoomService croomservice;
	
	@RequestMapping("/tomyindex")
	public String tomyindex(Model model,HttpSession session) {
		String path="";
		Login login=(Login)session.getAttribute("u");
		
		if(login.getType()==-3) {
			//tid教的班级
			System.out.println("员工登录用户id--"+login.getPeopleId());
			Staff staffobj=cservice.selectstaffclazz(login.getPeopleId());
			if(staffobj.getPostid()==2) {
				model.addAttribute("staffobj", staffobj);
				//班级
				path="datastatistics/dataStatistics2";
			}else if(staffobj.getPostid()==3) {
				//老师出的考试试卷
				List<Examination> sjlist=einfoservice.chaexamBytidtan(staffobj.getTid());
				model.addAttribute("sjlist", sjlist);
				List<CourseTeacher> kcteachlist=coteaservice.chateachercourseclassBytidtan(staffobj.getTid());
				model.addAttribute("kcteachlist", kcteachlist);
				path="datastatistics/dataStatistics5";
			}
		}else if(login.getType()==-1) {
			System.out.println("学生登录用户id--"+login.getPeopleId());
			//学生
			path="datastatistics/dataStatistics";
		}
		System.out.println("path--"+path);
		return path;
	}
	
	@RequestMapping("/toshowstudentinfoshuju")
	@ResponseBody
	public TanStudentinfo toshowstudentinfoshuju(HttpSession session) {
		//学员考试考勤数据
		Login login=(Login)session.getAttribute("u");
		Integer sid=login.getPeopleId();
		System.out.println("进入学生页面-sid--"+sid);
		if(sid==null) {
			sid=1;//默认值
		}
		//基本信息 班级+年级
		Studentinfo stuobj=stuservice.selectallinfo(sid);
		//参与的考试信息
		List<Havetaskexam> elist=einfoservice.examscoreBysid(sid);
		AttenceCount acount=ainfoservice.selectattenceBysidlx(sid);
		
		TanStudentinfo tans=new TanStudentinfo();
		tans.setStuobj(stuobj);
		tans.setElist(elist);
		tans.setAcount(acount);
		
		return tans;
	}
	
	
	@RequestMapping("/toshowaclazzinfo")
	@ResponseBody
	public TanClassinfo toshow(Integer cid) {
		//班级考试考勤数据
		if(cid==null) {
			cid=1;//默认值
		}
		Clazz clzobj=cservice.selectclazzBycid(cid);
		//学员考试
		List<ClazzStudentExamInfo> clslist=einfoservice.selectstudentexamBycid(cid);
		//学员考勤
		List<ClazzStudent> clsattencelist=ainfoservice.selectallstuattenceBycid(cid);
		
		TanClassinfo tanc=new TanClassinfo();
		tanc.setClzobj(clzobj);
		tanc.setClslist(clslist);
		tanc.setClsattencelist(clsattencelist);
		
		return tanc;
	}
	
	
	@RequestMapping("/tostudentjdreport")
	public String tostudentjdreport() {
		//升学鉴定表
		return "datastatistics/dataStatistics6";
	}
	@RequestMapping(value="/toupclazzStudent",produces="application/json;charset=utf-8")
	@ResponseBody
	public List<ClazzStudentExamInfo> toupclazzStudent(@RequestBody Integer[] sid) {
		//Integer[] sid2= {104,105,106,107}; 
		System.out.println("可以升学的sid");
		for (int i = 0; i < sid.length; i++) {
			System.out.println(sid[i]);
		}
		List<ClazzStudentExamInfo> uplist=einfoservice.canupclazzStudentexaminfo(sid);
		return uplist;
	}
	
	
	@RequestMapping("/toteachercourse")
	public String toteachercourse() {
		//教员上课课时信息统计
		return "datastatistics/dataStatistics4";
	}
	@RequestMapping("/teacherCoursetimeInfo")
	@ResponseBody
	public List<CourseTeacher> teacherCoursetimeInfo(HttpSession session,Integer datetime){
		System.out.println("月："+datetime);
		Login login=(Login)session.getAttribute("u");
		Integer tid=login.getPeopleId();
		//Integer tid=2;
		System.out.println("tid:"+tid);
		List<CourseTeacher> list=coteaservice.selectTeachercoursetime(tid, datetime);
		return list;
	}
	
	
	@RequestMapping("/toexamtiminfo")
	@ResponseBody
	public List<ExaminationTm> toexamtiminfo(Integer examinationId) {
		//一套试卷的详细题目信息(教员出的所有试卷)
		System.out.println("试卷id--"+examinationId);
		if(examinationId==null) {
			examinationId=1;//默认值
		}
		List<ExaminationTm> etimlist=einfoservice.selectexamtimByexamid(examinationId);
		for (ExaminationTm e : etimlist) {
			System.out.println("--"+e.getMistakecount()+"-"+e.getTopic_id()+"--"+e.getTopicobj().getTopic_name());
		}
		return etimlist;
	}
	
	
	/*-------------------------*/
	@RequestMapping("/toselectStudentinfo")
	public String toselectStudentinfo(Model model) {
		//查询所有新生
		List<Studentinfo> list=stuservice.selectBystatus();
		model.addAttribute("stulist", list);
		return  "querystudent";
	}
	@RequestMapping("/toaddstudent")
	public String toaddstudent() {
		return "addstudent";
	}
	@RequestMapping("/addStudentinfo")
	@ResponseBody
	public String addStudentinfo(String sname,Integer age,Integer sex,String education,String phone,String address,String pname,String phone2) {
		//新增学员信息
		//System.out.println(sname+"--"+sex+"--"+education+"--"+phone+"--"+address+"--"+pname+"--"+phone2);
		Studentinfo stu=new Studentinfo();
		stu.setSname(sname);
		stu.setAge(age);
		stu.setSex(sex);
		stu.setEducation(education);
		stu.setPhone(phone);
		stu.setAddress(address);
		Parents p=new Parents();
		p.setPname(pname);
		p.setPhone(phone2);
		int jg=stuservice.insertSelective(stu, p);
		String result="";
		if(jg>0) {
			result="1";
		}
		return result;
	}
	@RequestMapping("/selectBysid")
	public String selectBysid(Model model,Integer sid) {
		//学员详情
		Studentinfo stuobj=stuservice.selectBysid(sid);
		//System.out.println("sname="+stuobj.getSname()+"--pname="+stuobj.getPobj().getPname());
		model.addAttribute("stuobj", stuobj);
		return "changstudent";
	}
	@RequestMapping("/changeBysid")
	@ResponseBody
	public String changeBysid(Integer sid,String sname,Integer age,Integer sex,String education,String phone,String address,Integer pid,String pname,String phone2) {
		//学员信息修改
		Studentinfo stu=new Studentinfo();
		stu.setSid(sid);
		stu.setSname(sname);
		stu.setAge(age);
		stu.setSex(sex);
		stu.setEducation(education);
		stu.setPhone(phone);
		stu.setAddress(address);
		Parents p=new Parents();
		p.setPid(pid);
		p.setPname(pname);
		p.setPhone(phone2);
		int jg=stuservice.updateByPrimaryKeySelective(stu, p);
		String result="";
		if(jg>0) {
			result="1";
		}
		return result;
	}
	
	/*-------------------------------*/
	@RequestMapping("/toclassroom")
	public String toclassroom(Model model) {
		List<Floor> flist=croomservice.floorall();
		model.addAttribute("flist", flist);
		return "classroom";
	}
	@RequestMapping("/classroomInfo")
	@ResponseBody
	public List<Classroom> classroomInfo(Classroom cr){
		System.out.println("-教室信息查询条件-"+cr.getFloorid()+"--"+cr.getType()+"--"+cr.getStatus());
		List<Classroom> list=croomservice.classroominfo(cr);
		/*for (Classroom c : list) {
			System.out.println("-教室信息-"+c.getClassroomname()+"--"+c.getStatus());
		}*/
		return list;
	}
	@RequestMapping("/endclassroomname")
	@ResponseBody
	public Classroom endclassroomname(Integer fid) {
		System.out.println("fid:"+fid);
		Classroom room=croomservice.classroomnameEndByfid(fid);
		/*if(room!=null) {
			System.out.println("room:"+room.getClassroomname());
		}*/
		return room;
	}
	@RequestMapping("/addoneclassroom")
	@ResponseBody
	public int addoneclassroom(Classroom r) {
		return croomservice.classroominsert(r);
	}
	@RequestMapping("/addmoreclassroom")
	@ResponseBody
	public int addmoreclassroom(Integer reviewnub,Integer machinenub,Integer croomnub,Integer fid) {
		System.out.println("reviewnub:"+reviewnub+"-machinenub:"+machinenub+"-croomnub:"+croomnub+"fid--"+fid);
		return croomservice.classroomeadd( reviewnub, machinenub, croomnub,fid);
	}
	

}
