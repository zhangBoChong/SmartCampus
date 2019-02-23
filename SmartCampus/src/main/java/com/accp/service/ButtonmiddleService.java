package com.accp.service;

import java.util.List;

import com.accp.domain.Buttonmiddle;

public interface ButtonmiddleService {
	//添加按钮与角色的关联
    int insertbuttonmiddle(Integer buttonid,Integer roleId,Integer delete_id);
    
  //查询按钮是否禁用
    List<Buttonmiddle> querybuttonmiddle(Integer buttonid,Integer roleId,Integer delete_id);
    
  //按roleId和buttonid查询角色中间表的关联数据
    int selectcountbuttonmiddle(Integer buttonid,Integer roleId);
    
  //修改角色的按钮权限(是否禁用)
    int updatebuttonstatus(Integer buttonstatus,Integer brid);
}
