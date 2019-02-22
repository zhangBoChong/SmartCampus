package com.accp.domain;

import java.util.Date;

public class Exchange {
    private Integer exchangeid;

    private Integer clazz1;

    private Integer clazz2;

    private Date time;

    private Integer status;

    public Integer getExchangeid() {
        return exchangeid;
    }

    public void setExchangeid(Integer exchangeid) {
        this.exchangeid = exchangeid;
    }

    public Integer getClazz1() {
        return clazz1;
    }

    public void setClazz1(Integer clazz1) {
        this.clazz1 = clazz1;
    }

    public Integer getClazz2() {
        return clazz2;
    }

    public void setClazz2(Integer clazz2) {
        this.clazz2 = clazz2;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}