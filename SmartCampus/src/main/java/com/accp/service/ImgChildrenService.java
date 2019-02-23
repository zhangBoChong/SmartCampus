package com.accp.service;

import java.util.List;

import com.accp.domain.ImgChildren;

public interface ImgChildrenService {
	//按img_id 查询
    List<ImgChildren> selectImg_children(Integer img_id);
  //新增图片子表
    int inserttpc(ImgChildren ic);
}
