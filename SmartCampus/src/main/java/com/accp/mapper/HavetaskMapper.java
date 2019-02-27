package com.accp.mapper;

import com.accp.domain.Havetask;
import com.accp.domain.HavetaskExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HavetaskMapper {
	
    long countByExample(HavetaskExample example);

    int deleteByExample(HavetaskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(Havetask record);

    int insertSelective(Havetask record);

    List<Havetask> selectByExample(HavetaskExample example);

    Havetask selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") Havetask record, @Param("example") HavetaskExample example);

    int updateByExample(@Param("record") Havetask record, @Param("example") HavetaskExample example);

    int updateByPrimaryKeySelective(Havetask record);

    int updateByPrimaryKey(Havetask record);

}