package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.AuthorityMapper;
import com.accp.domain.Authority;
import com.accp.service.AuthorityService;

@Service
@Transactional
public class AuthorityServiceImpl implements AuthorityService{
	
	@Autowired
	AuthorityMapper authorityMapper;

	@Override
	public List<Authority> queryAuthority() {
		// TODO Auto-generated method stub
		return authorityMapper.queryAuthority();
	}
	
	
}
