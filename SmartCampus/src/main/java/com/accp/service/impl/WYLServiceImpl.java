package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Clazz;
import com.accp.domain.ClazzTeacher;
import com.accp.domain.Course;
import com.accp.domain.CourseTeacher;
import com.accp.domain.Staff;
import com.accp.domain.Studentinfo;
import com.accp.mapper.ClazzMapper;
import com.accp.mapper.ClazzStudentMapper;
import com.accp.mapper.ClazzTeacherMapper;
import com.accp.mapper.CourseMapper;
import com.accp.mapper.CourseTeacherMapper;
import com.accp.mapper.StaffMapper;
import com.accp.mapper.StudentinfoMapper;
import com.accp.service.WYLService;
@Service
public class WYLServiceImpl implements WYLService{
	@Autowired
	StudentinfoMapper stumapper;
	@Autowired
	StaffMapper stfmapper;
	@Autowired
	CourseMapper crsmapper;
	@Autowired
	ClazzMapper clzmapper;
	@Autowired
	CourseTeacherMapper crstmapper;
	@Autowired
	ClazzTeacherMapper clztmapper;
	@Autowired
	ClazzStudentMapper clzsmapper;

	@Override
	public List<Studentinfo> queryAllStudent() {
		// TODO Auto-generated method stub
		return stumapper.queryAllStudent();
	}

	@Override
	public List<Studentinfo> queryStudent(String sname, Integer age1, Integer age2, Integer sex, Integer characterId) {
		// TODO Auto-generated method stub
		return stumapper.queryStudent(sname, age1, age2, sex, characterId);
	}

	@Override
	public int updateStudent1(int sid) {
		// TODO Auto-generated method stub
		return stumapper.updateStudent1(sid);
	}

	@Override
	public int updateStudent2(int sid) {
		// TODO Auto-generated method stub
		return stumapper.updateStudent2(sid);
	}

	@Override
	public int updateStudent3() {
		// TODO Auto-generated method stub
		return stumapper.updateStudent3();
	}

	@Override
	public int updateStudent4() {
		// TODO Auto-generated method stub
		return stumapper.updateStudent4();
	}

	@Override
	public List<Staff> queryAllStaff(int postId) {
		// TODO Auto-generated method stub
		return stfmapper.queryAllStaff(postId);
	}

	@Override
	public List<Staff> queryStaff(Integer postId,Integer tid, String tname, Integer age1, Integer age2, Integer sex, Integer characterId) {
		// TODO Auto-generated method stub
		return stfmapper.queryStaff(postId,tid, tname, age1, age2, sex, characterId);
	}

	@Override
	public List<Course> queryAllCourse() {
		// TODO Auto-generated method stub
		return crsmapper.queryAllCourse();
	}

	@Override
	public int insert(Clazz clazz) {
		// TODO Auto-generated method stub
		return clzmapper.insert(clazz);
	}

	@Override
	public int courseTeacherinsert(CourseTeacher courseTeacher) {
		// TODO Auto-generated method stub
		return crstmapper.courseTeacherinsert(courseTeacher);
	}

	@Override
	public int clazzTeacherinsert(Integer ctid, Integer cid) {
		// TODO Auto-generated method stub
		return clztmapper.clazzTeacherinsert(ctid, cid);
	}

	@Override
	public List<Studentinfo> queryStudent2() {
		// TODO Auto-generated method stub
		return stumapper.queryStudent2();
	}

	@Override
	public int clazzStudentinsert(Integer cid, Integer sid) {
		// TODO Auto-generated method stub
		return clzsmapper.clazzStudentinsert(cid, sid);
	}

	@Override
	public int updateStudent5() {
		// TODO Auto-generated method stub
		return stumapper.updateStudent5();
	}

	@Override
	public int mc() {
		// TODO Auto-generated method stub
		return clzmapper.mc();
	}

	@Override
	public int insert2(Clazz clazz) {
		// TODO Auto-generated method stub
		return clzmapper.insert2(clazz);
	}

	@Override
	public int studentQuantity() {
		// TODO Auto-generated method stub
		return stumapper.studentQuantity();
	}

	@Override
	public int studentQuantity2() {
		// TODO Auto-generated method stub
		return stumapper.studentQuantity2();
	}

	@Override
	public int updateStudent6(int sid) {
		// TODO Auto-generated method stub
		return stumapper.updateStudent6(sid);
	}

	@Override
	public Staff queryStaff2() {
		// TODO Auto-generated method stub
		return stfmapper.queryStaff2();
	}

	@Override
	public Staff queryStaff3() {
		// TODO Auto-generated method stub
		return stfmapper.queryStaff3();
	}

	@Override
	public int updateClazz(Integer tid, Integer cid) {
		// TODO Auto-generated method stub
		return clzmapper.updateClazz(tid, cid);
	}
}
