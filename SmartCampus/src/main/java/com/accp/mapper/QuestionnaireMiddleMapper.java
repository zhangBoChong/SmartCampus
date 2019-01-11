package com.accp.mapper;

import com.accp.domain.QuestionnaireMiddle;
import com.accp.domain.QuestionnaireMiddleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionnaireMiddleMapper {
    long countByExample(QuestionnaireMiddleExample example);

    int deleteByExample(QuestionnaireMiddleExample example);

    int deleteByPrimaryKey(Integer qMiddleid);

    int insert(QuestionnaireMiddle record);

    int insertSelective(QuestionnaireMiddle record);

    List<QuestionnaireMiddle> selectByExample(QuestionnaireMiddleExample example);

    QuestionnaireMiddle selectByPrimaryKey(Integer qMiddleid);

    int updateByExampleSelective(@Param("record") QuestionnaireMiddle record, @Param("example") QuestionnaireMiddleExample example);

    int updateByExample(@Param("record") QuestionnaireMiddle record, @Param("example") QuestionnaireMiddleExample example);

    int updateByPrimaryKeySelective(QuestionnaireMiddle record);

    int updateByPrimaryKey(QuestionnaireMiddle record);
}