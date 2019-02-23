package com.accp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.ModuleMiddleMapper;
import com.accp.domain.ModuleMiddle;
import com.accp.service.ModuleMiddleService;

@Service
@Transactional
public class ModuleMiddleServiceImpl implements ModuleMiddleService{

	@Autowired
	ModuleMiddleMapper moduleMiddleMapper;

	@Override
	public ModuleMiddle queryByRoleId(Integer delete_id, Integer roleId) {
		// TODO Auto-generated method stub
		return moduleMiddleMapper.queryByRoleId(delete_id, roleId);
	}
	
}
