package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.ButtonMapper;
import com.accp.domain.Button;
import com.accp.service.ButtonService;

@Service
@Transactional
public class ButtonServiceImpl implements ButtonService{

	@Autowired
	ButtonMapper buttonMapper;

	@Override
	public List<Button> querybutton1(Integer delete_id) {
		// TODO Auto-generated method stub
		return buttonMapper.querybutton1(delete_id);
	}

	@Override
	public List<Button> selectbuttonmiddleone(Integer roleId) {
		// TODO Auto-generated method stub
		return buttonMapper.selectbuttonmiddleone(roleId);
	}
}
