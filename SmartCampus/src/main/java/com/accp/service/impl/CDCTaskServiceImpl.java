package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.CdcTask;
import com.accp.domain.Clazz;
import com.accp.domain.Staff;
import com.accp.domain.Studentinfo;
import com.accp.domain.Task;
import com.accp.domain.TaskMiddle;
import com.accp.domain.TaskStage;
import com.accp.mapper.CdcTaskMapper;
import com.accp.service.CDCTaskService;

@Service
public class CDCTaskServiceImpl implements CDCTaskService {

	@Autowired
	CdcTaskMapper taskmapper;
	

	@Override
	public List<TaskMiddle> querytask_Middle() {
		// TODO Auto-generated method stub
		return taskmapper.querytask_Middle();
	}

	@Override
	public Studentinfo queryStudentinfobyId(int sid) {
		// TODO Auto-generated method stub
		return taskmapper.queryStudentinfobyId(sid);
	}

	@Override
	public Staff queryStaffbyId(int tid) {
		// TODO Auto-generated method stub
		return taskmapper.queryStaffbyId(tid);
	}

	@Override
	public CdcTask queryCdcTaskbyId(int taskId) {
		// TODO Auto-generated method stub
		return taskmapper.queryCdcTaskbyId(taskId);
	}

	@Override
	public List<TaskMiddle> querytask_Middle1(int taskId) {
		// TODO Auto-generated method stub
		return taskmapper.querytask_Middle1(taskId);
	}

	@Override
	public List<TaskMiddle> querytask_Middle2(int publisherId) {
		// TODO Auto-generated method stub
		return taskmapper.querytask_Middle2(publisherId);
	}

	@Override
	public List<TaskMiddle> querytask_Middle3(int ryId) {
		// TODO Auto-generated method stub
		return taskmapper.querytask_Middle3(ryId);
	}

	@Override
	public List<TaskStage> queryTaskStageByTaskId(int taskId) {
		// TODO Auto-generated method stub
		return taskmapper.queryTaskStageByTaskId(taskId);
	}

	@Override
	public List<Clazz> queryClazzByCname(Integer gid) {
		// TODO Auto-generated method stub
		return taskmapper.queryClazzByCname(gid);
	}

	@Override
	public List<Studentinfo> queryStudentBySid(Integer cid) {
		// TODO Auto-generated method stub
		return taskmapper.queryStudentBySid(cid);
	}

	@Override
	public List<Staff> queryStaffNoAdmin() {
		// TODO Auto-generated method stub
		return taskmapper.queryStaffNoAdmin();
	}

	@Override
	public List<Clazz> queryClazzbytid(Integer tid) {
		// TODO Auto-generated method stub
		return taskmapper.queryClazzbytid(tid);
	}

	@Override
	public void insertCdcTask(CdcTask cTask) {
		// TODO Auto-generated method stub
		taskmapper.insertCdcTask(cTask);
		if(cTask.getLists().size()>0) {
			for (TaskStage item : cTask.getLists()) {
				item.setTaskid(cTask.getTaskId());
				insertTaskStage(item);
			}
		}
		TaskMiddle middle = cTask.getMiddle();
		middle.setTaskId(cTask.getTaskId());
		taskmapper.insertTaskMiddle(middle);
	}

	@Override
	public int insertTaskStage(TaskStage stage) {
		// TODO Auto-generated method stub
		return taskmapper.insertTaskStage(stage);
	}

	@Override
	public int insertTaskMiddle(TaskMiddle middle) {
		// TODO Auto-generated method stub
		return taskmapper.insertTaskMiddle(middle);
	}

}	
