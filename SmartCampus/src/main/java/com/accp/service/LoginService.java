package com.accp.service;

import java.util.List;

import com.accp.domain.Login;
import com.accp.domain.PageBean;
import com.accp.domain.Parents;
import com.accp.domain.Staff;
import com.accp.domain.Studentinfo;

public interface LoginService {
	//登录
    Login login(String loginName,String pwd);
    //注册
    int register(Login l);
    
  //查询员工用户
    PageBean<Staff> selectStaff(int page2,Integer type,String tname);
    
  //查询家长用户
    PageBean<Parents> selectParents(int page3,Integer type,String pname);
    
    //查询学生用户
    PageBean<Studentinfo> selectStudentinfo(int page4,Integer type,String sname);

  //查询Login表
    List<Login> querypeopleId(Integer peopleId,Integer type);
    
  //修改登录表员工账号的密码
    int updatestaffpwd(String pwd,Integer roleId,Integer peopleId);
    
  //修改学生账户密码
    int updatestudentpwd(String pwd,Integer peopleId,Integer type);    
    
  //查询学员loginId
  	Login queryloginIds(Integer peopleId,Integer type);
}
