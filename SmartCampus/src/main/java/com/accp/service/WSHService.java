package com.accp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.domain.Course;
import com.accp.domain.Examination;
import com.accp.domain.ExaminationLx;
import com.accp.domain.Grade;
import com.accp.domain.Section;
import com.accp.domain.Task;
import com.accp.domain.TaskLx;
import com.accp.domain.Topic;
import com.accp.domain.TopicLx;
import com.accp.domain.TopicNeiRong;
import com.accp.domain.Vession;
import com.accp.domain.ZuoYeGuanLi;

public interface WSHService {
	//版本
	List<Vession> vessionQuery();
	//年级
	List<Grade> queryByVid(Integer vid);
	//课程
	List<Course> queryByVidGid( Integer vid,Integer gid);
	//章节
	List<Section> queryByVidGidCourseId( Integer vid, Integer gid, Integer courseId);
	//难易度
	List<Topic> queryTopic();
	//题目类型
	List<TopicLx> queryTopicLx();
	//查询题库内容
	List<TopicNeiRong> queryByXiaLaKuangTiaoJian( Integer vid, Integer gid, Integer courseId, Integer sectionId, Integer topic_lx_id, String topic_level);
	//删除题目
	int deleteTopic(Integer topic_id);
	//根据题目id查询题目和题目答案
	TopicNeiRong queryByTopicId(int topic_id);
	//根据教员id查询作业管理的年级和班级
	List<ZuoYeGuanLi> queryByZuoYeGuanLiByTid(int tid);
	//根据年级、班级查询学生信息  ---作业管理
	List<ZuoYeGuanLi> queryXueYuanZuoYeGuanLi(String gname, String cname);
	//查询所有作业类型
	List<TaskLx> queryByAll();
	//新增题目
	int insertTopic(Topic topic);
	//新增题目选项
	int insertOption(@Param("option_xx")String option_xx,@Param("option_pd")int option_pd,@Param("topic_id")int topic_id);
	//作业
	int insertTask(Task task);
	int insertTaskFb(@Param("task_id")int task_id,@Param("csId") int csId);
	int insertTaskTm(@Param("topic_id") int topic_id,@Param("task_id") int task_id,@Param("task_tm_xzt") int task_tm_xzt,@Param("task_tm_wdt") int task_tm_wdt);
	//考试
	List<ExaminationLx> queryExaminationLx();
	int insertExa(Examination exa);
	int insertExaFb(@Param("examination_id") int examination_id,@Param("csId") int csId);
	int insertExaTm(@Param("topic_id") int topic_id,@Param("examination_id") int examination_id,@Param("examination_tm_xzt") int examination_tm_xzt,@Param("examination_tm_wdt") int examination_tm_wdt);

}
