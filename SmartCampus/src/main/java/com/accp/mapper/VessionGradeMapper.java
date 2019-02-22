package com.accp.mapper;

import com.accp.domain.VessionGrade;
import com.accp.domain.VessionGradeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VessionGradeMapper {
	//查询年级版本（年级名+版本名）
	VessionGrade selectgvBybid(Integer bid);
	
	//根据bid查询版本年级中间表
	VessionGrade queryByBid(Integer bid);
    long countByExample(VessionGradeExample example);

    int deleteByExample(VessionGradeExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(VessionGrade record);

    int insertSelective(VessionGrade record);

    List<VessionGrade> selectByExample(VessionGradeExample example);

    VessionGrade selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") VessionGrade record, @Param("example") VessionGradeExample example);

    int updateByExample(@Param("record") VessionGrade record, @Param("example") VessionGradeExample example);

    int updateByPrimaryKeySelective(VessionGrade record);

    int updateByPrimaryKey(VessionGrade record);
}