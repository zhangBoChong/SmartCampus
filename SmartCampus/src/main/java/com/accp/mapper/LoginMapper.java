package com.accp.mapper;

import com.accp.domain.Login;
import com.accp.domain.LoginExample;
import com.accp.domain.Parents;
import com.accp.domain.Staff;
import com.accp.domain.Studentinfo;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LoginMapper {
	//查询学员loginId
	Login queryloginIds(@Param("peopleId") Integer peopleId,@Param("type") Integer type);
	
	//新增登录用户
	int insertloginuser(List<Login> log);
    long countByExample(LoginExample example);

    int deleteByExample(LoginExample example);

    int deleteByPrimaryKey(Integer loginid);

    int insert(Login record);

    int insertSelective(Login record);

    List<Login> selectByExample(LoginExample example);

    Login selectByPrimaryKey(Integer loginid);

    int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByExample(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
    
  //查询Login表
    List<Login> querypeopleId(@Param("peopleId") Integer peopleId,@Param("type") Integer type);
    
    //登录
    Login login(@Param("loginName") String loginName,@Param("pwd") String pwd);
    
    //注册
    int register(Login l);
    
  //查询员工用户
    List<Staff> selectStaff(@Param("start3") Integer start3,@Param("size3") Integer size3,@Param("type") Integer type,@Param("tname") String tname);
    
    //count  staff表
    int countStaff(@Param("tname") String tname);
    
  //查询家长用户
    List<Parents> selectParents(@Param("start2") Integer start2,@Param("size2") Integer size2,@Param("type") Integer type,@Param("pname") String pname);
    
  //count  parents表
    int countParents(@Param("pname") String pname);
    
    //查询学生用户
    List<Studentinfo> selectStudentinfo(@Param("start1") Integer start1,@Param("size1") Integer size1,@Param("type") Integer type,@Param("sname") String sname);
    
  //count  studentinfo表
    int countStudentinfo(@Param("sname") String sname);
    
    //修改登录表员工账号的密码
    int updatestaffpwd(@Param("pwd") String pwd,@Param("roleId") Integer roleId,@Param("peopleId") Integer peopleId);
    
    //修改学生账户密码
    int updatestudentpwd(@Param("pwd") String pwd,@Param("peopleId") Integer peopleId,@Param("type") Integer type);
}