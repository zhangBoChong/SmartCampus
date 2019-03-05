package com.accp.service;

import java.util.List;

import com.accp.domain.Parents;
import com.accp.domain.Studentinfo;

public interface StudentinfoService {
	 public int insertSelective(Studentinfo record,Parents p);
	 public List<Studentinfo> selectBystatus();
	 public int updateByPrimaryKeySelective(Studentinfo record,Parents p);
	 public Studentinfo selectBysid(Integer sid);
	 //-----------------------
	 public Studentinfo selectallinfo(Integer sid);
	 
	//查状态为3,游离
		List<Studentinfo> queryBystatus3();
	//按sid查询学生表
	    Studentinfo queryBysid1(Integer sid);
	    
	  //修改学生状态
	    int updatestudentstatus(Integer status,Integer sid);
	    
	    //
	    List<Studentinfo> queryBysidnnn(Integer sid);
	  //删除学员
		int deleteStudents(Integer sid);	
		//新增报名学员
		int addStudentinfo4(Studentinfo stu);
		//查状态为4，新生
		List<Studentinfo> queryBystatus();
}
