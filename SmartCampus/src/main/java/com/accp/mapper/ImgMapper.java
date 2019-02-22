package com.accp.mapper;

import com.accp.domain.Img;
import com.accp.domain.ImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImgMapper {
    long countByExample(ImgExample example);

    int deleteByExample(ImgExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(Img record);

    int insertSelective(Img record);

    List<Img> selectByExample(ImgExample example);

    Img selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") Img record, @Param("example") ImgExample example);

    int updateByExample(@Param("record") Img record, @Param("example") ImgExample example);

    int updateByPrimaryKeySelective(Img record);

    int updateByPrimaryKey(Img record);
}