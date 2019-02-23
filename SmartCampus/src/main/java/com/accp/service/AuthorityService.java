package com.accp.service;

import java.util.List;

import com.accp.domain.Authority;

public interface AuthorityService {
	//查询所有权限
    List<Authority> queryAuthority();
}
