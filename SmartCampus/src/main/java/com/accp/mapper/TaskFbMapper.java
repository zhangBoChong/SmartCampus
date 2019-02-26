package com.accp.mapper;

import com.accp.domain.TaskFb;
import com.accp.domain.TaskFbExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TaskFbMapper {
	
	int insertTaskFb(@Param("task_id")int task_id,@Param("csId") int csId);
	
    long countByExample(TaskFbExample example);

    int deleteByExample(TaskFbExample example);

    int deleteByPrimaryKey(Integer taskFbId);

    int insert(TaskFb record);

    int insertSelective(TaskFb record);

    List<TaskFb> selectByExample(TaskFbExample example);

    TaskFb selectByPrimaryKey(Integer taskFbId);

    int updateByExampleSelective(@Param("record") TaskFb record, @Param("example") TaskFbExample example);

    int updateByExample(@Param("record") TaskFb record, @Param("example") TaskFbExample example);

    int updateByPrimaryKeySelective(TaskFb record);

    int updateByPrimaryKey(TaskFb record);
}