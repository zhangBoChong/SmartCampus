package com.accp.mapper;

import com.accp.domain.Attence;
import com.accp.domain.Clazz;
import com.accp.domain.Leave;
import com.accp.domain.PageBean;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttenceMapper {
	
	List<Attence> queryByWhereForPage(PageBean pagebean);

	int queryBywhereForPageCount(PageBean pagebean);
	
	List<Clazz> queryClazzByCid(int cid);
	
	public int insertLeave(Leave leave);
	
	public Clazz queryClazzbysid(int sid);
	
	public List<Leave> queryLeaveByTeaId(Integer teacher);
}