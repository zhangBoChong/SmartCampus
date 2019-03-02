package com.accp.mapper;

import com.accp.domain.Clazzposition;
import com.accp.domain.ClazzpositionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ClazzpositionMapper {
	int insertClazzposition(Clazzposition record);

	List<Clazzposition> queryAllclazzpositions();
	Clazzposition queryBypositionid(Integer positionid);


    int deleteByExample(ClazzpositionExample example);

    int deleteByPrimaryKey(Integer clazzpositionid);

    int insert(Clazzposition record);

    int insertSelective(Clazzposition record);

    List<Clazzposition> selectByExample(ClazzpositionExample example);

    Clazzposition selectByPrimaryKey(Integer clazzpositionid);

    int updateByExampleSelective(@Param("record") Clazzposition record, @Param("example") ClazzpositionExample example);

    int updateByExample(@Param("record") Clazzposition record, @Param("example") ClazzpositionExample example);

    int updateByPrimaryKeySelective(Clazzposition record);

    int updateByPrimaryKey(Clazzposition record);
}