package com.accp.mapper;

import com.accp.domain.ClazzTeacher;
import com.accp.domain.ClazzTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClazzTeacherMapper {
    long countByExample(ClazzTeacherExample example);

    int deleteByExample(ClazzTeacherExample example);

    int deleteByPrimaryKey(Integer tcid);

    int insert(ClazzTeacher record);

    int insertSelective(ClazzTeacher record);

    List<ClazzTeacher> selectByExample(ClazzTeacherExample example);

    ClazzTeacher selectByPrimaryKey(Integer tcid);

    int updateByExampleSelective(@Param("record") ClazzTeacher record, @Param("example") ClazzTeacherExample example);

    int updateByExample(@Param("record") ClazzTeacher record, @Param("example") ClazzTeacherExample example);

    int updateByPrimaryKeySelective(ClazzTeacher record);

    int updateByPrimaryKey(ClazzTeacher record);
}