package com.accp.mapper;

import com.accp.domain.Login;
import com.accp.domain.LoginExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LoginMapper {
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
}