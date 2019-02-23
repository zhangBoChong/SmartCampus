package com.accp.mapper;

import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StaffMapper {
	Staff selectBytid(Integer tid);
	Staff queryBytid(Integer tid);
	//老师以及带的所有班级信息
	Staff selectstaffclazz(Integer tid);
	
    long countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
    
    //按tid查询
    List<Staff> queryBytid1(@Param("tid") Integer tid);
    
    //修改员工：职位、、状态
    int updatestaff(@Param("postId") Integer postId,@Param("roleId") Integer roleId,@Param("status") Integer status,@Param("tid") Integer tid);
}