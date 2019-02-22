package com.accp.mapper;

import com.accp.domain.Studentinfo;
import com.accp.domain.StudentinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentinfoMapper {
    long countByExample(StudentinfoExample example);

    int deleteByExample(StudentinfoExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Studentinfo record);

    int insertSelective(Studentinfo record);

    List<Studentinfo> selectByExample(StudentinfoExample example);

    Studentinfo selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);

    int updateByExample(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);

    int updateByPrimaryKeySelective(Studentinfo record);

    int updateByPrimaryKey(Studentinfo record);
}