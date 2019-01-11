package com.accp.service;

import java.util.List;

import com.accp.domain.Clazz;
import com.accp.domain.Ctc;
import com.accp.domain.Staff;
import com.accp.domain.VessionGrade;
import com.accp.domain.VessionGradeMajoridCourse;

public interface ZBCCourseService {
	//查看所有课程
	List<VessionGradeMajoridCourse> queryAll();
	//查看版本年级中间表
	VessionGrade queryByBid(Integer bid);
	//根据课程id查询出Ctc表数据
	List<Ctc> queryBycourseId(Integer courseid);
	//tid查询教员
	Staff queryBytid(Integer tid);
	//cid查询班级
	Clazz queryBycid(Integer cid);

}
