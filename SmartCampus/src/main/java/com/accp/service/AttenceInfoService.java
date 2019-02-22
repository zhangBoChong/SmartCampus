package com.accp.service;

import java.util.List;

import com.accp.domain.AttenceCount;
import com.accp.domain.ClazzStudent;

public interface AttenceInfoService {
	public AttenceCount selectattenceBysidlx(Integer studentid);
	public List<ClazzStudent> selectallstuattenceBycid(Integer cid);
}
