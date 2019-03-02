package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.CharacterMapper;
import com.accp.mapper.PostMapper;
import com.accp.mapper.StaffMapper;
import com.accp.domain.Staff;
import com.accp.service.StaffService;

@Service
@Transactional
public class StaffServiceImpl implements StaffService{

	@Autowired
	StaffMapper staffMapper;
	@Autowired
	PostMapper postMapper;
	@Autowired
	CharacterMapper  characterMapper;

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
	@Override
	public List<Staff> queryAllStaffs() {
		List<Staff> list=staffMapper.queryAllStaffs();
		for (Staff s : list) {
			s.setPostName(postMapper.selectqueryPostid(s.getPostid()).getPostName());
			s.setCharacterName(characterMapper.queryByCharacterId(s.getCharacterid()).getCharactername());
		}
		return list;
	}

	@Override
	public List<Staff> queryBypostIdss(Integer postid) {
		List<Staff> list=staffMapper.queryBypostIdss(postid);
		for (Staff s : list) {
			s.setPostName(postMapper.selectqueryPostid(s.getPostid()).getPostName());
			s.setCharacterName(characterMapper.queryByCharacterId(s.getCharacterid()).getCharactername());
		}
		return list;
	}

	@Override
	public List<Staff> queryBySStatus(Integer status) {
		List<Staff> list=staffMapper.queryBySStatus(status);
		for (Staff s : list) {
			s.setPostName(postMapper.selectqueryPostid(s.getPostid()).getPostName());
			s.setCharacterName(characterMapper.queryByCharacterId(s.getCharacterid()).getCharactername());
		}
		return list;
	}

	@Override
	public int addStaff(Staff record) {
		int count=staffMapper.addStaff(record);
		return count;
	}

	@Override
	public Staff queryBytid(Integer tid) {
		Staff s=staffMapper.queryBytid(tid);
		s.setPostName(postMapper.selectqueryPostid(s.getPostid()).getPostName());
		s.setCharacterName(characterMapper.queryByCharacterId(s.getCharacterid()).getCharactername());
		
		return s;
	}

	@Override
	public int updateStaffs(Staff record) {
		int count=staffMapper.updateStaffs(record);
		return count;
	}

	@Override
	public int deleteStaffs(Integer tid) {
		int count=staffMapper.deleteStaffs(tid);
		return count;
	}

}
