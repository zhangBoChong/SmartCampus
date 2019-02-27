package com.accp.mapper;

import com.accp.domain.TaskLx;
import com.accp.domain.TaskLxExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TaskLxMapper {
	
	List<TaskLx> queryByAll();

    long countByExample(TaskLxExample example);

    int deleteByExample(TaskLxExample example);

    int deleteByPrimaryKey(Integer taskLxId);

    int insert(TaskLx record);

    int insertSelective(TaskLx record);

    List<TaskLx> selectByExample(TaskLxExample example);

    TaskLx selectByPrimaryKey(Integer taskLxId);

    int updateByExampleSelective(@Param("record") TaskLx record, @Param("example") TaskLxExample example);

    int updateByExample(@Param("record") TaskLx record, @Param("example") TaskLxExample example);

    int updateByPrimaryKeySelective(TaskLx record);

    int updateByPrimaryKey(TaskLx record);
}