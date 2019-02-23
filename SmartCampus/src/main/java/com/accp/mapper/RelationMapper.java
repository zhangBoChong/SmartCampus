package com.accp.mapper;

import com.accp.domain.Relation;
import com.accp.domain.RelationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RelationMapper {
    long countByExample(RelationExample example);

    int deleteByExample(RelationExample example);

    int deleteByPrimaryKey(Integer relationId);

    int insert(Relation record);

    int insertSelective(Relation record);

    List<Relation> selectByExample(RelationExample example);

    Relation selectByPrimaryKey(Integer relationId);

    int updateByExampleSelective(@Param("record") Relation record, @Param("example") RelationExample example);

    int updateByExample(@Param("record") Relation record, @Param("example") RelationExample example);

    int updateByPrimaryKeySelective(Relation record);

    int updateByPrimaryKey(Relation record);
}