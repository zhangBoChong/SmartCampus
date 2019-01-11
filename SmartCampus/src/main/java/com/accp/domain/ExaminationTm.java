package com.accp.domain;

public class ExaminationTm {
    private Integer examinationTmId;

    private Integer topicId;

    private Integer examinationId;

    private Double examinationTmXzt;

    private Double examinationTmWdt;

    public Integer getExaminationTmId() {
        return examinationTmId;
    }

    public void setExaminationTmId(Integer examinationTmId) {
        this.examinationTmId = examinationTmId;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    public Double getExaminationTmXzt() {
        return examinationTmXzt;
    }

    public void setExaminationTmXzt(Double examinationTmXzt) {
        this.examinationTmXzt = examinationTmXzt;
    }

    public Double getExaminationTmWdt() {
        return examinationTmWdt;
    }

    public void setExaminationTmWdt(Double examinationTmWdt) {
        this.examinationTmWdt = examinationTmWdt;
    }
}