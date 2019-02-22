package com.accp.mapper;

import com.accp.domain.ExaminationTm;
import com.accp.domain.ExaminationTmExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExaminationTmMapper {
	
	int insertExaTm(@Param("topic_id") int topic_id,@Param("examination_id") int examination_id,@Param("examination_tm_xzt") int examination_tm_xzt,@Param("examination_tm_wdt") int examination_tm_wdt);
	
    long countByExample(ExaminationTmExample example);

    int deleteByExample(ExaminationTmExample example);

    int deleteByPrimaryKey(Integer examinationTmId);

    int insert(ExaminationTm record);

    int insertSelective(ExaminationTm record);

    List<ExaminationTm> selectByExample(ExaminationTmExample example);

    ExaminationTm selectByPrimaryKey(Integer examinationTmId);

    int updateByExampleSelective(@Param("record") ExaminationTm record, @Param("example") ExaminationTmExample example);

    int updateByExample(@Param("record") ExaminationTm record, @Param("example") ExaminationTmExample example);

    int updateByPrimaryKeySelective(ExaminationTm record);

    int updateByPrimaryKey(ExaminationTm record);
}