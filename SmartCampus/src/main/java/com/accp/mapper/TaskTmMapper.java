package com.accp.mapper;

import com.accp.domain.TaskTm;
import com.accp.domain.TaskTmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskTmMapper {
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