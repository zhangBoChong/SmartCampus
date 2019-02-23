package com.accp.mapper;

import com.accp.domain.ModuleMiddle;
import com.accp.domain.ModuleMiddleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ModuleMiddleMapper {
    long countByExample(ModuleMiddleExample example);

    int deleteByExample(ModuleMiddleExample example);

    int deleteByPrimaryKey(Integer mrid);

    int insert(ModuleMiddle record);

    int insertSelective(ModuleMiddle record);

    List<ModuleMiddle> selectByExample(ModuleMiddleExample example);

    ModuleMiddle selectByPrimaryKey(Integer mrid);

    int updateByExampleSelective(@Param("record") ModuleMiddle record, @Param("example") ModuleMiddleExample example);

    int updateByExample(@Param("record") ModuleMiddle record, @Param("example") ModuleMiddleExample example);

    int updateByPrimaryKeySelective(ModuleMiddle record);

    int updateByPrimaryKey(ModuleMiddle record);
    
    //按roleId查询模块权限
    ModuleMiddle queryByRoleId(@Param("delete_id") Integer delete_id,@Param("roleId") Integer roleId);
}