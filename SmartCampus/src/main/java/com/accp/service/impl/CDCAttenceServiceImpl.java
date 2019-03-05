package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Attence;
import com.accp.domain.Clazz;
import com.accp.domain.Leave;
import com.accp.domain.PageBean;
import com.accp.domain.PageBean1;
import com.accp.mapper.AttenceMapper;
import com.accp.service.CDCAttenceService;

@Service
@Transactional
public class CDCAttenceServiceImpl implements CDCAttenceService{

	@Autowired
	AttenceMapper attmapper;

	@Override
	public PageBean1 queryByWhereForPage(String name, String start, String end,int currpage) {
		// TODO Auto-generated method stub
		PageBean1 page=new PageBean1(name, start, end);
		int count=attmapper.queryBywhereForPageCount(page);
		page.setPagecount(count);
		page.setCurrpage(currpage);
		List<Attence> list=attmapper.queryByWhereForPage(page);	
		
		page.setList(list);
		return page;
	}

	@Override
	public List<Clazz> queryClazzByCid(int cid) {
		// TODO Auto-generated method stub
		return attmapper.queryClazzByCid(cid);
	}

	@Override
	public int insertLeave(Leave leave) {
		// TODO Auto-generated method stub
		return attmapper.insertLeave(leave);
	}

	@Override
	public Clazz queryClazzbysid(int sid) {
		// TODO Auto-generated method stub
		return attmapper.queryClazzbysid(sid);
	}

	@Override
	public List<Leave> queryLeaveByTeaId(Integer teacher) {
		// TODO Auto-generated method stub
		return attmapper.queryLeaveByTeaId(teacher);
	}

	@Override
	public int updateLeave(Leave l) {
		// TODO Auto-generated method stub
		return attmapper.updateLeave(l);
	}

	@Override
	public int insertAtt(Attence att) {
		// TODO Auto-generated method stub
		return attmapper.insertAtt(att);
	}

	@Override
	public List<Clazz> queryClazzByTid(int tid) {
		// TODO Auto-generated method stub
		return attmapper.queryClazzByTid(tid);
	}

	@Override
	public List<Attence> queryAttenceBySid(int cid) {
		// TODO Auto-generated method stub
		return attmapper.queryAttenceBySid(cid);
	}
	
}
