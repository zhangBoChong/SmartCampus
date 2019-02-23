package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.ModuleMapper;
import com.accp.domain.Module;
import com.accp.service.ModuleService;

@Service
@Transactional
public class ModuleServiceImpl implements ModuleService{
	
	@Autowired
	ModuleMapper moduleMapper;

	@Override
	public List<Module> selectparentIdbyzero(Integer parentId) {
		// TODO Auto-generated method stub
		return moduleMapper.selectparentIdbyzero(parentId);
	}

	@Override
	public List<Module> selectModule() {
		// TODO Auto-generated method stub
		return moduleMapper.selectModule();
	}

}
