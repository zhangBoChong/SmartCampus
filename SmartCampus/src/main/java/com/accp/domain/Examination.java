package com.accp.domain;

import java.util.Date;

public class Examination {
    private Integer examinationId;

    private Integer bid;

    private Integer courseid;

    private Integer sectionid;

    private Integer tid;

    private Double examinationZf;

    private Integer examinationLxId;

    private Date examinationKstime;

    private Date examinationJstime;

    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getSectionid() {
        return sectionid;
    }

    public void setSectionid(Integer sectionid) {
        this.sectionid = sectionid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Double getExaminationZf() {
        return examinationZf;
    }

    public void setExaminationZf(Double examinationZf) {
        this.examinationZf = examinationZf;
    }

    public Integer getExaminationLxId() {
        return examinationLxId;
    }

    public void setExaminationLxId(Integer examinationLxId) {
        this.examinationLxId = examinationLxId;
    }

    public Date getExaminationKstime() {
        return examinationKstime;
    }

    public void setExaminationKstime(Date examinationKstime) {
        this.examinationKstime = examinationKstime;
    }

    public Date getExaminationJstime() {
        return examinationJstime;
    }

    public void setExaminationJstime(Date examinationJstime) {
        this.examinationJstime = examinationJstime;
    }
}