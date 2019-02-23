package com.accp.service;

import com.accp.domain.ClazzStudent;

public interface ClazzStudentService {
	//按sid查询班级学员中间表
    ClazzStudent clazz_studentBysid(Integer sid);
}
