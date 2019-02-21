package com.accp.mapper;

import com.accp.domain.Clazz;
import com.accp.domain.ClazzExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ClazzMapper {
	List<Clazz> queryClazzs();
	List<Clazz> queryAllclazz();
	List<Clazz> queryBybid(Integer bid);
	Clazz selectBycid(Integer cid);
    long countByExample(ClazzExample example);

    int deleteByExample(ClazzExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    List<Clazz> selectByExample(ClazzExample example);

    Clazz selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByExample(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}