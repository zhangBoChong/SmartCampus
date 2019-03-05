package com.accp.mapper;

import com.accp.domain.Clazz;
import com.accp.domain.ClazzExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ClazzMapper {
	List<Clazz> queryClazzs();
	List<Clazz> queryAllclazz();
	List<Clazz> queryBybid(Integer bid);
	Clazz selectBycid(Integer cid);
	
	//查询所有班级
    List<Clazz> selectClazz();
    
    //按cid查询班级表
    Clazz clazzBycid(@Param("cid") Integer cid);
	
	//班级信息+年级+版本
	List<Clazz> selectclazzvg();
	//根据cid查询班级信息
	Clazz selectclazzvgBycid(Integer cid);
	//班级信息+班主任+年级+版本
	Clazz selectclazzBycid(Integer cid);
	//一个老师带得所有班级（班级信息+年级+版本）
	List<Clazz> selectBytid(Integer tid);

	Clazz queryBycid(Integer cid);
	
    long countByExample(ClazzExample example);

    int deleteByExample(ClazzExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    List<Clazz> selectByExample(ClazzExample example);

    Clazz selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByExample(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
	
	int insert1(Clazz clazz);
	
	int mc();
	
	int insert2(Clazz clazz);
	
	int updateClazz(@Param("tid")Integer tid,@Param("cid")Integer cid);
	
	List<Clazz> queryClazz();
	
	int clazzRs(Integer cid);
	
	int updateStatus(Integer cid);
}