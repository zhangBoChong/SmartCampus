package com.accp.mapper;

import com.accp.domain.Clazz;
import com.accp.domain.ClazzExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ClazzMapper {
	Clazz queryBycid(Integer cid);
	
	int insert(Clazz clazz);
	
	int mc();
	
	int insert2(Clazz clazz);
	
	int updateClazz(@Param("tid")Integer tid,@Param("cid")Integer cid);
}