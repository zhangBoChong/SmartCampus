package com.accp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Course;
import com.accp.domain.Examination;
import com.accp.domain.ExaminationLx;
import com.accp.domain.Grade;
import com.accp.domain.Information;
import com.accp.domain.Login;
import com.accp.domain.Section;
import com.accp.domain.Task;
import com.accp.domain.TaskLx;
import com.accp.domain.Topic;
import com.accp.domain.TopicLx;
import com.accp.domain.TopicNeiRong;
import com.accp.domain.Vession;
import com.accp.domain.ZuoYeGuanLi;
import com.accp.service.InformationService;
import com.accp.service.LoginService;
import com.accp.service.WSHService;

@Controller
public class WSHController {
	
	@Autowired
	WSHService wshService;
	
	@Autowired
	InformationService informationService;
	
	@Autowired
	LoginService loginService;
	
	
	/*进入题库页面*/
	@RequestMapping("/wshTiKu")
	public String wshTiKu() {
		return "tiku";
	}
	
	/*进入作业管理页面*/
	@RequestMapping("/wshZuoYeGuanLi")
	public String wshZuoYeGuanLi() {
		return "zuoyeguanli";
	}
	
	/*进入作业管理页面*/
	@RequestMapping("/wshKaoShiGuanLi")
	public String wshKaoShiGuanLi() {
		return "kaoshiguanli";
	}
	
	
	/*查询题库下拉框版本条件*/
	@RequestMapping("/wshTiKuTiaoJianChaXun")
	@ResponseBody
	public List<Vession> wshTiKuTiaoJianChaXun() {
		List<Vession> vessionList = wshService.vessionQuery();
		return vessionList;
	}
	
	/*查询题库下拉框年级条件*/
	@RequestMapping("/wshTiKuTiaoJianChaXun2")
	@ResponseBody
	public List<Grade> wshTiKuTiaoJianChaXun2(Integer vid){
		List<Grade> gradeList = wshService.queryByVid(vid);
		return gradeList;
	}
	
	/*查询题库下拉框课程条件*/
	@RequestMapping("/wshTiKuTiaoJianChaXun3")
	@ResponseBody
	public List<Course> wshTiKuTiaoJianChaXun3(Integer vid, Integer gid){
		List<Course> courseList = wshService.queryByVidGid(vid, gid);
		return courseList;
	}
	
	/*查询题库下拉框章节条件*/
	@RequestMapping("/wshTiKuTiaoJianChaXun4")
	@ResponseBody
	public List<Section> wshTiKuTiaoJianChaXun4(Integer vid, Integer gid, Integer courseId){
		System.out.println("查询题库下拉框年级条件vid:"+vid);
		System.out.println("查询题库下拉框课程条件vid:"+gid);
		System.out.println("查询题库下拉框年级条件courseId:"+courseId);
		List<Section> sectionList = wshService.queryByVidGidCourseId(vid, gid, courseId);
		return sectionList;
	}
	
	/*查询题库下拉框题型条件*/
	@RequestMapping("/wshTiKuTiaoJianChaXun5")
	@ResponseBody
	public List<TopicLx> wshTiKuTiaoJianChaXun5(){
		List<TopicLx> topicLxList = wshService.queryTopicLx();
		return topicLxList;
	}
	
	/*查询题库下拉框难易度条件*/
	@RequestMapping("/wshTiKuTiaoJianChaXun6")
	@ResponseBody
	public List<Topic> wshTiKuTiaoJianChaXun6(){
		List<Topic> topicList = wshService.queryTopic();
		return topicList;
	}
	
	/*查询题库内容*/
	@RequestMapping("/wshTopicNeiRong")
	@ResponseBody
	public List<TopicNeiRong> wshTopicNeiRong(Integer vid, Integer gid, Integer courseId, Integer sectionId, Integer topic_lx_id, String topic_level){
		System.out.println("vid:"+vid);
		System.out.println("gid:"+gid);
		System.out.println("courseId:"+courseId);
		System.out.println("sectionId:"+sectionId);
		System.out.println("topic_lx_id:"+topic_lx_id);
		System.out.println("topic_level:"+topic_level);
		List<TopicNeiRong> pageBean = null;
		if (vid==0&&gid==0&&courseId==0&&sectionId==0&&topic_lx_id==0) {
			pageBean = wshService.queryByXiaLaKuangTiaoJian(null, null, null, null, null, null);
		}else {
			pageBean = wshService.queryByXiaLaKuangTiaoJian(vid, gid, courseId, sectionId, topic_lx_id, topic_level);
		}
		
		return pageBean;
	}
	
