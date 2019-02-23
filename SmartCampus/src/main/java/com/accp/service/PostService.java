package com.accp.service;

import java.util.List;

import com.accp.domain.PageBean;
import com.accp.domain.Post;

public interface PostService {
	//查询职位表
	PageBean<Post> queryPost(int page1);
    
    //删除职位
    int deletePost(Integer postId);
    
  //修改职位表
    int updatePost(String postName,Integer postId);
    
  //查询职位下拉框
    List<Post> selectPost();
    
  //按postId查询职位名称
    List<Post> selectPostId(Integer postId);
    
  //添加职位
    int insertpost(List<Post> postLists);
}
