package com.accp.service;

import java.util.List;

import com.accp.domain.Information;

public interface InformationService {
    
  //查询消息
    List<Information> selectInformation(Integer delete_id,Integer information_sendee);
    
  //按information_id查询消息内容
    List<Information> queryByinformation_id(Integer information_id);
    
  //删除消息
    int deleteInformation(Integer information_id);

  //登录消息通知
    int insertInformation(List<Information> informationList);
    
    //发布任务消息通知接口
    int publishassignment(List<Information> information_sendeeList);
    
    //发布考试消息通知接口
    int publishexaminations(List<Information> information_sendeeList1);
    
  //发布作业消息接口
    int publishbusywork(List<Information> information_sendeeList2);
    
  //查询未读消息
    int selectcountinformation_fetch(Integer information_fetch,Integer information_sendee);
    
  //修改消息状态
    int updateinformation_fetch(Integer information_id);
    
  //查询最新一条并且是当前登录用户的登录提示信息
    Information selectinformation_id(Integer information_type,Integer information_sendee);
    
  //自定义消息接口
    int insertInformations(List<Information> informationLists);
}
