package com.accp.mapper;

import com.accp.domain.ExaminationTm;
import com.accp.domain.ExaminationTmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExaminationTmMapper {
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