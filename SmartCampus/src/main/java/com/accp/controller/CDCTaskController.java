package com.accp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Attence;
import com.accp.domain.CdcTask;
import com.accp.domain.Clazz;
import com.accp.domain.Leave;
import com.accp.domain.Login;
import com.accp.domain.PageBean;
import com.accp.domain.Staff;
import com.accp.domain.Studentinfo;
import com.accp.domain.Task;
import com.accp.domain.TaskMiddle;
import com.accp.domain.TaskStage;
import com.accp.service.CDCAttenceService;
import com.accp.service.impl.CDCTaskServiceImpl;

@Controller
public class CDCTaskController {
	@Autowired
	HttpSession session;
	
	@Autowired
	CDCTaskServiceImpl taskService;
	
	@Autowired
	CDCAttenceService cdcAttenceService;
	
	@RequestMapping("Entermain")
	public String Entermain() {
		return "nav";
	}
//	进入任务页面查看
	@RequestMapping("EnterqueryTask")
	public String EnterqueryTask() {		
		return "task";
	}
//	进入发布页面
	@RequestMapping("fbTask")
	public String fbTask() {
		
		return "fbtask";
	}
//	进入请假页面
	@RequestMapping("leave")
	public String leave() {
		
		return "leave";
	}
//	进入请假审核页面
	@RequestMapping("check")
	public String check() {
		return "check";
	}
	
//	根据登录人不同所进如不同页面 查看不同数据
	@RequestMapping("/queryTask")
	@ResponseBody
	public List<TaskMiddle> queryTask(Model model) {	
		System.out.println("进入方法");
		List<TaskMiddle> list = null;
//		Login login = (Login)session.getAttribute("");
//	先进行人员类型判断 判断为员工还是学员 0为学员 1为员工
		int type = 1;
//		int ryid = login.getPeopleid();
		int ryid = 2;
//		当他是学员登录时
		if(type==0) {
			System.out.println("进入学员");
			list = taskService.querytask_Middle1(ryid);
			for (TaskMiddle t : list) {
					t.setPublisher(taskService.queryStaffbyId(t.getPublisherId()));
					t.setStudentInfo(taskService.queryStudentinfobyId(t.getRyId()));
					t.setCdcTask(taskService.queryCdcTaskbyId(t.getTaskId()));
			}
			model.addAttribute("list", list);
			System.out.println(list);
			for (TaskMiddle t : list) {
				System.out.println(t.getCdcTask().getTaskName());
				System.out.println(t.getStudentInfo().getSname());
				System.out.println(t.getPublisherId());
//				System.out.println(t.getPublisher().getTname());
			}
		}
//			否则都是员工登录
		else if(type==1) {
			System.out.println("进入员工");
//			员工 的类型 教员 班主任 管理员 门卫
			Staff staff = taskService.queryStaffbyId(ryid);
			int stfftype = staff.getPostid();
//			为0 后勤
			if(stfftype==0) {
				list = taskService.querytask_Middle3(ryid);
				for (TaskMiddle t : list) {
					t.setPublisher(taskService.queryStaffbyId(t.getPublisherId()));
					t.setStaff(taskService.queryStaffbyId(t.getRyId()));
					t.setCdcTask(taskService.queryCdcTaskbyId(t.getTaskId()));
				}
//			1教员
			}else if(stfftype==1) {
				list = taskService.querytask_Middle2(ryid);
				for (TaskMiddle t : list) {
					t.setPublisher(taskService.queryStaffbyId(t.getPublisherId()));
					t.setStudentInfo(taskService.queryStudentinfobyId(t.getRyId()));
					t.setCdcTask(taskService.queryCdcTaskbyId(t.getTaskId()));
				}
			}
//			2班主任
			else if(stfftype==2) {
				list = taskService.querytask_Middle2(ryid);
				for (TaskMiddle t : list) {
					t.setPublisher(taskService.queryStaffbyId(t.getPublisherId()));
					t.setStudentInfo(taskService.queryStudentinfobyId(t.getRyId()));
					t.setCdcTask(taskService.queryCdcTaskbyId(t.getTaskId()));
				}
			}
//			3管理员 
			else if(stfftype==3) {
				list = taskService.querytask_Middle();
				for (TaskMiddle t : list) {
					if(t.getState()==0) {
					t.setStudentInfo(taskService.queryStudentinfobyId(t.getRyId()));
					}else {
					t.setStaff(taskService.queryStaffbyId(t.getRyId()));
					}	
					t.setCdcTask(taskService.queryCdcTaskbyId(t.getTaskId()));
					t.setPublisher(taskService.queryStaffbyId(t.getPublisherId()));
				}
			}
				
		}
			return list;
		
	}
	@RequestMapping("cdcEnterrichang")
	public String cdcEnterrichang() {
		return "richang";
	}
	
