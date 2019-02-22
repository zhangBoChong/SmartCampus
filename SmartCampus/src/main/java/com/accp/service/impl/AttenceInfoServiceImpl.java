package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.AttenceCount;
import com.accp.domain.ClazzStudent;
import com.accp.mapper.AttenceMapper;
import com.accp.mapper.ClazzStudentMapper;
import com.accp.service.AttenceInfoService;

@Service
@Transactional
public class AttenceInfoServiceImpl implements AttenceInfoService{
	@Autowired
	AttenceMapper amapper;
	@Autowired
	ClazzStudentMapper clsmapper;
	
	@Override
	public AttenceCount selectattenceBysidlx(Integer studentid) {
		//1正常、2迟到早退、3旷课、4请假
		int normalcount=amapper.selectattenceBysidlx(studentid, 1);
		int latecount=amapper.selectattenceBysidlx(studentid, 2);
		int truant=amapper.selectattenceBysidlx(studentid, 3);
		int vacate=amapper.selectattenceBysidlx(studentid, 4);
		AttenceCount acount=new AttenceCount(normalcount,latecount,truant,vacate);
		return acount;
	}
	
	public List<ClazzStudent> selectallstuattenceBycid(Integer cid){
		//一个班级内所有学员的考勤信息
		List<ClazzStudent> list=clsmapper.clazzallstudentBycid(cid);
		for (ClazzStudent c : list) {
			AttenceCount acountobj=this.selectattenceBysidlx(c.getSid());
			c.setAcountobj(acountobj);
		}
		return list;
	}
}
