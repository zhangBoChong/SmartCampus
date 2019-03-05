package com.accp.service;

import java.util.List;

import com.accp.domain.ClazzStudentExamInfo;
import com.accp.domain.Examination;
import com.accp.domain.ExaminationFb;
import com.accp.domain.ExaminationTm;
import com.accp.domain.Havetaskexam;

public interface ExaminationInfoService {
	public List<ExaminationFb> selectBycsid(Integer csid);
	public List<Havetaskexam> examscoreBysid(Integer sid);
	public List<ClazzStudentExamInfo> selectstudentexamBycid(Integer cid);
	public List<ExaminationTm> selectexamtimByexamid(Integer examinationId);
	public List<ClazzStudentExamInfo> canupclazzStudentexaminfo(Integer [] sid);
	public List<Examination> chaexamBytidtan(Integer tid);
}
