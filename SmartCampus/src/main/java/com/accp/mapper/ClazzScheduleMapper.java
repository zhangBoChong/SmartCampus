package com.accp.mapper;

import com.accp.domain.ClazzSchedule;
import com.accp.domain.ClazzScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClazzScheduleMapper {
    long countByExample(ClazzScheduleExample example);

    int deleteByExample(ClazzScheduleExample example);

    int deleteByPrimaryKey(Integer csid);

    int insert(ClazzSchedule record);

    int insertSelective(ClazzSchedule record);

    List<ClazzSchedule> selectByExample(ClazzScheduleExample example);

    ClazzSchedule selectByPrimaryKey(Integer csid);

    int updateByExampleSelective(@Param("record") ClazzSchedule record, @Param("example") ClazzScheduleExample example);

    int updateByExample(@Param("record") ClazzSchedule record, @Param("example") ClazzScheduleExample example);

    int updateByPrimaryKeySelective(ClazzSchedule record);

    int updateByPrimaryKey(ClazzSchedule record);
}