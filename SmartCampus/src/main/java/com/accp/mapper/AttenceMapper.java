package com.accp.mapper;

import com.accp.domain.Attence;
import com.accp.domain.AttenceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.accp.domain.Clazz;
import com.accp.domain.Leave;
import com.accp.domain.PageBean1;
@Mapper
public interface AttenceMapper {
	
	List<Attence> queryByWhereForPage(PageBean1 pagebean);

	int queryBywhereForPageCount(PageBean1 pagebean);
	
	List<Clazz> queryClazzByCid(int cid);
	
	public int insertLeave(Leave leave);
	
	public Clazz queryClazzbysid(int sid);
	
	public List<Leave> queryLeaveByTeaId(Integer teacher);
	
	public int updateLeave(Leave l);
	

//	新写的
	public List<Clazz> queryClazzByTid (int tid);
	
	public List<Attence> queryAttenceBySid(int cid);

	
//	插入日常表
	public int insertAtt(Attence att);
	int selectattenceBysidlx(@Param("studentid") Integer studentid,@Param("attence") Integer attence);
	
    long countByExample(AttenceExample example);

    int deleteByExample(AttenceExample example);

    int deleteByPrimaryKey(Integer attenceid);

    int insert(Attence record);

    int insertSelective(Attence record);

    List<Attence> selectByExample(AttenceExample example);

    Attence selectByPrimaryKey(Integer attenceid);

    int updateByExampleSelective(@Param("record") Attence record, @Param("example") AttenceExample example);

    int updateByExample(@Param("record") Attence record, @Param("example") AttenceExample example);

    int updateByPrimaryKeySelective(Attence record);

    int updateByPrimaryKey(Attence record);

}