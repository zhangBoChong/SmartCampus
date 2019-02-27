package com.accp.mapper;

import com.accp.domain.ExaminationLx;
import com.accp.domain.ExaminationLxExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExaminationLxMapper {
	
	List<ExaminationLx> queryExaminationLx();
	

    long countByExample(ExaminationLxExample example);

    int deleteByExample(ExaminationLxExample example);

    int deleteByPrimaryKey(Integer examinationLxId);

    int insert(ExaminationLx record);

    int insertSelective(ExaminationLx record);

    List<ExaminationLx> selectByExample(ExaminationLxExample example);

    ExaminationLx selectByPrimaryKey(Integer examinationLxId);

    int updateByExampleSelective(@Param("record") ExaminationLx record, @Param("example") ExaminationLxExample example);

    int updateByExample(@Param("record") ExaminationLx record, @Param("example") ExaminationLxExample example);

    int updateByPrimaryKeySelective(ExaminationLx record);

    int updateByPrimaryKey(ExaminationLx record);
}