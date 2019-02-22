package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.accp.domain.TopicNeiRong;


@Mapper
public interface TopicNeiRongMapper {
	
	List<TopicNeiRong> queryByXiaLaKuangTiaoJian(@Param("vid") Integer vid,@Param("gid") Integer gid,@Param("courseId") Integer courseId,@Param("sectionId") Integer sectionId,@Param("topic_lx_id") Integer topic_lx_id,@Param("topic_level") String topic_level);
	
	int queryByXiaLaKuangTiaoJianCount(@Param("vid") Integer vid,@Param("gid") Integer gid,@Param("courseId") Integer courseId,@Param("sectionId") Integer sectionId,@Param("topic_lx_id") Integer topic_lx_id,@Param("topic_level") String topic_level);
	
	int deleteTopic(Integer topic_id);
	
	TopicNeiRong queryByTopicId(int topic_id);
}
