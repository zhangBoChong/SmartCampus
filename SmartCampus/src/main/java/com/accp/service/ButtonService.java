package com.accp.service;

import java.util.List;

import com.accp.domain.Button;

public interface ButtonService {
	//查询所有未删除的按钮
    List<Button> querybutton1(Integer delete_id);
    
  //按角色id查询按钮中间表已有的数据
    List<Button> selectbuttonmiddleone(Integer roleId);
}
