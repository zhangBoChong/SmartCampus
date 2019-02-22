package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.domain.VessionGradeMajoridCourse;
import com.accp.service.ZBCCourseService;


@Controller
public class ZBCController {
	@Autowired
	ZBCCourseService zbcService;
	@RequestMapping("/Tomain")
	public String Tomain() {
		return "main";
	}
	@RequestMapping("/Tonav")
	public String Tonav() {
		return "nav";
	}
	//跳入课程查看页面
	@RequestMapping("/TocourseIndex")
	public String TocourseIndex(Model model) {
		List<VessionGradeMajoridCourse> list=zbcService.queryAll();
		model.addAttribute("Allcourses", list);
		return "courseIndex";
	}

	
	@RequestMapping("/TocourseArrange")
	public String TocourseArrange() {
		return "courseArrange";
	}
}



/**
 * -- 连表查看所有课程
SELECT * FROM `vession_grade_majorid_course` INNER JOIN `vession_grade_majorid` ON vession_grade_majorid_course.`vgmId`=vession_grade_majorid.`vgmId`
INNER JOIN `course` ON course.`courseId`=vession_grade_majorid_course.`courseId` 
INNER JOIN `major` ON  major.`majorId`=vession_grade_majorid.`majorId`

-- 根据bid查询年级和版本号
SELECT grade.`gname` FROM grade WHERE gid=(SELECT `vession_grade`.`gid` FROM vession_grade WHERE vession_grade.`bid`=3)
SELECT vession.`vname` FROM vession WHERE vession.`vid`=(SELECT `vession_grade`.`vid` FROM `vession_grade` WHERE vession_grade.`bid`=3)

 -- 根据课程id查看在教教员
 SELECT staff.`tname` FROM staff WHERE staff.`tid`=(SELECT ctc.`tid` FROM ctc WHERE ctc.`courseId`=5 AND ctc.`status`=1)
 -- 根据教员id查看所教班级和班主任
 SELECT * FROM clazz INNER JOIN staff ON staff.`tid`=clazz.`tid` WHERE clazz.`tid`=(SELECT ctc.`tid` FROM ctc WHERE ctc.`courseId`=5 AND ctc.`status`=1) 
 */
