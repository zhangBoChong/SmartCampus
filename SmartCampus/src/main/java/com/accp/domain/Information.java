package com.accp.domain;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Information {
    private Integer information_id;

    private Integer u_id;

    private String information_content;

    private Integer information_sendee;

    @DateTimeFormat(pattern = "yyyy-MM-dd") //入参 
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd") //出参
    private Date information_time;

    private Integer img_id;

    private Integer information_fetch;

    private Integer information_type;

    private Integer delete_id;

	public Integer getInformation_id() {
		return information_id;
	}

	public void setInformation_id(Integer information_id) {
		this.information_id = information_id;
	}

	public Integer getU_id() {
		return u_id;
	}

	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}

	public String getInformation_content() {
		return information_content;
	}

	public void setInformation_content(String information_content) {
		this.information_content = information_content;
	}

	public Integer getInformation_sendee() {
		return information_sendee;
	}

	public void setInformation_sendee(Integer information_sendee) {
		this.information_sendee = information_sendee;
	}

	public Date getInformation_time() {
		return information_time;
	}

	public void setInformation_time(Date information_time) {
		this.information_time = information_time;
	}

	public Integer getImg_id() {
		return img_id;
	}

	public void setImg_id(Integer img_id) {
		this.img_id = img_id;
	}

	public Integer getInformation_fetch() {
		return information_fetch;
	}

	public void setInformation_fetch(Integer information_fetch) {
		this.information_fetch = information_fetch;
	}

	public Integer getInformation_type() {
		return information_type;
	}

	public void setInformation_type(Integer information_type) {
		this.information_type = information_type;
	}

	public Integer getDelete_id() {
		return delete_id;
	}

	public void setDelete_id(Integer delete_id) {
		this.delete_id = delete_id;
	}
}