package com.accp.service;

import java.util.List;

import com.accp.domain.Clazz;
import com.accp.domain.ClazzStudent;
import com.accp.domain.Staff;

public interface ClazzInfoService {
	public Clazz selectclazzBycid(Integer cid);
	public List<ClazzStudent> clazzallstudentBycid(Integer cid);
	public Staff selectstaffclazz(Integer tid);
}
