package com.accp.mapper;

import com.accp.domain.TaskStage;
import com.accp.domain.TaskStageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskStageMapper {
    long countByExample(TaskStageExample example);

    int deleteByExample(TaskStageExample example);

    int deleteByPrimaryKey(Integer stageid);

    int insert(TaskStage record);

    int insertSelective(TaskStage record);

    List<TaskStage> selectByExample(TaskStageExample example);

    TaskStage selectByPrimaryKey(Integer stageid);

    int updateByExampleSelective(@Param("record") TaskStage record, @Param("example") TaskStageExample example);

    int updateByExample(@Param("record") TaskStage record, @Param("example") TaskStageExample example);

    int updateByPrimaryKeySelective(TaskStage record);

    int updateByPrimaryKey(TaskStage record);
}