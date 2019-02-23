package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.ImgChildrenMapper;
import com.accp.domain.ImgChildren;
import com.accp.service.ImgChildrenService;

@Service
@Transactional
public class ImgChildrenServiceImpl implements ImgChildrenService{

	@Autowired
	ImgChildrenMapper imgChildrenMapper;

	@Override
	public List<ImgChildren> selectImg_children(Integer img_id) {
		// TODO Auto-generated method stub
		return imgChildrenMapper.selectImg_children(img_id);
	}

	@Override
	public int inserttpc(ImgChildren ic) {
		// TODO Auto-generated method stub
		return imgChildrenMapper.inserttpc(ic);
	}
	
}
