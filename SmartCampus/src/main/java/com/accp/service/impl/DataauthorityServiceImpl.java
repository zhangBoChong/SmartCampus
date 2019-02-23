package com.accp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.DataauthorityMapper;
import com.accp.service.DataauthorityService;

@Service
@Transactional
public class DataauthorityServiceImpl implements DataauthorityService{

	@Autowired
	DataauthorityMapper dataauthorityMapper;
	
}
