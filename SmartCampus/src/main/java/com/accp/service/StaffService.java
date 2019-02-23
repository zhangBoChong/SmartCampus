package com.accp.service;

import java.util.List;

import com.accp.domain.Staff;

public interface StaffService {
	//按tid查询
    List<Staff> queryBytid1(Integer tid);
  //修改员工：职位、、状态
    int updatestaff(Integer postId,Integer roleId,Integer status,Integer tid);
}
