package com.accp.mapper;

import com.accp.domain.Affiche;
import com.accp.domain.AfficheExample;

import java.util.Date;
import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AfficheMapper {
    long countByExample(AfficheExample example);

    int deleteByExample(AfficheExample example);

    int deleteByPrimaryKey(Integer afficheId);

    int insert(Affiche record);

    int insertSelective(Affiche record);

    List<Affiche> selectByExample(AfficheExample example);

    Affiche selectByPrimaryKey(Integer afficheId);

    int updateByExampleSelective(@Param("record") Affiche record, @Param("example") AfficheExample example);

    int updateByExample(@Param("record") Affiche record, @Param("example") AfficheExample example);

    int updateByPrimaryKeySelective(Affiche record);

    int updateByPrimaryKey(Affiche record);
    
    //删除公告
    int deleteAffiche(@Param("affiche_id") Integer affiche_id);
    
    //发布公告
    int insertgg(List<Affiche> afficheList);
    
    //查询收到的公告
    //List<Affiche> selectAffiche(@Param("start") Integer start,@Param("size") Integer size,@Param("startime") Date startime,@Param("endtime") Date endtime,@Param("affiche_title") String affiche_title,@Param("affiche_sendee") Integer affiche_sendee);
    
    //count  Affiche表
    int affCount(@Param("startime") Date startime,@Param("endtime") Date endtime,@Param("affiche_title") String affiche_title,@Param("affiche_sendee") Integer affiche_sendee);
    
    //查询公告发布人
    List<Affiche> selectPeople(@Param("affiche_sendee") Integer affiche_sendee);
    
    //查询公告列表
    List<Affiche> cx_Affiche(@Param("startime") Date startime,@Param("endtime") Date endtime,@Param("affiche_title") String affiche_title,@Param("affiche_sendee") String affiche_sendee,@Param("affiche_id") Integer affiche_id);
}