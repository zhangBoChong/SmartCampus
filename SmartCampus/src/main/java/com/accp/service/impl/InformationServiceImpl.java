package com.accp.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.accp.mapper.InformationMapper;
import com.accp.domain.Information;
import com.accp.domain.Login;
import com.accp.service.InformationService;

@Service
@Transactional
public class InformationServiceImpl implements InformationService{

	@Autowired
	InformationMapper informationMapper;

	@Override
	public List<Information> selectInformation(Integer delete_id, Integer information_sendee) {
		// TODO Auto-generated method stub
		return informationMapper.selectInformation(delete_id, information_sendee);
	}

	@Override
	public List<Information> queryByinformation_id(Integer information_id) {
		// TODO Auto-generated method stub
		return informationMapper.queryByinformation_id(information_id);
	}

	@Override
	public int deleteInformation(Integer information_id) {
		// TODO Auto-generated method stub
		return informationMapper.deleteInformation(information_id);
	}

	@Override
	public int insertInformation(List<Information> informationList) {
		// TODO Auto-generated method stub
		return informationMapper.insertInformation(informationList);
	}

	@Override
	/**
	 * 发布任务消息通知接口
	 * @return
	 */
	public int publishassignment(List<Information> information_sendeeList) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		int count = 0;
		Login l1 = (Login)session.getAttribute("u");
		if(l1.getType() == -3){
			List<Information> informationList = new ArrayList<>();
			for(Information info1 : information_sendeeList) {
				Information assignment = new Information();
				assignment.setU_id(-1);//员工编号
				assignment.setDelete_id(1);
				assignment.setInformation_type(1);//1为非系统消息
				assignment.setInformation_time(new Date());
				assignment.setInformation_sendee(info1.getInformation_sendee());//接收对象
				assignment.setInformation_fetch(1);//0为已读，1为未读
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E a hh:mm:ss");// 年-月-日 星期几 上、下午 时：分：秒 
				assignment.setInformation_content("您有一条新任务于"+sdf.format(date)+"发布，请注意查收！！！<a href='#'>跳转>>></a>");
				informationList.add(assignment);
				count = informationMapper.insertInformation(informationList);
			}
		}
		return count;
	}

	@Override
	public int selectcountinformation_fetch() {
		// TODO Auto-generated method stub
		return informationMapper.selectcountinformation_fetch();
	}

	@Override
	public int updateinformation_fetch(Integer information_id) {
		// TODO Auto-generated method stub
		return informationMapper.updateinformation_fetch(information_id);
	}

	@Override
	public int selectinformation_id(Integer information_type, Integer information_sendee) {
		// TODO Auto-generated method stub
		return informationMapper.selectinformation_id(information_type, information_sendee);
	}

	@Override
	/**
	 * 发布考试消息通知接口
	 */
	public int publishexaminations(List<Information> information_sendeeList1) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		int count = 0;
		Login l2 = (Login)session.getAttribute("u");
		if(l2.getType() == -3){
			List<Information> informationList = new ArrayList<>();
			for(Information info1 : information_sendeeList1) {
				Information assignment = new Information();
				assignment.setU_id(-1);//员工编号
				assignment.setDelete_id(1);
				assignment.setInformation_type(1);//1为非系统消息
				assignment.setInformation_time(new Date());
				assignment.setInformation_sendee(info1.getInformation_sendee());//接收对象
				assignment.setInformation_fetch(1);//0为已读，1为未读
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E a hh:mm:ss");// 年-月-日 星期几 上、下午 时：分：秒 
				assignment.setInformation_content("您有一场新考试于"+sdf.format(date)+"发布，请注意查收！！！<a href='#'>跳转>>></a>");
				informationList.add(assignment);
				count = informationMapper.insertInformation(informationList);
			}
		}
		return count;
	}

	@Override
	/**
	 * 发布作业消息接口
	 */
	public int publishbusywork(List<Information> information_sendeeList2) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		int count = 0;
		Login l3 = (Login)session.getAttribute("u");
		if(l3.getType() == -3){
			List<Information> informationList = new ArrayList<>();
			for(Information info1 : information_sendeeList2) {
				Information assignment = new Information();
				assignment.setU_id(-1);//员工编号
				assignment.setDelete_id(1);
				assignment.setInformation_type(1);//1为非系统消息
				assignment.setInformation_time(new Date());
				assignment.setInformation_sendee(info1.getInformation_sendee());//接收对象
				assignment.setInformation_fetch(1);//0为已读，1为未读
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E a hh:mm:ss");// 年-月-日 星期几 上、下午 时：分：秒 
				assignment.setInformation_content("您有新作业于"+sdf.format(date)+"发布，请注意查收！！！<a href='#'>跳转>>></a>");
				informationList.add(assignment);
			}
			count = informationMapper.insertInformation(informationList);
		}
		return count;
	}
	
}
