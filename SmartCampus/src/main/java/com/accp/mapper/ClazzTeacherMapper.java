package com.accp.mapper;

import com.accp.domain.ClazzTeacher;
import com.accp.domain.ClazzTeacherExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ClazzTeacherMapper {
    int clazzTeacherinsert(Integer ctid,Integer cid);
}