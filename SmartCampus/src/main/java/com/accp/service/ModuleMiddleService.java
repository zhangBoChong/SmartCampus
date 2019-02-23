package com.accp.service;

import com.accp.domain.ModuleMiddle;

public interface ModuleMiddleService {
	//按roleId查询模块权限
    ModuleMiddle queryByRoleId(Integer delete_id,Integer roleId);
}
