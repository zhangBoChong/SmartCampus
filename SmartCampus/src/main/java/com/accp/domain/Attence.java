package com.accp.domain;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Attence {
    private Integer attenceid;

    private Integer studentid;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date time;
    
    private String timeStr;
     
	public String getTimeStr() {
		return timeStr;
	}

	public void setTimeStr(String timeStr) {
		this.timeStr = timeStr;
	}

	private Integer attence;

    private String k1;

    public Studentinfo getStu() {
		return stu;
	}

	public void setStu(Studentinfo stu) {
		this.stu = stu;
	}

	private String k2;
    
    private Studentinfo stu;

    public Integer getAttenceid() {
        return attenceid;
    }

    public void setAttenceid(Integer attenceid) {
        this.attenceid = attenceid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日");
        this.timeStr=simpleDateFormat.format(time);
    }

    public Integer getAttence() {
        return attence;
    }

    public void setAttence(Integer attence) {
        this.attence = attence;
    }

    public String getK1() {
        return k1;
    }

    public void setK1(String k1) {
        this.k1 = k1;
    }

    public String getK2() {
        return k2;
    }

    public void setK2(String k2) {
        this.k2 = k2;
    }
}