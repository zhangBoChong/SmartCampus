package com.accp.domain;

import java.util.Date;

public class Affiche {
    private Integer afficheId;

    private String afficheTitle;

    private String afficheContent;

    private Integer afficheDraft;

    private Date afficheTime;

    private Integer imgId;

    private Integer uId;

    private Integer afficheSendee;

    private Integer deleteId;

    public Integer getAfficheId() {
        return afficheId;
    }

    public void setAfficheId(Integer afficheId) {
        this.afficheId = afficheId;
    }

    public String getAfficheTitle() {
        return afficheTitle;
    }

    public void setAfficheTitle(String afficheTitle) {
        this.afficheTitle = afficheTitle;
    }

    public String getAfficheContent() {
        return afficheContent;
    }

    public void setAfficheContent(String afficheContent) {
        this.afficheContent = afficheContent;
    }

    public Integer getAfficheDraft() {
        return afficheDraft;
    }

    public void setAfficheDraft(Integer afficheDraft) {
        this.afficheDraft = afficheDraft;
    }

    public Date getAfficheTime() {
        return afficheTime;
    }

    public void setAfficheTime(Date afficheTime) {
        this.afficheTime = afficheTime;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getAfficheSendee() {
        return afficheSendee;
    }

    public void setAfficheSendee(Integer afficheSendee) {
        this.afficheSendee = afficheSendee;
    }

    public Integer getDeleteId() {
        return deleteId;
    }

    public void setDeleteId(Integer deleteId) {
        this.deleteId = deleteId;
    }
}