package com.accp.mapper;

import com.accp.domain.TaskMiddle;
import com.accp.domain.TaskMiddleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskMiddleMapper {
    long countByExample(TaskMiddleExample example);

    int deleteByExample(TaskMiddleExample example);

    int deleteByPrimaryKey(Integer middleid);

    int insert(TaskMiddle record);

    int insertSelective(TaskMiddle record);

    List<TaskMiddle> selectByExample(TaskMiddleExample example);

    TaskMiddle selectByPrimaryKey(Integer middleid);

    int updateByExampleSelective(@Param("record") TaskMiddle record, @Param("example") TaskMiddleExample example);

    int updateByExample(@Param("record") TaskMiddle record, @Param("example") TaskMiddleExample example);

    int updateByPrimaryKeySelective(TaskMiddle record);

    int updateByPrimaryKey(TaskMiddle record);
}