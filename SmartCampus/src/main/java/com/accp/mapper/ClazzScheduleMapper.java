package com.accp.mapper;

import com.accp.domain.ClazzSchedule;
import com.accp.domain.ClazzScheduleExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ClazzScheduleMapper {
	List<ClazzSchedule> queryBycids(Integer cid);
	int updateStatus(@Param("cid") Integer cid,@Param("datetime1") String datetime1,@Param("datetime2") String datetime2);
	int updateClassroomId(ClazzSchedule clazzSchedule);
	int updateClazzSchedule(ClazzSchedule clazzSchedule);
	ClazzSchedule selectByClazzSchedulecid(Integer cid);
	int insertClazzSchedule(List<ClazzSchedule> list);
    long countByExample(ClazzScheduleExample example);   
    List<ClazzSchedule> queryClazzSchedule(@Param("cid") Integer cid,@Param("datetime1") String datetime1,@Param("datetime2") String datetime2);
    List<ClazzSchedule> queryClazzSchedule1(@Param("cid") Integer cid,@Param("datetime1") String datetime1,@Param("datetime2") String datetime2);
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