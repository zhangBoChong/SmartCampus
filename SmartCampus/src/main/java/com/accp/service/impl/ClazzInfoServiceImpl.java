package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Clazz;
import com.accp.domain.ClazzStudent;
import com.accp.mapper.ClazzMapper;
import com.accp.mapper.ClazzStudentMapper;
import com.accp.service.ClazzInfoService;

@Service
@Transactional
public class ClazzInfoServiceImpl implements ClazzInfoService{
	@Autowired
	ClazzMapper cmapper;
	@Autowired
	ClazzStudentMapper clsmapper;
	
	/**
	 * 班级信息（班级名、班主任、年级+版本、班级总人数）
	 */
	@Override
	public Clazz selectclazzBycid(Integer cid) {
		//班级在读总人数
		int clazzstudentnub=clsmapper.clazzstudentrshu(cid);
		Clazz clz=cmapper.selectclazzBycid(cid);
		clz.setClazzstudentnub(clazzstudentnub);
		//System.out.println("班级在读总人数:"+clazzstudentnub+"---"+clz.getClazzstudentnub());
		return clz;
	}
	
	/**
	 * 班级所有学员的所有考试信息
	 */
	@Override
	public List<ClazzStudent> clazzallstudentBycid(Integer cid) {
		// TODO Auto-generated method stub
		List<ClazzStudent> list=clsmapper.clazzallstudentBycid(cid);
		return list;
	}

}
