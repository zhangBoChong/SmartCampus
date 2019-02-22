package com.accp.mapper;

import com.accp.domain.Affiche;
import com.accp.domain.AfficheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AfficheMapper {
    long countByExample(AfficheExample example);

    int deleteByExample(AfficheExample example);

    int deleteByPrimaryKey(Integer afficheId);

    int insert(Affiche record);

    int insertSelective(Affiche record);

    List<Affiche> selectByExample(AfficheExample example);

    Affiche selectByPrimaryKey(Integer afficheId);

    int updateByExampleSelective(@Param("record") Affiche record, @Param("example") AfficheExample example);

    int updateByExample(@Param("record") Affiche record, @Param("example") AfficheExample example);

    int updateByPrimaryKeySelective(Affiche record);

    int updateByPrimaryKey(Affiche record);
}