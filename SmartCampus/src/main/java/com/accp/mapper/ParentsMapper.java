package com.accp.mapper;

import com.accp.domain.Parents;
import com.accp.domain.ParentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParentsMapper {
    long countByExample(ParentsExample example);

    int deleteByExample(ParentsExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Parents record);

    int insertSelective(Parents record);

    List<Parents> selectByExample(ParentsExample example);

    Parents selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Parents record, @Param("example") ParentsExample example);

    int updateByExample(@Param("record") Parents record, @Param("example") ParentsExample example);

    int updateByPrimaryKeySelective(Parents record);

    int updateByPrimaryKey(Parents record);
}