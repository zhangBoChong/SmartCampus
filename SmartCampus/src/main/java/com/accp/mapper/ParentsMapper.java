package com.accp.mapper;

import com.accp.domain.Parents;
import com.accp.domain.ParentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ParentsMapper {
	//电话是否已存在
	Parents ifphonehave(String phone);
	//新增家长
	int insertparent(Parents p);
	
    long countByExample(ParentsExample example);

    int deleteByExample(ParentsExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Parents record);

    int insertSelective(Parents record);

    List<Parents> selectByExample(ParentsExample example);

    Parents selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Parents record, @Param("example") ParentsExample example);

    int updateByExample(@Param("record") Parents record, @Param("example") ParentsExample example);
    //修改信息

    int updateByPrimaryKeySelective(Parents record);

    int updateByPrimaryKey(Parents record);
}