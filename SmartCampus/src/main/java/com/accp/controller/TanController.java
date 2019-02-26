package com.accp.controller;

import java.util.List;

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
import com.accp.domain.ExaminationFb;
import com.accp.domain.ExaminationTm;
import com.accp.domain.Floor;
import com.accp.domain.Havetask;
import com.accp.domain.Havetaskexam;
import com.accp.domain.Parents;
import com.accp.domain.Studentinfo;
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
	
	
	/*@RequestMapping("/tomain")
	public String tomain() {
		return "main";
	}
	@RequestMapping("/tonav")
	public String tonav() {
		return "nav";
	}*/
	
	@RequestMapping("/toDataStatistics")
	public String toDataStatistics(Model model,Integer sid) {
		//学员考试考勤数据
		if(sid==null) {
			sid=1;//默认值
		}
		System.out.println("个人主页--sid:"+sid);
		//基本信息 班级+年级
		Studentinfo stuobj=stuservice.selectallinfo(sid);
		model.addAttribute("stuobj", stuobj);
		//参与的考试信息
		List<Havetaskexam> elist=einfoservice.examscoreBysid(sid);
		model.addAttribute("elist", elist);
		AttenceCount acount=ainfoservice.selectattenceBysidlx(sid);
		model.addAttribute("acount", acount);
		//System.out.println("进入MyController");
		return "datastatistics/dataStatistics";
	}
	
	/*@RequestMapping("/test")
	public String test(Model model) {
		//测试
		if(sid==null) {
			sid=1;//默认值
		}
//		einfoservice.examscoreBysid(sid);
//		List<ExaminationTm> etimlist=einfoservice.selectexamtimByexamid(examinationId);
//		model.addAttribute("etimlist", etimlist);
		return "datastatistics/dataStatistics3";
	}*/
	
	@RequestMapping("/toupclazzStudent")
	public String toupclazzStudent(Model model) {
		//升学鉴定表
		Integer[] sid2= {104,105,106,107}; 
		System.out.println("可以升学的sid");
		/*for (int i = 0; i < sid2.length; i++) {
			System.out.println(sid2[i]);
		}*/
		List<ClazzStudentExamInfo> uplist=einfoservice.canupclazzStudentexaminfo(sid2);
		model.addAttribute("uplist", uplist);
		return "datastatistics/dataStatistics6";
	}
	
	@RequestMapping("/toteachercourse")
	public String toteachercourse() {
		//教员上课课时信息统计
		return "datastatistics/dataStatistics4";
	}
	@RequestMapping("/teacherCoursetimeInfo")
	@ResponseBody
	public List<CourseTeacher> teacherCoursetimeInfo(Integer datetime){
		System.out.println("月："+datetime);
		Integer tid=2;
		System.out.println("tid:"+tid);
		List<CourseTeacher> list=coteaservice.selectTeachercoursetime(tid, datetime);
		return list;
	}
	
	@RequestMapping("/toexamtiminfo")
	public String toexamtiminfo(Model model,Integer examinationId) {
		//一套试卷的详细题目信息(教员出的所有试卷)
		if(examinationId==null) {
			examinationId=1;//默认值
		}
		List<ExaminationTm> etimlist=einfoservice.selectexamtimByexamid(examinationId);
		for (ExaminationTm e : etimlist) {
			System.out.println("--"+e.getMistakecount()+"-"+e.getTopic_id()+"--"+e.getTopicobj().getTopic_name());
			//System.out.println(e.getTopicobj().getSeobj().getSectionName());
		}
		model.addAttribute("etimlist", etimlist);
		return "datastatistics/dataStatistics5";
	}
	
	@RequestMapping("/toshow")
	public String toshow(Model model,Integer cid) {
		//班级考试考勤数据
		if(cid==null) {
			cid=1;//默认值
		}
		//System.out.println("班级主页---cid:"+cid);
		Clazz clzobj=cservice.selectclazzBycid(cid);
		model.addAttribute("clzobj", clzobj);
		//学员考试
		List<ClazzStudentExamInfo> clslist=einfoservice.selectstudentexamBycid(cid);
		model.addAttribute("clslist", clslist);
		//学员考勤
		List<ClazzStudent> clsattencelist=ainfoservice.selectallstuattenceBycid(cid);
		model.addAttribute("clsattencelist", clsattencelist);
		//System.out.println("进入MyController");
		return "datastatistics/dataStatistics2";
	}
	
	
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
