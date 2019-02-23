package com.accp.service;

import com.accp.domain.Img;

public interface ImgService {
	//按imgid查询
	Img selectImgid(Integer img_id);
	//新增图片
    int inserttp(Integer delete_id);
  //查询最新img_id
    int selectimg_id1();
}
