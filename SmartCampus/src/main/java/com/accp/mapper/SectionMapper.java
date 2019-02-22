package com.accp.mapper;

import com.accp.domain.Section;
import com.accp.domain.SectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SectionMapper {
    long countByExample(SectionExample example);

    int deleteByExample(SectionExample example);

    int deleteByPrimaryKey(Integer sectionid);

    int insert(Section record);

    int insertSelective(Section record);

    List<Section> selectByExample(SectionExample example);

    Section selectByPrimaryKey(Integer sectionid);

    int updateByExampleSelective(@Param("record") Section record, @Param("example") SectionExample example);

    int updateByExample(@Param("record") Section record, @Param("example") SectionExample example);

    int updateByPrimaryKeySelective(Section record);

    int updateByPrimaryKey(Section record);
}