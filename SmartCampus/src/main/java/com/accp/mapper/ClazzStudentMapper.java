package com.accp.mapper;

import com.accp.domain.ClazzStudent;
import com.accp.domain.ClazzStudentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ClazzStudentMapper {
    int clazzStudentinsert(Integer cid,Integer sid);
}