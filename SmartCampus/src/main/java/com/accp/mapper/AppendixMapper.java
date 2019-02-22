package com.accp.mapper;

import com.accp.domain.Appendix;
import com.accp.domain.AppendixExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppendixMapper {
    long countByExample(AppendixExample example);

    int deleteByExample(AppendixExample example);

    int deleteByPrimaryKey(Integer appendixId);

    int insert(Appendix record);

    int insertSelective(Appendix record);

    List<Appendix> selectByExample(AppendixExample example);

    Appendix selectByPrimaryKey(Integer appendixId);

    int updateByExampleSelective(@Param("record") Appendix record, @Param("example") AppendixExample example);

    int updateByExample(@Param("record") Appendix record, @Param("example") AppendixExample example);

    int updateByPrimaryKeySelective(Appendix record);

    int updateByPrimaryKey(Appendix record);
}