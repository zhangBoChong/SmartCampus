package com.accp.domain;

import java.util.Date;

public class Clazz {
    private Integer cid;
    private String cname;
    private Integer bid;
    private Integer tid;
    private Date starttime;
    private Integer status;
    private Integer majorid;
    private String introduce;
    private Staff staff;
    private String gname;//年级名称
    private String tname;//任课教员
    private Integer count;//班级人数
    private VessionGrade vgobj;
    private Staff tobj;//班主任
    private Integer clazzstudentnub;//班级人数

    public Integer getClazzstudentnub() {
		return clazzstudentnub;
	}

	public void setClazzstudentnub(Integer clazzstudentnub) {
		this.clazzstudentnub = clazzstudentnub;
	}

	public Staff getTobj() {
		return tobj;
	}

	public void setTobj(Staff tobj) {
		this.tobj = tobj;
	}

	public VessionGrade getVgobj() {
		return vgobj;
	}

	public void setVgobj(VessionGrade vgobj) {
		this.vgobj = vgobj;
	}
    

    public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getMajorid() {
		return majorid;
	}

	public void setMajorid(Integer majorid) {
		this.majorid = majorid;
	}
}