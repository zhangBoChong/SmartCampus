package com.accp.mapper;

import com.accp.domain.QuestionnaireTopic;
import com.accp.domain.QuestionnaireTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionnaireTopicMapper {
    long countByExample(QuestionnaireTopicExample example);

    int deleteByExample(QuestionnaireTopicExample example);

    int deleteByPrimaryKey(Integer topicid);

    int insert(QuestionnaireTopic record);

    int insertSelective(QuestionnaireTopic record);

    List<QuestionnaireTopic> selectByExample(QuestionnaireTopicExample example);

    QuestionnaireTopic selectByPrimaryKey(Integer topicid);

    int updateByExampleSelective(@Param("record") QuestionnaireTopic record, @Param("example") QuestionnaireTopicExample example);

    int updateByExample(@Param("record") QuestionnaireTopic record, @Param("example") QuestionnaireTopicExample example);

    int updateByPrimaryKeySelective(QuestionnaireTopic record);

    int updateByPrimaryKey(QuestionnaireTopic record);
}