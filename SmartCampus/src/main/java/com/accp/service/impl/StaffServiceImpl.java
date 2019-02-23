package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.StaffMapper;
import com.accp.domain.Staff;
import com.accp.service.StaffService;

@Service
@Transactional
public class StaffServiceImpl implements StaffService{

	@Autowired
	StaffMapper staffMapper;

	@Override
	public List<Staff> queryBytid1(Integer tid) {
		// TODO Auto-generated method stub
		return staffMapper.queryBytid1(tid);
	}

	@Override
	public int updatestaff(Integer postId,Integer roleId, Integer status,Integer tid) {
		// TODO Auto-generated method stub
		return staffMapper.updatestaff(postId,roleId,status,tid);
	}
	
}
