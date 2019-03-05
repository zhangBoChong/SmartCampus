package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Clazz;
import com.accp.domain.ClazzSchedule;
import com.accp.domain.CourseTeacher;
import com.accp.mapper.ClazzMapper;
import com.accp.mapper.ClazzScheduleMapper;
import com.accp.mapper.CourseTeacherMapper;
import com.accp.service.CourseTeacherInfoService;

@Service
@Transactional
public class CourseTeacherInfoServiceImpl implements CourseTeacherInfoService{
	@Autowired
	CourseTeacherMapper cotmapper;
	@Autowired
	ClazzScheduleMapper clzschmapper;
	@Autowired
	ClazzMapper cmapper;
	
	
	public List<CourseTeacher> selectTeachercoursetime(Integer tid,Integer datetime){
		//班级现任教员信息(教员所带的班级)
		System.out.println("impl教员id："+tid);
		List<CourseTeacher> cotlist=cotmapper.chaclzteacherBytid(tid);
		for (CourseTeacher cot : cotlist) {
			System.out.println("所教的班级id=="+cot.getClzteacherobj().getCid());
			//各班上课的课时
			ClazzSchedule clzsch=clzschmapper.chateachertimeBymonthandcid(cot.getClzteacherobj().getCid(), datetime);
			cot.setClzscheduleobj(clzsch);
			System.out.println("班级名："+cot.getClzscheduleobj().getClzobj().getCname());
			System.out.println("---上课课时："+cot.getClzscheduleobj().getCoutime());
		}
		return cotlist;
	}


	@Override
	public List<CourseTeacher> chateachercourseclassBytidtan(Integer tid) {
		// 
		List<CourseTeacher> ctealist=cotmapper.chateachercourseclassBytidtan(tid);
		for (CourseTeacher ct : ctealist) {
			Clazz c=cmapper.selectBycid(ct.getClzteacherobj().getCid());
			ct.setClzobj(c);
		}
		return ctealist;
	}
	
}
