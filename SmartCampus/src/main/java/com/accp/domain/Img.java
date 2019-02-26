package com.accp.domain;

import java.util.List;

public class Img {
    private Integer img_id;

	public Integer getImg_id() {
		return img_id;
	}

	public void setImg_id(Integer img_id) {
		this.img_id = img_id;
	}

    private Integer delete_id;

	public Integer getDelete_id() {
		return delete_id;
	}

	public void setDelete_id(Integer delete_id) {
		this.delete_id = delete_id;
	}
	
	public List<ImgChildren> imgList2;

	public List<ImgChildren> getImgList2() {
		return imgList2;
	}

	public void setImgList2(List<ImgChildren> imgList2) {
		this.imgList2 = imgList2;
	}
}