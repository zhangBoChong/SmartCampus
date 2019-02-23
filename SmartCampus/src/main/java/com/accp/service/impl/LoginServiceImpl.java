package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.LoginMapper;
import com.accp.domain.Login;
import com.accp.domain.PageBean;
import com.accp.domain.Parents;
import com.accp.domain.Staff;
import com.accp.domain.Studentinfo;
import com.accp.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginMapper loginMapper;

	@Override
	public Login login(String loginName, String pwd) {
		// TODO Auto-generated method stub
		return loginMapper.login(loginName, pwd);
	}

	@Override
	public int register(Login l) {
		// TODO Auto-generated method stub
		return loginMapper.register(l);
	}

	@Override
	public PageBean<Staff> selectStaff(int page2, Integer type, String tname) {
		List<Staff> stu=loginMapper.selectStaff((page2-1)*12,12, type, tname);
		int count=loginMapper.countStaff(tname);
		PageBean<Staff> pageBean2=new PageBean<Staff>(12,count,page2,stu);
		return pageBean2;
	}

	@Override
	public PageBean<Parents> selectParents(int page3, Integer type, String pname) {
		List<Parents> stu=loginMapper.selectParents((page3-1)*3,3, type, pname);
		int count=loginMapper.countParents(pname);
		PageBean<Parents> pageBean3=new PageBean<Parents>(3,count,page3,stu);
		return pageBean3;
	}

	@Override
	public PageBean<Studentinfo> selectStudentinfo(int page4, Integer type, String sname) {
		List<Studentinfo> stu=loginMapper.selectStudentinfo((page4-1)*3,3, type, sname);
		int count=loginMapper.countStudentinfo(sname);
		PageBean<Studentinfo> pageBean4=new PageBean<Studentinfo>(3,count,page4,stu);
		return pageBean4;
	}

	@Override
	public List<Login> querypeopleId(Integer peopleId, Integer type) {
		// TODO Auto-generated method stub
		return loginMapper.querypeopleId(peopleId, type);
	}

	@Override
	public int updatestaffpwd(String pwd,Integer roleId, Integer peopleId) {
		// TODO Auto-generated method stub
		return loginMapper.updatestaffpwd(pwd,roleId, peopleId);
	}

	@Override
	public int updatestudentpwd(String pwd, Integer peopleId, Integer type) {
		// TODO Auto-generated method stub
		return loginMapper.updatestudentpwd(pwd, peopleId, type);
	}
}
