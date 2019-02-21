package com.accp.mapper;

import com.accp.domain.ClazzStudent;
import com.accp.domain.ClazzStudentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ClazzStudentMapper {
	int insertclazzStudentinfos(ClazzStudent stu);
	int countstu(Integer cid);
	int updateclazzStudent(ClazzStudent record);
	List<ClazzStudent> queryByClzStucid(Integer cid);
    long countByExample(ClazzStudentExample example);

    int deleteByExample(ClazzStudentExample example);

    int deleteByPrimaryKey(Integer czid);

    int insert(ClazzStudent record);

    int insertSelective(ClazzStudent record);

    List<ClazzStudent> selectByExample(ClazzStudentExample example);

    ClazzStudent selectByPrimaryKey(Integer czid);

    int updateByExampleSelective(@Param("record") ClazzStudent record, @Param("example") ClazzStudentExample example);

    int updateByExample(@Param("record") ClazzStudent record, @Param("example") ClazzStudentExample example);

    int updateByPrimaryKeySelective(ClazzStudent record);

    int updateByPrimaryKey(ClazzStudent record);
}