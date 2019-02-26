package com.accp.domain;
import java.util.List;

public class Staff {
    private Integer tid;

    private Integer sex;

    private String tname;

    private Integer roleid;

    private Integer postid;

    private Integer characterid;

    private String headimg;

    private Integer status;
    private Integer choice;
    

    public Integer getChoice() {
		return choice;
	}

	public void setChoice(Integer choice) {
		this.choice = choice;
	}
    
    private List<Clazz> clzlist;

    public List<Clazz> getClzlist() {
		return clzlist;
	}

	public void setClzlist(List<Clazz> clzlist) {
		this.clzlist = clzlist;
	}

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

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getCharacterid() {
        return characterid;
    }

    public void setCharacterid(Integer characterid) {
        this.characterid = characterid;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}