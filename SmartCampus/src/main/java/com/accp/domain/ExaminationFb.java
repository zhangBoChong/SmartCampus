package com.accp.domain;

public class ExaminationFb {
    private Integer examination_fb_id;

    private Integer examination_id;
    
    private Integer csId;
    
    private Examination examobj;
    
    
	public Examination getExamobj() {
		return examobj;
	}

	public void setExamobj(Examination examobj) {
		this.examobj = examobj;
	}

	public Integer getExamination_fb_id() {
		return examination_fb_id;
	}

	public void setExamination_fb_id(Integer examination_fb_id) {
		this.examination_fb_id = examination_fb_id;
	}

	public Integer getExamination_id() {
		return examination_id;
	}

	public void setExamination_id(Integer examination_id) {
		this.examination_id = examination_id;
	}

	public Integer getCsId() {
		return csId;
	}

	public void setCsId(Integer csId) {
		this.csId = csId;
	}

    
}