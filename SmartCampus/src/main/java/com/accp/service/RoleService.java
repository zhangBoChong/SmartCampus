package com.accp.service;

import java.util.List;

import com.accp.domain.PageBean;
import com.accp.domain.Role;

public interface RoleService {
	//查询角色表
    List<Role> queryRole();
  	
  //角色分页
    PageBean<Role> rolePage(int page);
    
  //删除角色
    int deleteRole(Integer roleId);
    
  //修改角色
    int updateRole(String roleName,Integer roleId);
    
  //按roleId查询角色表
    List<Role> queryByroleId(Integer roleId);
    
  //添加角色
    int insertrole(List<Role> roleLists);
}
