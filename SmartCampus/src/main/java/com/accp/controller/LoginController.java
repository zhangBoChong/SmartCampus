package com.accp.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Button;
import com.accp.domain.Information;
import com.accp.domain.Login;
import com.accp.domain.PageBean;
import com.accp.domain.Parents;
import com.accp.domain.Staff;
import com.accp.domain.Studentinfo;
import com.accp.service.ButtonService;
import com.accp.service.ButtonmiddleService;
import com.accp.service.InformationService;
import com.accp.service.LoginService;

/**
 * wzr--登录注册controller
 * @author Administrator
 *
 */
@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	InformationService informationService;
	
	@Autowired
	ButtonService buttonService;
	
	@Autowired
	ButtonmiddleService buttonmiddleService;
	
	
	//(批量)删除消息
	@RequestMapping(value="/deleteInformation",produces="application/json;charset=UTF-8")
	@ResponseBody
	public int deleteInformation(@RequestBody List<Information> check_val) {
		Integer count=0;
		for (Information information : check_val) {
			count = informationService.deleteInformation(information.getInformation_id());
		}
		return count;
	}
	
	//查询消息
	@RequestMapping(value="/selectInformation",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Information> selectInformation(HttpSession session){
		Login lo = (Login)session.getAttribute("u");
		List<Information> infoList = informationService.selectInformation(1,lo.getLoginId());
		return infoList;
	}
	
	//按information_id查询消息内容
	@RequestMapping(value="/queryByinformation_id",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Information> queryByinformation_id(Integer information_id){
		List<Information> infoList2= informationService.queryByinformation_id(information_id);
		return infoList2;
	}
	
	
	//去login.html
	@RequestMapping("/toLogin")
	public String toLogin(Integer type,Model model,HttpServletResponse response) throws IOException {
		/*response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();*/
		if(type!=null && type==1) {
			/*out.print("<script language='javascript'>alert('登录失败！');</script>");*/
			return "redirect:/toLogin";
		}
		return "login";
	}
	
	//登录
	@RequestMapping("/login")
	public String login(Model model,HttpSession session,String loginName,String pwd) {
		Login u = loginService.login(loginName, pwd);
		List<Information> informationList = new ArrayList<Information>();
		if(u!=null) {
			session.setAttribute("u", u);
			model.addAttribute("u", u);
			
			/*自动关联角色与按钮，即新增角色按钮中间表*/
			List<Button> bbList1 = buttonService.querybutton1(1);
			for(Button bb1 : bbList1) {
				int countx = buttonmiddleService.selectcountbuttonmiddle(bb1.getButtonid(), u.getRoleId());
				if(countx==0) {
					buttonmiddleService.insertbuttonmiddle(bb1.getButtonid(), u.getRoleId(), 1);
				}
			}
			
			
			/**
			 * 测试发布作业消息通知接口
			 */
			/*List<Information> information_sendeeListx = new ArrayList<>();
			for(int m=0;m<2;m++) {
				Information ii = new Information();
				if(m==0) {
					ii.setInformation_sendee(2);
				}
				if(m==1) {
					ii.setInformation_sendee(4);
				}
				information_sendeeListx.add(ii);
			}
			List<Information> information_sendeeList2 = new ArrayList<>();
			for(Information f:information_sendeeListx) {
				Information iv = new Information();
				iv.setInformation_sendee(f.getInformation_sendee());
				information_sendeeList2.add(iv);
			}
			informationService.publishbusywork(information_sendeeList2);
			System.out.println(information_sendeeList2);*/
			
			
			
			/**
			 * 登录消息通知
			 */
			Information info = new Information();
			info.setU_id(-1);//uid:-1为系统发布
			info.setDelete_id(1);//1为未删除状态
			info.setInformation_type(2);//2为登录提示消息
			info.setInformation_time(new Date());
			info.setInformation_sendee(u.getLoginId());
			info.setInformation_fetch(0);//0为已读，1为未读
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat(" yyyy-MM-dd E a hh:mm:ss");// 年-月-日 星期几 上、下午 时：分：秒 
			info.setInformation_content("尊敬的:"+u.getLoginName()+"用户，您于"+sdf.format(date)+"登录了一次该系统!<a href='towzr_information'>跳转>>></a>");
			informationList.add(info);
			informationService.insertInformation(informationList);
			return "redirect:/toMain";
		}
		return "redirect:/toLogin?type=1";
	}
	
	//退出登录
	@RequestMapping("/initLogin")
	public String initLogin(HttpSession session) {
		session.invalidate();
		return "redirect:/toLogin";
		
	}
	
	//去main.html
	@RequestMapping("/toMain")
	public String toMain(HttpSession session,Model model) {
		Login us=(Login)session.getAttribute("u");
		Information information_id = informationService.selectinformation_id(2, us.getLoginId());//2为登录提示消息
		List<Information> infoList12=null;
		if(information_id!=null) {
			infoList12 = informationService.queryByinformation_id(information_id.getInformation_id());
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E a hh:mm:ss");// 年-月-日 星期几 上、下午 时：分：秒
		if(infoList12!=null) {
			for(Information i:infoList12) {
				sdf.format(i.getInformation_time());
			}
			model.addAttribute("infoList12", infoList12);
		}
		model.addAttribute("us", us);
		return "main";
	}
	
	
	//去注册页面
	@RequestMapping("/toRegister")
	public String toRegister() {
		return "register";
	}
	
	//注册
	@RequestMapping("/register")
	public String register(Login l) {
		loginService.register(l);
		return "redirect:/toLogin";
	}
	
	//查询学生用户
	@RequestMapping(value="/selectStudentinfo",produces="application/json;charset=UTF-8")
	@ResponseBody
	public PageBean<Studentinfo> selectStudentinfo(int page4,String sname){
		return loginService.selectStudentinfo(page4, -1, sname);
	}
	
	//查询家长用户
	@RequestMapping(value="/selectParents",produces="application/json;charset=UTF-8")
	@ResponseBody
	public PageBean<Parents> selectParents(int page3,String pname){
		return loginService.selectParents(page3, -2, pname);
	}
	
	//查询家长用户
	@RequestMapping(value="/selectStaff",produces="application/json;charset=UTF-8")
	@ResponseBody
	public PageBean<Staff> selectStaff(int page2,String tname){
		return loginService.selectStaff(page2, -3, tname);
	}
	
}
