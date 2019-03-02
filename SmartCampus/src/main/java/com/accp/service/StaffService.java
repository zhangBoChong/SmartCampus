package com.accp.service;

import java.util.List;

import com.accp.domain.Staff;

public interface StaffService {
	//按tid查询
    List<Staff> queryBytid1(Integer tid);
  //修改员工：职位、、状态
    int updatestaff(Integer postId,Integer roleId,Integer status,Integer tid);
  //查所有员工
    List<Staff> queryAllStaffs();
    //根据职位查员工
    List<Staff> queryBypostIdss(Integer postid);
    //根据状态查员工
    List<Staff> queryBySStatus(Integer status);
    //新增员工
    int addStaff(Staff record);
    //根据员工编号查员工
    Staff queryBytid(Integer tid);
    //修改员工
    int updateStaffs(Staff record);
    //删除员工
    int deleteStaffs(Integer tid);

}
