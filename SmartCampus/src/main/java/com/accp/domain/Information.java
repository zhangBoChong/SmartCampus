package com.accp.domain;

import java.util.Date;

public class Information {
    private Integer informationId;

    private Integer uId;

    private String informationContent;

    private Integer informationSendee;

    private Date informationTime;

    private Integer imgId;

    private Integer informationFetch;

    private Integer informationType;

    private Integer deleteId;

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getInformationContent() {
        return informationContent;
    }

    public void setInformationContent(String informationContent) {
        this.informationContent = informationContent;
    }

    public Integer getInformationSendee() {
        return informationSendee;
    }

    public void setInformationSendee(Integer informationSendee) {
        this.informationSendee = informationSendee;
    }

    public Date getInformationTime() {
        return informationTime;
    }

    public void setInformationTime(Date informationTime) {
        this.informationTime = informationTime;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getInformationFetch() {
        return informationFetch;
    }

    public void setInformationFetch(Integer informationFetch) {
        this.informationFetch = informationFetch;
    }

    public Integer getInformationType() {
        return informationType;
    }

    public void setInformationType(Integer informationType) {
        this.informationType = informationType;
    }

    public Integer getDeleteId() {
        return deleteId;
    }

    public void setDeleteId(Integer deleteId) {
        this.deleteId = deleteId;
    }
}