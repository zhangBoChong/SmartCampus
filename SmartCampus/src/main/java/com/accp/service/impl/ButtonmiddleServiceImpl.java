package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.ButtonmiddleMapper;
import com.accp.domain.Buttonmiddle;
import com.accp.service.ButtonmiddleService;

@Service
@Transactional
public class ButtonmiddleServiceImpl implements ButtonmiddleService{

	@Autowired
	ButtonmiddleMapper buttonmiddleMapper;

	@Override
	public int insertbuttonmiddle(Integer buttonid, Integer roleId, Integer delete_id) {
		// TODO Auto-generated method stub
		return buttonmiddleMapper.insertbuttonmiddle(buttonid, roleId, delete_id);
	}

	@Override
	public List<Buttonmiddle> querybuttonmiddle(Integer buttonid, Integer roleId, Integer delete_id) {
		// TODO Auto-generated method stub
		return buttonmiddleMapper.querybuttonmiddle(buttonid, roleId, delete_id);
	}

	@Override
	public int selectcountbuttonmiddle(Integer buttonid, Integer roleId) {
		// TODO Auto-generated method stub
		return buttonmiddleMapper.selectcountbuttonmiddle(buttonid, roleId);
	}

	@Override
	public int updatebuttonstatus(Integer buttonstatus, Integer brid) {
		// TODO Auto-generated method stub
		return buttonmiddleMapper.updatebuttonstatus(buttonstatus, brid);
	}
}
