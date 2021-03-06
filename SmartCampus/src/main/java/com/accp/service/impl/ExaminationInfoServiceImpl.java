package com.accp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.ClazzStudent;
import com.accp.domain.ClazzStudentExamInfo;
import com.accp.domain.Examination;
import com.accp.domain.ExaminationFb;
import com.accp.domain.ExaminationTm;
import com.accp.domain.Havetask;
import com.accp.domain.Havetaskexam;
import com.accp.domain.Studentinfo;
import com.accp.mapper.ClazzStudentMapper;
import com.accp.mapper.ExaminationFbMapper;
import com.accp.mapper.ExaminationMapper;
import com.accp.mapper.ExaminationTmMapper;
import com.accp.mapper.HavetaskexamMapper;
import com.accp.mapper.StudentinfoMapper;
import com.accp.service.ExaminationInfoService;

@Service
@Transactional
public class ExaminationInfoServiceImpl implements ExaminationInfoService{
	@Autowired
	ExaminationFbMapper efbmapper; 
	@Autowired
	HavetaskexamMapper hmapper;
	@Autowired
	ClazzStudentMapper clsmapper;
	@Autowired
	ExaminationTmMapper etmmapper; 
	@Autowired
	StudentinfoMapper smapper;
	@Autowired
	ExaminationMapper emapper;
	
	@Override
	public List<ExaminationFb> selectBycsid(Integer csid) {
		List<ExaminationFb> list=efbmapper.selectBycsid(csid);
		return list;
	}

	@Override
	public List<Havetaskexam> examscoreBysid(Integer sid) {
		//考试信息（分数、考试名称）
		ClazzStudent csobj=clsmapper.selectclazzstudentBysidtan(sid);
		System.out.println("考试信息sid:"+csobj.getCzid());
		List<Havetaskexam> list=hmapper.examscoreBysid(csobj.getCzid());
		return list;
	}
	
	public List<ClazzStudentExamInfo> selectstudentexamBycid(Integer cid){
		//班级学员所有考试信息
		//一个班级的所有学员
		List<ClazzStudent> list=clsmapper.clazzallstudentBycid(cid);
		List<ClazzStudentExamInfo> elist=new ArrayList<ClazzStudentExamInfo>();
		for (ClazzStudent c : list) {
			//一个学员的所有考试信息
			List<Havetaskexam> hlist=hmapper.examscoreBysid(c.getCzid());
			ClazzStudentExamInfo cse=new ClazzStudentExamInfo();
			cse.setStu(c.getStuobj());
			cse.setExamlist(hlist);
			elist.add(cse);
		}
		return elist;
	}
	
	public List<ClazzStudentExamInfo> canupclazzStudentexaminfo(Integer [] sid){
		//可以升学的学员考试信息(升学鉴定表)
		List<Studentinfo> slist=smapper.canupclazzBysidArray(sid);
		List<ClazzStudentExamInfo> list=new ArrayList<ClazzStudentExamInfo>();
		for (Studentinfo s : slist) {
			//一个学员的考试信息(交班考试 结业考试)
			System.out.println("sid:"+s.getSid());
			ClazzStudent csobj=clsmapper.selectclazzstudentBysidtan(s.getSid());
			System.out.println("czid:"+csobj.getCzid());
			List<Havetaskexam> hlist=hmapper.examscoreBysidTow(csobj.getCzid());
			ClazzStudentExamInfo cse=new ClazzStudentExamInfo();
			cse.setStu(s);
			cse.setExamlist(hlist);
			list.add(cse);
		}
		for (ClazzStudentExamInfo e : list) {
			System.out.println(e.getStu().getSnumber()+"--"+e.getStu().getSname());
			for (Havetaskexam h : e.getExamlist()) {
				//System.out.println(h.getExamobj().getCoursename().getCoursename());
				System.out.println(h.getScore());
			}
		}
		
		return list;
	}
	
	
	public List<ExaminationTm> selectallexamtim(){
		//所有考试题目
		List<ExaminationTm> list=etmmapper.selectallexamtim();
		for (ExaminationTm etm : list) {
			//题目错误次数
			int mistake=hmapper.chmistakecountBytopicid(etm.getTopic_id());
			etm.setMistakecount(mistake);
			System.out.println("错误数:"+etm.getMistakecount());
		}
		return list;
	}

	@Override
	public List<ExaminationTm> selectexamtimByexamid(Integer examinationId) {
		//题目信息
		List<ExaminationTm> list=etmmapper.selectexamtimByexamid(examinationId);
		for (ExaminationTm etm : list) {
			//题目错误次数
			int mistake=hmapper.chmistakecountBytopicid(etm.getTopic_id());
			//System.out.println("题目错误次数:"+mistake);
			etm.setMistakecount(mistake);
			System.out.println("错误数:"+etm.getMistakecount());
			//题目错误的学员
			//System.out.println("--"+etm.getTopicId());
			List<Havetaskexam> mistake1=hmapper.chmistakestudents(etm.getTopic_id());
			etm.setMistakestu(mistake1);
			//System.out.println("--"+etm.getMistakestu());
			for (Havetaskexam h : etm.getMistakestu()) {
				System.out.println("题目错误的学员--"+h.getCstuobj().getStuobj().getSname());
			}
		}
		return list;
	}

	@Override
	public List<Examination> chaexamBytidtan(Integer tid) {
		//老师出的考试试卷
		return emapper.chaexamBytidtan(tid);
	}
	

}
