package com.accp.service;

import java.util.Date;
import java.util.List;

import com.accp.domain.Affiche;

public interface AfficheService {
	//查询收到的公告
	//PageBean<Affiche> selectAffiche(int page,Date startime,Date endtime,String affiche_title,Integer affiche_sendee);
	
	//查询公告发布人
    List<Affiche> selectPeople(Integer affiche_sendee);
    
  //查询公告列表
    List<Affiche> cx_Affiche(Date startime,Date endtime,String affiche_title,String affiche_sendee,Integer affiche_id);

  //发布公告
    int insertgg(List<Affiche> afficheList);
    
  //删除公告
    int deleteAffiche(Integer affiche_id);
}
