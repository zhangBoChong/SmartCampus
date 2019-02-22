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
	 
}
