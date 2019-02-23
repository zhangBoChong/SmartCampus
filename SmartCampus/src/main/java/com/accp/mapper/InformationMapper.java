package com.accp.mapper;

import com.accp.domain.Information;
import com.accp.domain.InformationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InformationMapper {
    long countByExample(InformationExample example);

    int deleteByExample(InformationExample example);

    int deleteByPrimaryKey(Integer informationId);

    int insert(Information record);

    int insertSelective(Information record);

    List<Information> selectByExample(InformationExample example);

    Information selectByPrimaryKey(Integer informationId);

    int updateByExampleSelective(@Param("record") Information record, @Param("example") InformationExample example);

    int updateByExample(@Param("record") Information record, @Param("example") InformationExample example);

    int updateByPrimaryKeySelective(Information record);

    int updateByPrimaryKey(Information record);
    
    //登录消息通知
    int insertInformation(List<Information> informationList);
    
    //查询消息
    List<Information> selectInformation(@Param("delete_id") Integer delete_id,@Param("information_sendee") Integer information_sendee);
    
    //按information_id查询消息内容
    List<Information> queryByinformation_id(@Param("information_id") Integer information_id);
    
    //删除消息
    int deleteInformation(@Param("information_id") Integer information_id);
    
    //查询未读消息
    int selectcountinformation_fetch();
    
    //修改消息状态
    int updateinformation_fetch(@Param("information_id") Integer information_id);
    
    //查询最新一条并且是当前登录用户的登录提示信息
    int selectinformation_id(@Param("information_type") Integer information_type,@Param("information_sendee") Integer information_sendee);
}