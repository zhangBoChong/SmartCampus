package com.accp.service;

import java.util.List;

import com.accp.domain.Clazz;

public interface ClazzService {
	//查询所有班级
    List<Clazz> selectClazz();
    //按cid查询班级表
    Clazz clazzBycid(Integer cid);
}
