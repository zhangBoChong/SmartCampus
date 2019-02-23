package com.accp.service;

import java.util.List;

import com.accp.domain.Module;

public interface ModuleService {
	List<Module> selectModule();
	
	//查询parentId为0的模块
    List<Module> selectparentIdbyzero(Integer parentId);
}
