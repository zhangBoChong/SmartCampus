package com.accp.mapper;

import com.accp.domain.AuthorityMiddle;
import com.accp.domain.AuthorityMiddleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthorityMiddleMapper {
    long countByExample(AuthorityMiddleExample example);

    int deleteByExample(AuthorityMiddleExample example);

    int deleteByPrimaryKey(Integer apid);

    int insert(AuthorityMiddle record);

    int insertSelective(AuthorityMiddle record);

    List<AuthorityMiddle> selectByExample(AuthorityMiddleExample example);

    AuthorityMiddle selectByPrimaryKey(Integer apid);

    int updateByExampleSelective(@Param("record") AuthorityMiddle record, @Param("example") AuthorityMiddleExample example);

    int updateByExample(@Param("record") AuthorityMiddle record, @Param("example") AuthorityMiddleExample example);

    int updateByPrimaryKeySelective(AuthorityMiddle record);

    int updateByPrimaryKey(AuthorityMiddle record);
}