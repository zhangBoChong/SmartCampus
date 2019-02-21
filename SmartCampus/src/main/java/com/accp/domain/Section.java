package com.accp.domain;

public class Section {
    private Integer sectionid;

    private String sectionname;

    private Integer ccid;

    private Integer status;

    private Integer coursetime;

    public Integer getSectionid() {
        return sectionid;
    }

    public void setSectionid(Integer sectionid) {
        this.sectionid = sectionid;
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname;
    }

    public Integer getCcid() {
        return ccid;
    }

    public void setCcid(Integer ccid) {
        this.ccid = ccid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(Integer coursetime) {
        this.coursetime = coursetime;
    }
}