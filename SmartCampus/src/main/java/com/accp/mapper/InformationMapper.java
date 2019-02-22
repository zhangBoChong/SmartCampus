package com.accp.mapper;

import com.accp.domain.Information;
import com.accp.domain.InformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InformationMapper {
    long countByExample(InformationExample example);

    int deleteByExample(InformationExample example);

    int deleteByPrimaryKey(Integer informationId);

    int insert(Information record);

    int insertSelective(Information record);

    List<Information> selectByExample(InformationExample example);

    Information selectByPrimaryKey(Integer informationId);

    int updateByExampleSelective(@Param("record") Information record, @Param("example") InformationExample example);

    int updateByExample(@Param("record") Information record, @Param("example") InformationExample example);

    int updateByPrimaryKeySelective(Information record);

    int updateByPrimaryKey(Information record);
}