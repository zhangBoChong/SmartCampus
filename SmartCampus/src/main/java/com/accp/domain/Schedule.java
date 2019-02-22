package com.accp.domain;

public class Schedule {
    private Integer scheduleid;

    private Integer cid;

    private String datestart;

    private String dateend;

    private String tname;

    private String title;

    private String outline;
    private Integer startqj;
    private Integer endqj;
    
    private Clazz clazz;
    
    
    public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public Integer getStartqj() {
		return startqj;
	}

	public void setStartqj(Integer startqj) {
		this.startqj = startqj;
	}

	public Integer getEndqj() {
		return endqj;
	}

	public void setEndqj(Integer endqj) {
		this.endqj = endqj;
	}

	public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getDatestart() {
        return datestart;
    }

    public void setDatestart(String datestart) {
        this.datestart = datestart;
    }

    public String getDateend() {
        return dateend;
    }

    public void setDateend(String dateend) {
        this.dateend = dateend;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }
}