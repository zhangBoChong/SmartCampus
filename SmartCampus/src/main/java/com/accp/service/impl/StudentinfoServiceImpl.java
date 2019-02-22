package com.accp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Login;
import com.accp.domain.Parents;
import com.accp.domain.Studentinfo;
import com.accp.mapper.LoginMapper;
import com.accp.mapper.ParentsMapper;
import com.accp.mapper.StudentinfoMapper;
import com.accp.service.StudentinfoService;

@Service
@Transactional
public class StudentinfoServiceImpl implements StudentinfoService{
	@Autowired
	ParentsMapper pmapper;
	@Autowired 
	StudentinfoMapper smapper;
	@Autowired
	LoginMapper logmapper;
	
	@Override
	public int insertSelective(Studentinfo record,Parents p) {
		//添加家长学员并同时添加登录用户
		int pid=0;
		Parents parent=pmapper.ifphonehave(p.getPhone());
		if(parent!=null) {
			int presult=pmapper.insertparent(p);
			pid=p.getPid();
		}else {
			pid=parent.getPid();
		}
		System.out.println("家长id："+pid);
		record.setPid(pid);
		int sresult=smapper.insertSelective(record);
		
		List<Login> log=new ArrayList<Login>();
		//角色id：3学员、4家长
		Login l=new Login();
		l.setLoginname(record.getPhone());
		l.setRoleid(3);
		log.add(l);
		Login l2=new Login();
		l2.setLoginname(p.getPhone());
		l2.setRoleid(4);
		log.add(l2);
		int logjg=logmapper.insertloginuser(log);
		return sresult;
	}

	@Override
	public List<Studentinfo> selectBystatus() {
		return smapper.selectBystatus();
	}

	@Override
	public int updateByPrimaryKeySelective(Studentinfo record,Parents p) {
		//修改学员信息
		int sjg=smapper.updateByPrimaryKeySelective(record);
		int pjg=pmapper.updateByPrimaryKeySelective(p);
		return sjg;
	}

	@Override
	public Studentinfo selectBysid(Integer sid) {
		//根据学员sid查询学员信息
		return smapper.selectBysid(sid);
	}

	@Override
	public Studentinfo selectallinfo(Integer sid) {
		// 个人详情
		return smapper.selectallinfo(sid);
	}

}
