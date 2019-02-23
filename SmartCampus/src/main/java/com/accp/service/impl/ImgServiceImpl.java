package com.accp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.ImgMapper;
import com.accp.domain.Img;
import com.accp.service.ImgService;

@Service
@Transactional
public class ImgServiceImpl implements ImgService{

	@Autowired
	ImgMapper imgMapper;

	@Override
	public Img selectImgid(Integer img_id) {
		// TODO Auto-generated method stub
		return imgMapper.selectImgid(img_id);
	}

	@Override
	public int inserttp(Integer delete_id) {
		// TODO Auto-generated method stub
		return imgMapper.inserttp(delete_id);
	}

	@Override
	public int selectimg_id1() {
		// TODO Auto-generated method stub
		return imgMapper.selectimg_id1();
	}
	
}
