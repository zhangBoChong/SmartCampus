package com.accp.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;


public class Affiche {
    private Integer affiche_id;

    private String affiche_title;

    private String affiche_content;

    private Integer affiche_draft;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd") //入参 
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd") //出参
    private Date affiche_time;

    private Integer img_id;

    private Integer u_id;

    private String affiche_sendee;

    private Integer delete_id;
    
    public List<Img> imgList1;
    
    
    private Integer tid;

    private Integer sex;

    private String tname;

    private Integer roleId;

    private Integer postId;

    private Integer characterId;

    private String headImg;

    private Integer status;

    
	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<Img> getImgList1() {
		return imgList1;
	}

	public void setImgList1(List<Img> imgList1) {
		this.imgList1 = imgList1;
	}

	public Integer getAffiche_id() {
		return affiche_id;
	}

	public void setAffiche_id(Integer affiche_id) {
		this.affiche_id = affiche_id;
	}

	public String getAffiche_title() {
		return affiche_title;
	}

	public void setAffiche_title(String affiche_title) {
		this.affiche_title = affiche_title;
	}

	public String getAffiche_content() {
		return affiche_content;
	}

	public void setAffiche_content(String affiche_content) {
		this.affiche_content = affiche_content;
	}

	public Integer getAffiche_draft() {
		return affiche_draft;
	}

	public void setAffiche_draft(Integer affiche_draft) {
		this.affiche_draft = affiche_draft;
	}

	public Date getAffiche_time() {
		return affiche_time;
	}

	public void setAffiche_time(Date affiche_time) {
		this.affiche_time = affiche_time;
	}

	public Integer getImg_id() {
		return img_id;
	}

	public void setImg_id(Integer img_id) {
		this.img_id = img_id;
	}

	public Integer getU_id() {
		return u_id;
	}

	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}

	public String getAffiche_sendee() {
		return affiche_sendee;
	}

	public void setAffiche_sendee(String affiche_sendee) {
		this.affiche_sendee = affiche_sendee;
	}

	public Integer getDelete_id() {
		return delete_id;
	}

	public void setDelete_id(Integer delete_id) {
		this.delete_id = delete_id;
	}
    
}