package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.PostMapper;
import com.accp.domain.PageBean;
import com.accp.domain.Post;
import com.accp.service.PostService;

@Service
@Transactional
public class PostServiceImpl implements PostService{

	@Autowired
	PostMapper postMapper;

	@Override
	public int deletePost(Integer postId) {
		// TODO Auto-generated method stub
		return postMapper.deletePost(postId);
	}

	@Override
	public PageBean<Post> queryPost(int page1) {
		List<Post> stu=postMapper.queryPost((page1-1)*3,3);
		int count=postMapper.countPost();
		PageBean<Post> pageBean1=new PageBean<Post>(3,count,page1,stu);
		return pageBean1;
	}

	@Override
	public int updatePost(String postName, Integer postId) {
		// TODO Auto-generated method stub
		return postMapper.updatePost(postName, postId);
	}

	@Override
	public List<Post> selectPost() {
		// TODO Auto-generated method stub
		return postMapper.selectPost();
	}

	@Override
	public List<Post> selectPostId(Integer postId) {
		// TODO Auto-generated method stub
		return postMapper.selectPostId(postId);
	}

	@Override
	public int insertpost(List<Post> postLists) {
		// TODO Auto-generated method stub
		return postMapper.insertpost(postLists);
	}
	
}
