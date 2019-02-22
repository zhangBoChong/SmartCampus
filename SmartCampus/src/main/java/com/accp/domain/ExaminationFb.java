package com.accp.domain;

public class ExaminationFb {
    private Integer examinationFbId;

    private Integer examinationId;

    private Integer csid;

    
    private Examination examobj;

    
	public Examination getExamobj() {
		return examobj;
	}

	public void setExamobj(Examination examobj) {
		this.examobj = examobj;
	}

	public Integer getExaminationFbId() {
        return examinationFbId;
    }

    public void setExaminationFbId(Integer examinationFbId) {
        this.examinationFbId = examinationFbId;
    }

    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }
}