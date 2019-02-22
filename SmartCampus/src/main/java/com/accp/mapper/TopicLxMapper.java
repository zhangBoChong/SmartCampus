package com.accp.mapper;

import com.accp.domain.TopicLx;
import com.accp.domain.TopicLxExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TopicLxMapper {
	
	List<TopicLx> queryTopicLx();
	
    long countByExample(TopicLxExample example);

    int deleteByExample(TopicLxExample example);

    int deleteByPrimaryKey(Integer topicLxId);

    int insert(TopicLx record);

    int insertSelective(TopicLx record);

    List<TopicLx> selectByExample(TopicLxExample example);

    TopicLx selectByPrimaryKey(Integer topicLxId);

    int updateByExampleSelective(@Param("record") TopicLx record, @Param("example") TopicLxExample example);

    int updateByExample(@Param("record") TopicLx record, @Param("example") TopicLxExample example);

    int updateByPrimaryKeySelective(TopicLx record);

    int updateByPrimaryKey(TopicLx record);
}