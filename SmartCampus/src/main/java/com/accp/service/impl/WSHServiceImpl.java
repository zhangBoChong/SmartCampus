package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Course;
import com.accp.domain.Examination;
import com.accp.domain.ExaminationLx;
import com.accp.domain.Grade;
import com.accp.domain.PageBean;
import com.accp.domain.Section;
import com.accp.domain.Task;
import com.accp.domain.TaskLx;
import com.accp.domain.Topic;
import com.accp.domain.TopicLx;
import com.accp.domain.TopicNeiRong;
import com.accp.domain.Vession;
import com.accp.domain.ZuoYeGuanLi;
import com.accp.mapper.CourseMapper;
import com.accp.mapper.ExaminationFbMapper;
import com.accp.mapper.ExaminationLxMapper;
import com.accp.mapper.ExaminationMapper;
import com.accp.mapper.ExaminationTmMapper;
import com.accp.mapper.GradeMapper;
import com.accp.mapper.OptionMapper;
import com.accp.mapper.SectionMapper;
import com.accp.mapper.TaskFbMapper;
import com.accp.mapper.TaskLxMapper;
import com.accp.mapper.TaskMapper;
import com.accp.mapper.TaskTmMapper;
import com.accp.mapper.TopicLxMapper;
import com.accp.mapper.TopicMapper;
import com.accp.mapper.TopicNeiRongMapper;
import com.accp.mapper.VessionMapper;
import com.accp.mapper.ZuoYeGuanLiMapper;
import com.accp.service.WSHService;

@Service
public class WSHServiceImpl implements WSHService {
	@Autowired
	VessionMapper vessionMapper;
	
	@Autowired
	TopicMapper topicMapper;
	
	@Autowired
	TopicLxMapper topicLxMapper;
	
	@Autowired
	GradeMapper gradeMapper;
	
	@Autowired
	CourseMapper courseMapper;
	
	@Autowired
	SectionMapper sectionMapper;
	
	@Autowired
	TopicNeiRongMapper topicNeiRongMapper;
	
	@Autowired
	ZuoYeGuanLiMapper zuoYeGuanLiMapper;
	
	@Autowired
	TaskLxMapper taskLxMapper;
	
	@Autowired
	OptionMapper optionMapper;
	
	@Autowired
	TaskMapper taskMapper;
	
	@Autowired
	TaskFbMapper taskFbMapper;
	
	@Autowired
	TaskTmMapper taskTmMapper;
	
	@Autowired
	ExaminationLxMapper exaLxMapper;
	
	@Autowired
	ExaminationMapper exaMapper;
	
	@Autowired
	ExaminationFbMapper exaFbMapper;
	
	@Autowired
	ExaminationTmMapper exaTmMapper;
	
	@Override
	public List<Vession> vessionQuery() {
		// TODO Auto-generated method stub
		return vessionMapper.vessionQuery();
	}

	@Override
	public List<Topic> queryTopic() {
		// TODO Auto-generated method stub
		return topicMapper.queryTopic();
	}

	@Override
	public List<TopicLx> queryTopicLx() {
		// TODO Auto-generated method stub
		return topicLxMapper.queryTopicLx();
	}

	@Override
	public List<Grade> queryByVid(Integer vid) {
		// TODO Auto-generated method stub
		return gradeMapper.queryByVid(vid);
	}

	@Override
	public List<Course> queryByVidGid(Integer vid, Integer gid) {
		// TODO Auto-generated method stub
		return courseMapper.queryByVidGid(vid, gid);
	}

	@Override
	public List<Section> queryByVidGidCourseId(Integer vid, Integer gid, Integer courseId) {
		// TODO Auto-generated method stub
		return sectionMapper.queryByVidGidCourseId(vid, gid, courseId);
	}

	@Override
	public List<TopicNeiRong> queryByXiaLaKuangTiaoJian(Integer vid, Integer gid, Integer courseId,
			Integer sectionId, Integer topic_lx_id, String topic_level) {
		// TODO Auto-generated method stub
		return topicNeiRongMapper.queryByXiaLaKuangTiaoJian(vid, gid, courseId, sectionId, topic_lx_id, topic_level);
	}

	@Override
	public int deleteTopic(Integer topic_id) {
		// TODO Auto-generated method stub
		return topicNeiRongMapper.deleteTopic(topic_id);
	}

	@Override
	public TopicNeiRong queryByTopicId(int topic_id) {
		// TODO Auto-generated method stub
		return topicNeiRongMapper.queryByTopicId(topic_id);
	}

	@Override
	public List<ZuoYeGuanLi> queryByZuoYeGuanLiByTid(int tid) {
		// TODO Auto-generated method stub
		return zuoYeGuanLiMapper.queryByZuoYeGuanLiByTid(tid);
	}

	@Override
	public List<ZuoYeGuanLi> queryXueYuanZuoYeGuanLi(String gname, String cname) {
		// TODO Auto-generated method stub
		return zuoYeGuanLiMapper.queryXueYuanZuoYeGuanLi(gname, cname);
	}

	@Override
	public List<TaskLx> queryByAll() {
		// TODO Auto-generated method stub
		return taskLxMapper.queryByAll();
	}

	@Override
	public int insertTopic(Topic topic) {
		// TODO Auto-generated method stub
		return topicMapper.insertTopic(topic);
	}

	@Override
	public int insertOption(String option_xx, int option_pd, int topic_id) {
		// TODO Auto-generated method stub
		return optionMapper.insertOption(option_xx, option_pd, topic_id);
	}

	@Override
	public int insertTask(Task task) {
		// TODO Auto-generated method stub
		return taskMapper.insertTask(task);
	}

	@Override
	public int insertTaskFb(int task_id, int csId) {
		// TODO Auto-generated method stub
		return taskFbMapper.insertTaskFb(task_id, csId);
	}

	@Override
	public int insertTaskTm(int topic_id, int task_id, int task_tm_xzt, int task_tm_wdt) {
		// TODO Auto-generated method stub
		return taskTmMapper.insertTaskTm(topic_id, task_id, task_tm_xzt, task_tm_wdt);
	}

	@Override
	public List<ExaminationLx> queryExaminationLx() {
		// TODO Auto-generated method stub
		return exaLxMapper.queryExaminationLx();
	}

	@Override
	public int insertExa(Examination exa) {
		// TODO Auto-generated method stub
		return exaMapper.insertExa(exa);
	}

	@Override
	public int insertExaFb(int examination_id, int csId) {
		// TODO Auto-generated method stub
		return exaFbMapper.insertExaFb(examination_id, csId);
	}

	@Override
	public int insertExaTm(int topic_id, int examination_id, int examination_tm_xzt, int examination_tm_wdt) {
		// TODO Auto-generated method stub
		return exaTmMapper.insertExaTm(topic_id, examination_id, examination_tm_xzt, examination_tm_wdt);
	}

	


	
	
}
