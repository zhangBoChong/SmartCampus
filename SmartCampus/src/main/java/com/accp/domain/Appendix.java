package com.accp.domain;

import java.util.Date;

public class Appendix {
    private Integer appendixId;

    private Integer afficheId;

    private String appendixTitle;

    private String appendixContent;

    private Integer imgId;

    private Date appendixTime;

    private Integer uId;

    private Integer appendixSendee;

    private Integer deleteId;

    public Integer getAppendixId() {
        return appendixId;
    }

    public void setAppendixId(Integer appendixId) {
        this.appendixId = appendixId;
    }

    public Integer getAfficheId() {
        return afficheId;
    }

    public void setAfficheId(Integer afficheId) {
        this.afficheId = afficheId;
    }

    public String getAppendixTitle() {
        return appendixTitle;
    }

    public void setAppendixTitle(String appendixTitle) {
        this.appendixTitle = appendixTitle;
    }

    public String getAppendixContent() {
        return appendixContent;
    }

    public void setAppendixContent(String appendixContent) {
        this.appendixContent = appendixContent;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Date getAppendixTime() {
        return appendixTime;
    }

    public void setAppendixTime(Date appendixTime) {
        this.appendixTime = appendixTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getAppendixSendee() {
        return appendixSendee;
    }

    public void setAppendixSendee(Integer appendixSendee) {
        this.appendixSendee = appendixSendee;
    }

    public Integer getDeleteId() {
        return deleteId;
    }

    public void setDeleteId(Integer deleteId) {
        this.deleteId = deleteId;
    }
}