package com.accp.mapper;

import com.accp.domain.Buttonmiddle;
import com.accp.domain.ButtonmiddleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ButtonmiddleMapper {
    long countByExample(ButtonmiddleExample example);

    int deleteByExample(ButtonmiddleExample example);

    int deleteByPrimaryKey(Integer brid);

    int insert(Buttonmiddle record);

    int insertSelective(Buttonmiddle record);

    List<Buttonmiddle> selectByExample(ButtonmiddleExample example);

    Buttonmiddle selectByPrimaryKey(Integer brid);

    int updateByExampleSelective(@Param("record") Buttonmiddle record, @Param("example") ButtonmiddleExample example);

    int updateByExample(@Param("record") Buttonmiddle record, @Param("example") ButtonmiddleExample example);

    int updateByPrimaryKeySelective(Buttonmiddle record);

    int updateByPrimaryKey(Buttonmiddle record);
    
    //添加按钮与角色的关联
    int insertbuttonmiddle(@Param("buttonid") Integer buttonid,@Param("roleId") Integer roleId,@Param("delete_id") Integer delete_id);
    
    //查询按钮是否禁用
    List<Buttonmiddle> querybuttonmiddle(@Param("buttonid") Integer buttonid,@Param("roleId") Integer roleId,@Param("delete_id") Integer delete_id);
    
    //按roleId和buttonid查询角色中间表的关联数据
    int selectcountbuttonmiddle(@Param("buttonid") Integer buttonid,@Param("roleId") Integer roleId);
    
    //修改角色的按钮权限(是否禁用)
    int updatebuttonstatus(@Param("buttonstatus") Integer buttonstatus,@Param("brid") Integer brid);
    
}