	@RequestMapping("cdcpage")
	@ResponseBody
	public PageBean cdcpage(int currpage,String name,String begin,String end){		
		PageBean page = cdcAttenceService.queryByWhereForPage(name, begin, end,currpage);	
		return page;
	}
	
//	按任务ID查询任务阶段	
	@RequestMapping("queryTaskStageByTaskId")
	@ResponseBody
	public List<TaskStage> queryTaskStageByTaskId(int taskId){
		List<TaskStage> list = taskService.queryTaskStageByTaskId(taskId);
		return list;		
	}
	
	@RequestMapping("queryClazzByCname")
	@ResponseBody
	public List<Clazz> queryClazzByCname(int gid){
		List<Clazz> list = taskService.queryClazzByCname(gid);
		return list;
	}

	@RequestMapping("queryStudentBySid")
	@ResponseBody
	public List<Studentinfo> queryStudentBySid(int cid){
		List<Studentinfo> list = taskService.queryStudentBySid(cid);
		return list;
	}

	@RequestMapping("queryStaffNoAdmin")
	@ResponseBody
	public List<Staff> queryStaffNoAdmin(){
		List<Staff> list = taskService.queryStaffNoAdmin();
		return list;
	}

	@RequestMapping("queryClazzbytid")
	@ResponseBody
	public List<Clazz> queryClazzbytid(){
		int tid = 1;
//		tid是获取当前登录教师的用户对象的Id
		List<Clazz> list = taskService.queryClazzbytid(tid);
		return list;
	}
//	发布任务
	@RequestMapping(value="xz",produces="application/json;charset=utf-8")
	@ResponseBody
	public void xinzen(@RequestBody CdcTask task) {
		taskService.insertCdcTask(task);		
	}
//	请假申请
	@RequestMapping("insertLeave")
	@ResponseBody
	public void insertLeave(Leave leave) {
//		从登陆获取到当前登录人员类型
		int type = 1;
//		从session获取到当前登录人员Id
		int ryId = 1;
//		0为学员请假，其他为员工请假
		if(type==0) {
			leave.setStudentid(ryId);
			leave.setTeacher(cdcAttenceService.queryClazzbysid(ryId).getTid());
			leave.setType(0);
			cdcAttenceService.insertLeave(leave);
		}else {
			leave.setStudentid(ryId);
//			员工id9为教务专门批准请假的
			leave.setType(1);
			leave.setTeacher(9);
			cdcAttenceService.insertLeave(leave);
		}	
	}
//	查询到需要批准的请假条
	@RequestMapping("queryLeaveByTeaId")
	@ResponseBody
	public List<Leave> queryLeaveByTeaId(){
//		从session获取到当前登录人员Id
		int ryId = 1;
		List<Leave> list = cdcAttenceService.queryLeaveByTeaId(ryId);
		for (Leave l : list) {
//			0为学员请假 1为员工请假
			if(l.getType()==0) {
				l.setStu(taskService.queryStudentinfobyId(l.getStudentid()));
			}else if(l.getType()==1) {
				l.setSta(taskService.queryStaffbyId(l.getStudentid()));
			}
		}
		return list;
	}
}
