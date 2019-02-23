package com.accp.service;

import java.util.List;

import com.accp.domain.Grade;

public interface GradeService {
	//查询所有年级
    List<Grade> selectGrade();
  //按gid查询年级名称
    Grade selectBygid(Integer gid);
}
