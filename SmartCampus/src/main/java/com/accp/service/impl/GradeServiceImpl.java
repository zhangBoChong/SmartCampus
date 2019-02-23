package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.GradeMapper;
import com.accp.domain.Grade;
import com.accp.service.GradeService;

@Service
@Transactional
public class GradeServiceImpl implements GradeService{
	
	@Autowired
	GradeMapper gradeMapper;

	@Override
	public List<Grade> selectGrade() {
		// TODO Auto-generated method stub
		return gradeMapper.selectGrade();
	}

	@Override
	public Grade selectBygid(Integer gid) {
		// TODO Auto-generated method stub
		return gradeMapper.selectBygid(gid);
	}
	
}
