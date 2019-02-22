package com.accp.mapper;

import com.accp.domain.Character;
import com.accp.domain.CharacterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CharacterMapper {
    long countByExample(CharacterExample example);

    int deleteByExample(CharacterExample example);

    int deleteByPrimaryKey(Integer characterid);

    int insert(Character record);

    int insertSelective(Character record);

    List<Character> selectByExample(CharacterExample example);

    Character selectByPrimaryKey(Integer characterid);

    int updateByExampleSelective(@Param("record") Character record, @Param("example") CharacterExample example);

    int updateByExample(@Param("record") Character record, @Param("example") CharacterExample example);

    int updateByPrimaryKeySelective(Character record);

    int updateByPrimaryKey(Character record);
}