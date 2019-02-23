package com.accp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.accp.domain.Studentinfo;

@Mapper
public interface DataauthorityMapper {
	//查询所有学生
	Studentinfo queryBysid(@Param("sid") Integer sid);
}
