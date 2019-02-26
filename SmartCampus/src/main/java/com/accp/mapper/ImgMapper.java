package com.accp.mapper;

import com.accp.domain.Img;
import com.accp.domain.ImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
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
    
    //查询最新img_id
    int selectimg_id1();
    
    //按imgid查询
    Img selectImgid(@Param("img_id") Integer img_id);
    
    //新增图片
    int inserttp(@Param("delete_id") Integer delete_id);
}