package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.accp.domain.CdcTask;
import com.accp.domain.Clazz;
import com.accp.domain.Staff;
import com.accp.domain.Studentinfo;
import com.accp.domain.TaskMiddle;
import com.accp.domain.TaskStage;

@Mapper
public interface CdcTaskMapper {
//学员登录时任务表数据
	public List<TaskMiddle> querytask_Middle1(int ryId);
//教员登录时任务表数据	
	public List<TaskMiddle> querytask_Middle2(int publisherId);
//门卫大叔登录时任务表数据
	public List<TaskMiddle> querytask_Middle3(int ryId);
//管理层登录时任务表数据	
	public List<TaskMiddle> querytask_Middle();
//	按学员ID查询学员
	public Studentinfo queryStudentinfobyId(int sid);
//	按员工ID查询员工
	public Staff queryStaffbyId(int tid);
//  按任务ID查询任务
	public CdcTask queryCdcTaskbyId(int taskId);
//	按任务ID查询任务阶段
	public List<TaskStage> queryTaskStageByTaskId(int taskId);
//	通过年级Id到中间表查询到班级名称
	public List<Clazz> queryClazzByCname(Integer gid);
//	通过班级Id到中间表查询到学生Id，学生Id到学生表查询学生
	public List<Studentinfo> queryStudentBySid(Integer cid);
//	查询到所有不为管理员的员工
	public List<Staff> queryStaffNoAdmin();
//	通过教师Id到中间表查询到 当前教师所带的班级id 再到班级表查询到班级
	public List<Clazz> queryClazzbytid(Integer tid);
//	新增任务主表
	public int insertCdcTask(CdcTask cTask);
//	插入任务阶段表
	public int insertTaskStage(TaskStage stage);
//	插入中间表
	public int insertTaskMiddle(TaskMiddle middle);

}
