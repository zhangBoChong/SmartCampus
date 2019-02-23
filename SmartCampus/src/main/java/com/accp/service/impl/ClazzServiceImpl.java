package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.ClazzMapper;
import com.accp.domain.Clazz;
import com.accp.service.ClazzService;

@Service
@Transactional
public class ClazzServiceImpl implements ClazzService{
	
	@Autowired
	ClazzMapper clazzMapper;

	@Override
	public List<Clazz> selectClazz() {
		// TODO Auto-generated method stub
		return clazzMapper.selectClazz();
	}

	@Override
	public Clazz clazzBycid(Integer cid) {
		// TODO Auto-generated method stub
		return clazzMapper.clazzBycid(cid);
	}
	
}
