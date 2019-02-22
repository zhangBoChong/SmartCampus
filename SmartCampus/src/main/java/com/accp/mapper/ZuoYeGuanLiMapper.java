package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.accp.domain.ZuoYeGuanLi;

@Mapper
public interface ZuoYeGuanLiMapper {
	List<ZuoYeGuanLi> queryByZuoYeGuanLiByTid(int tid);
	List<ZuoYeGuanLi> queryXueYuanZuoYeGuanLi(@Param("gname") String gname, @Param("cname") String cname);
}
