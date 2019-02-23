package com.accp.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.AfficheMapper;
import com.accp.domain.Affiche;
import com.accp.service.AfficheService;

@Service
@Transactional
public class AfficheServiceImpl implements AfficheService{

	@Autowired
	AfficheMapper afficheMapper;

	/*@Override
	public PageBean<Affiche> selectAffiche(int page, Date startime, Date endtime, String affiche_title,
			Integer affiche_sendee) {
		List<Affiche> sff = afficheMapper.selectAffiche((page-1)*2, 2, startime, endtime, affiche_title, affiche_sendee);
		
		int count = afficheMapper.affCount(startime, endtime, affiche_title, affiche_sendee);
		PageBean<Affiche> pagebean6 = new PageBean<Affiche>(2, count, page, sff);
		return pagebean6;
	}
*/
	@Override
	public List<Affiche> selectPeople(Integer affiche_sendee) {
		// TODO Auto-generated method stub
		return afficheMapper.selectPeople(affiche_sendee);
	}

	@Override
	public List<Affiche> cx_Affiche(Date startime, Date endtime, String affiche_title, String affiche_sendee,Integer affiche_id) {
		// TODO Auto-generated method stub
		return afficheMapper.cx_Affiche(startime, endtime, affiche_title, affiche_sendee,affiche_id);
	}

	@Override
	public int deleteAffiche(Integer affiche_id) {
		// TODO Auto-generated method stub
		return afficheMapper.deleteAffiche(affiche_id);
	}

	@Override
	public int insertgg(List<Affiche> afficheList) {
		// TODO Auto-generated method stub
		return afficheMapper.insertgg(afficheList);
	}


}
