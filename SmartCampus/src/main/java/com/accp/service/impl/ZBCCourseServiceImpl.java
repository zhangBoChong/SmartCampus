package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Clazz;
import com.accp.domain.Ctc;
import com.accp.domain.Grade;
import com.accp.domain.Staff;
import com.accp.domain.Vession;
import com.accp.domain.VessionGrade;
import com.accp.domain.VessionGradeMajoridCourse;
import com.accp.mapper.ClazzMapper;
import com.accp.mapper.CtcMapper;
import com.accp.mapper.GradeMapper;
import com.accp.mapper.StaffMapper;
import com.accp.mapper.VessionGradeMajoridCourseMapper;
import com.accp.mapper.VessionGradeMapper;
import com.accp.mapper.VessionMapper;
import com.accp.service.ZBCCourseService;
@Service
public class ZBCCourseServiceImpl implements ZBCCourseService{
	@Autowired
	VessionGradeMajoridCourseMapper mapper;
	@Autowired
	VessionGradeMapper vgmapper;
	@Autowired
	VessionMapper vmapper;	
	@Autowired
	GradeMapper gmapper;
	@Autowired
	StaffMapper smmapper;
	@Autowired
	CtcMapper ctcmapper;
	@Autowired
	ClazzMapper clzmapper;
	/**
	 * 查看所有课程
	 */
	@Override
	public List<VessionGradeMajoridCourse> queryAll() {
		List<VessionGradeMajoridCourse> list=mapper.queryAll();
		for (VessionGradeMajoridCourse v : list) {
			VessionGrade vg=vgmapper.queryByBid(v.getVgjd().getBid());
			Grade grade=gmapper.queryByGid(vg.getGid());
			vg.setGrade(grade);
			Vession vession=vmapper.queryByVid(vg.getVid());
			vg.setVession(vession);
			List<Ctc> ctcs=ctcmapper.queryBycourseId(v.getCourse().getCourseId());
			for (Ctc ct : ctcs) {
				Staff staff=smmapper.queryBytid(ct.getTid());
				Clazz clazz=clzmapper.queryBycid(ct.getTid());
				ct.setClazz(clazz);
				ct.setStaff(staff);
			}
			v.setCtc(ctcs);
			v.getVgjd().setVessionGrade(vg);
			
			
		}
		return list;
	}
	/**
	 * 查看版本年级中间表
	 */
	@Override
	public VessionGrade queryByBid(Integer bid) {
		VessionGrade vg=vgmapper.queryByBid(bid);
		return vg;
	}

	@Override
	public List<Ctc> queryBycourseId(Integer courseid) {
		List<Ctc> list=ctcmapper.queryBycourseId(courseid);
		return list;
	}
	@Override
	public Staff queryBytid(Integer tid) {
		Staff staff=smmapper.queryBytid(tid);
		return staff;
	}
	@Override
	public Clazz queryBycid(Integer cid) {
		Clazz clazz=clzmapper.queryBycid(cid);
		return clazz;
	}
	

}
