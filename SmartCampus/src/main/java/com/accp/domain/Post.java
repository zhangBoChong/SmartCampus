package com.accp.domain;

public class Post {
    private Integer postid;

    private String postname;

    private Integer status;

    private Integer parentid;

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}