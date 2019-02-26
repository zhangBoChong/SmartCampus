package com.accp.mapper;

import com.accp.domain.ClazzTeacher;
import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import com.accp.domain.Studentinfo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StaffMapper {
	List<Staff> queryAllStaff(int postId);
	
	int sl(int tid);
	
	int sl2(int tid);
    
    Character characterName(int characterId);
	
	List<Staff> queryStaff(@Param("postId")Integer postId,@Param("tid")Integer tid,@Param("tname")String tname,@Param("age1")Integer age1,@Param("age2")Integer age2,@Param("sex")Integer sex,@Param("characterId")Integer characterId);
	
	Staff queryStaff2();

	Staff queryStaff3();
}