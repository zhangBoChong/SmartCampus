package com.accp.mapper;

import com.accp.domain.Attence;
import com.accp.domain.AttenceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AttenceMapper {
	//查询学员考勤类型次数 
	int selectattenceBysidlx(@Param("studentid") Integer studentid,@Param("attence") Integer attence);
	
    long countByExample(AttenceExample example);

    int deleteByExample(AttenceExample example);

    int deleteByPrimaryKey(Integer attenceid);

    int insert(Attence record);

    int insertSelective(Attence record);

    List<Attence> selectByExample(AttenceExample example);

    Attence selectByPrimaryKey(Integer attenceid);

    int updateByExampleSelective(@Param("record") Attence record, @Param("example") AttenceExample example);

    int updateByExample(@Param("record") Attence record, @Param("example") AttenceExample example);

    int updateByPrimaryKeySelective(Attence record);

    int updateByPrimaryKey(Attence record);
}