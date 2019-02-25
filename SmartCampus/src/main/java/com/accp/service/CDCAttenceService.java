package com.accp.service;


import java.util.List;

import com.accp.domain.Attence;
import com.accp.domain.Clazz;
import com.accp.domain.Leave;
import com.accp.domain.PageBean;

public interface CDCAttenceService {

	PageBean queryByWhereForPage(String name,String start,String end,int currpage);
	
	List<Clazz> queryClazzByCid(int cid);
	
	public int insertLeave(Leave leave);
	
	public Clazz queryClazzbysid(int sid);
	
	public List<Leave> queryLeaveByTeaId(Integer teacher);
	
	public int updateLeave(Leave l);
	
	public int insertAtt(Attence att);

}
