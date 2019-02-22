package com.accp.mapper;

import com.accp.domain.ImgChildren;
import com.accp.domain.ImgChildrenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImgChildrenMapper {
    long countByExample(ImgChildrenExample example);

    int deleteByExample(ImgChildrenExample example);

    int deleteByPrimaryKey(Integer pictureId);

    int insert(ImgChildren record);

    int insertSelective(ImgChildren record);

    List<ImgChildren> selectByExample(ImgChildrenExample example);

    ImgChildren selectByPrimaryKey(Integer pictureId);

    int updateByExampleSelective(@Param("record") ImgChildren record, @Param("example") ImgChildrenExample example);

    int updateByExample(@Param("record") ImgChildren record, @Param("example") ImgChildrenExample example);

    int updateByPrimaryKeySelective(ImgChildren record);

    int updateByPrimaryKey(ImgChildren record);
}