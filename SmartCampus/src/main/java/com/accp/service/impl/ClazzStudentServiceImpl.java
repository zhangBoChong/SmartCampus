package com.accp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.ClazzStudentMapper;
import com.accp.domain.ClazzStudent;
import com.accp.service.ClazzStudentService;

@Service
@Transactional
public class ClazzStudentServiceImpl implements ClazzStudentService{

	@Autowired
	ClazzStudentMapper clazzStudentMapper;

	@Override
	public ClazzStudent clazz_studentBysid(Integer sid) {
		// TODO Auto-generated method stub
		return clazzStudentMapper.clazz_studentBysid(sid);
	}
	
}
