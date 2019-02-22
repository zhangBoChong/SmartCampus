package com.accp.mapper;

import com.accp.domain.Questionnaire;
import com.accp.domain.QuestionnaireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionnaireMapper {
    long countByExample(QuestionnaireExample example);

    int deleteByExample(QuestionnaireExample example);

    int deleteByPrimaryKey(Integer questionnaireid);

    int insert(Questionnaire record);

    int insertSelective(Questionnaire record);

    List<Questionnaire> selectByExample(QuestionnaireExample example);

    Questionnaire selectByPrimaryKey(Integer questionnaireid);

    int updateByExampleSelective(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    int updateByExample(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    int updateByPrimaryKeySelective(Questionnaire record);

    int updateByPrimaryKey(Questionnaire record);
}