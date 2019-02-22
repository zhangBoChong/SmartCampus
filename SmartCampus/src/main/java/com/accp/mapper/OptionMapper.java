package com.accp.mapper;

import com.accp.domain.Option;
import com.accp.domain.OptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OptionMapper {
    long countByExample(OptionExample example);

    int deleteByExample(OptionExample example);

    int deleteByPrimaryKey(Integer optionId);

    int insert(Option record);

    int insertSelective(Option record);

    List<Option> selectByExample(OptionExample example);

    Option selectByPrimaryKey(Integer optionId);

    int updateByExampleSelective(@Param("record") Option record, @Param("example") OptionExample example);

    int updateByExample(@Param("record") Option record, @Param("example") OptionExample example);

    int updateByPrimaryKeySelective(Option record);

    int updateByPrimaryKey(Option record);
}