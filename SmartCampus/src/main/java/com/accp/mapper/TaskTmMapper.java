package com.accp.mapper;

import com.accp.domain.TaskTm;
import com.accp.domain.TaskTmExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TaskTmMapper {
	
	int insertTaskTm(@Param("topic_id") int topic_id,@Param("task_id") int task_id,@Param("task_tm_xzt") int task_tm_xzt,@Param("task_tm_wdt") int task_tm_wdt);
	
    long countByExample(TaskTmExample example);

    int deleteByExample(TaskTmExample example);

    int deleteByPrimaryKey(Integer taskTmId);

    int insert(TaskTm record);

    int insertSelective(TaskTm record);

    List<TaskTm> selectByExample(TaskTmExample example);

    TaskTm selectByPrimaryKey(Integer taskTmId);

    int updateByExampleSelective(@Param("record") TaskTm record, @Param("example") TaskTmExample example);

    int updateByExample(@Param("record") TaskTm record, @Param("example") TaskTmExample example);

    int updateByPrimaryKeySelective(TaskTm record);

    int updateByPrimaryKey(TaskTm record);
}