	/*删除题库题目*/
	@RequestMapping("/wshTopicDelete")
	@ResponseBody
	public int wshTopicDelete(int topic_id) {
		int count = wshService.deleteTopic(topic_id);
		return count;
	}
	
	/*新增题目*/
	@RequestMapping("/wshTopicInsert")
	@ResponseBody
	public int wshTopicInsert(Topic topic,String[] option_xx,int[] option_pd) {
		int count = wshService.insertTopic(topic);
		System.out.println("题目ID:"+topic.getTopic_id());
		int topic_id = topic.getTopic_id();
		System.out.println("option_xx数组:"+option_xx);
		System.out.println("option_pd数组:"+option_pd);
		for(int i=0;i<option_xx.length;i++) {
			wshService.insertOption(option_xx[i], option_pd[i], topic_id);
		}
		return count;
	}
	
	/**
	 * 根据题目id查询题目和题目答案
	 */
	@RequestMapping("/wshQueryByTopicId")
	@ResponseBody
	public TopicNeiRong wshQueryByTopicId(int topic_id) {
		System.out.println("wisixniasnioanfp:::"+topic_id);
		TopicNeiRong topicNeiRong = wshService.queryByTopicId(topic_id);
		System.out.println(topicNeiRong);
		return topicNeiRong;
	}
	
	
	/**
	 * 根据教员id查询作业管理的年级和班级
	 */
	@RequestMapping("/queryByZuoYeGuanLiByTid")
	@ResponseBody
	public List<ZuoYeGuanLi> queryByZuoYeGuanLiByTid(int tid){
		List<ZuoYeGuanLi> zuoYeGuanLiList = wshService.queryByZuoYeGuanLiByTid(tid);
		return zuoYeGuanLiList;
	}
	
	//根据年级、班级查询学生信息  ---作业管理
	@RequestMapping("/queryXueYuanZuoYeGuanLi")
	@ResponseBody
	public List<ZuoYeGuanLi> queryXueYuanZuoYeGuanLi(String gname, String cname){
		System.out.println("gname:"+gname);
		System.out.println("cname:"+cname);
		List<ZuoYeGuanLi> zuoYeGuanLiList2 = wshService.queryXueYuanZuoYeGuanLi(gname, cname);
		return zuoYeGuanLiList2;
	}
	
	
	//查询所有作业类型
	@RequestMapping("/queryZuoYeLeiXing")
	@ResponseBody
	public List<TaskLx> queryZuoYeLeiXing(){
		List<TaskLx> taskLxList = wshService.queryByAll();
		return taskLxList;
	}
	
	//查询所有考试类型
	@RequestMapping("/queryKaoShiLeiXing")
	@ResponseBody
	public List<ExaminationLx> queryKaoShiLeiXing(){
		List<ExaminationLx> examinationList = wshService.queryExaminationLx();
		return examinationList;
	}
	
	
	//作业
	@RequestMapping("/insertTask")
	@ResponseBody
	public int insertTask(Task task,int[] csId,int[] topic_id,int task_tm_xzt,int task_tm_wdt) {
		int count = wshService.insertTask(task);
		List<Information> xueYuanId = new ArrayList<>();
		for (int i = 0; i < csId.length; i++) {
				wshService.insertTaskFb(task.getTask_id(), csId[i]);
				Information in1 = new Information();
				Login ll1 = loginService.queryloginIds(csId[i], -1);
				in1.setInformation_sendee(ll1.getLoginId());
				xueYuanId.add(in1);
		}
		informationService.publishbusywork(xueYuanId);
		for (int i = 0; i < topic_id.length; i++) {
			wshService.insertTaskTm(topic_id[i], task.getTask_id(), task_tm_xzt, task_tm_wdt);
		}
		return count;
	}
	
	//考试
		@RequestMapping("/insertExa")
		@ResponseBody
		public int insertExa(Examination exa,int[] csId,int[] topic_id,int examination_tm_xzt,int examination_tm_wdt) {
			int count = wshService.insertExa(exa);
			List<Information> xueYuanId2 = new ArrayList<>();
			for (int i = 0; i < csId.length; i++) {
				wshService.insertExaFb(exa.getExamination_id(), csId[i]);
				Information in2 = new Information();
				Login ll2 = loginService.queryloginIds(csId[i], -1);
				in2.setInformation_sendee(ll2.getLoginId());
				xueYuanId2.add(in2);
			}
			informationService.publishexaminations(xueYuanId2);
			for (int i = 0; i < topic_id.length; i++) {
				wshService.insertExaTm(topic_id[i], exa.getExamination_id(), examination_tm_xzt, examination_tm_wdt);
			}
			return count;
		}
	
}
