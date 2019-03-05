package com.accp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Login;
import com.accp.domain.Parents;
import com.accp.domain.Studentinfo;
import com.accp.mapper.CharacterMapper;
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
	@Autowired
	StudentinfoMapper studentinfoMapper;
	@Autowired
	CharacterMapper characterMapper;
	
	@Override
	public Studentinfo queryBysid1(Integer sid) {
		// TODO Auto-generated method stub
		return studentinfoMapper.queryBysid1(sid);
	}

	@Override
	public int updatestudentstatus(Integer status, Integer sid) {
		// TODO Auto-generated method stub
		return studentinfoMapper.updatestudentstatus(status, sid);
	}

	@Override
	public List<Studentinfo> queryBysidnnn(Integer sid) {
		// TODO Auto-generated method stub
		return studentinfoMapper.queryBysidnnn(sid);
	}
	
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
		l.setLoginName(record.getPhone());
		l.setRoleId(3);
		log.add(l);
		Login l2=new Login();
		l2.setLoginName(p.getPhone());
		l2.setRoleId(4);
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
	
	@Override
	public List<Studentinfo> queryBystatus() {
		List<Studentinfo> list=studentinfoMapper.queryBystatus();
		for (Studentinfo s : list) {
			s.setCharacter(characterMapper.queryByCharacterId(s.getCharacterid()));
		}
		return list;
	}

	@Override
	public int addStudentinfo4(Studentinfo stu) {
		int count=studentinfoMapper.addStudentinfo4(stu);
		return count;
	}

	@Override
	public int deleteStudents(Integer sid) {
		int count=studentinfoMapper.deleteStudents(sid);
		return count;
	}
	@Override
	public List<Studentinfo> queryBystatus3() {
		List<Studentinfo> list=studentinfoMapper.queryBystatus3();
		return list;
	}

}
