package com.accp.service;

import java.util.List;

import com.accp.domain.Clazz;
import com.accp.domain.ClazzStudent;

public interface ClazzInfoService {
	public Clazz selectclazzBycid(Integer cid);
	public List<ClazzStudent> clazzallstudentBycid(Integer cid);
}
