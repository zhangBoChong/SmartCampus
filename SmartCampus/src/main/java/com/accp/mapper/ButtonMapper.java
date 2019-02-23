package com.accp.mapper;

import com.accp.domain.Button;
import com.accp.domain.ButtonExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ButtonMapper {
    long countByExample(ButtonExample example);

    int deleteByExample(ButtonExample example);

    int deleteByPrimaryKey(Integer buttonid);

    int insert(Button record);

    int insertSelective(Button record);

    List<Button> selectByExample(ButtonExample example);

    Button selectByPrimaryKey(Integer buttonid);

    int updateByExampleSelective(@Param("record") Button record, @Param("example") ButtonExample example);

    int updateByExample(@Param("record") Button record, @Param("example") ButtonExample example);

    int updateByPrimaryKeySelective(Button record);

    int updateByPrimaryKey(Button record);
    
    //查询所有未删除的按钮
    List<Button> querybutton1(@Param("delete_id") Integer delete_id);
    
  //按角色id查询按钮中间表已有的数据
    List<Button> selectbuttonmiddleone(@Param("roleId") Integer roleId);
}