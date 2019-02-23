package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.accp.mapper.RoleMapper;
import com.accp.domain.PageBean;
import com.accp.domain.Role;
import com.accp.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleMapper roleMapper;
	
	@Override
	public List<Role> queryRole() {
		// TODO Auto-generated method stub
		return roleMapper.queryRole();
	}

	@Override
	public PageBean<Role> rolePage(int page) {
		List<Role> stu=roleMapper.rolePage((page-1)*3,3);
		int count=roleMapper.count();
		PageBean<Role> pageBean=new PageBean<Role>(3,count,page,stu);
		return pageBean;
	}

	@Override
	public int deleteRole(Integer roleId) {
		// TODO Auto-generated method stub
		return roleMapper.deleteRole(roleId);
	}

	@Override
	public int updateRole(String roleName, Integer roleId) {
		// TODO Auto-generated method stub
		return roleMapper.updateRole(roleName, roleId);
	}

	@Override
	public List<Role> queryByroleId(Integer roleId) {
		// TODO Auto-generated method stub
		return roleMapper.queryByroleId(roleId);
	}

	@Override
	public int insertrole(List<Role> roleLists) {
		// TODO Auto-generated method stub
		return roleMapper.insertrole(roleLists);
	}

}
