package com.accp.mapper;

import com.accp.domain.Post;
import com.accp.domain.PostExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PostMapper {
    long countByExample(PostExample example);

    int deleteByExample(PostExample example);

    int deleteByPrimaryKey(Integer postid);

    int insert(Post record);

    int insertSelective(Post record);

    List<Post> selectByExample(PostExample example);

    Post selectByPrimaryKey(Integer postid);

    int updateByExampleSelective(@Param("record") Post record, @Param("example") PostExample example);

    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
    
    //按postId查询职位名称
    List<Post> selectPostId(@Param("postId") Integer postId);
    
    //查询职位下拉框
    List<Post> selectPost();
    
    //查询职位表
    List<Post> queryPost(@Param("start") Integer start,@Param("size") Integer size);
    
    //删除职位
    int deletePost(@Param("postId") Integer postId);
    
    //count 职位表
    int countPost();
    
    //修改职位表
    int updatePost(@Param("postName") String postName,@Param("postId") Integer postId);
    
    //添加职位
    int insertpost(List<Post> postLists);

}