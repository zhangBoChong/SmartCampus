package com.accp.domain;

import java.util.List;

public class PageBean{

	private String name;
	private String begin;
	private String end;
	private int currpage; //当前页
	private int pagecount; //总条数
	private int pagesize; //分页大小
	private int pagenum; //总页数
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start<=0 ? 0 : start;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	private int start;
	private int size;
	private List<Attence> list;

	public List<Attence> getList() {
		return list;
	}
	public void setList(List<Attence> list) {
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name==null? "":name;
	}
	public String getBegin() {
		return begin;
	}
	public void setBegin(String begin) {
		if(begin==null || begin.equals("")) {
			this.begin=null;
		}else {
			this.begin = begin;			
		}
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		if(end==null || end.equals("")) {
			this.end=null;
		}else {
			this.end = end;			
		}
	}
	public int getCurrpage() {
		return currpage;
	}
	public void setCurrpage(int currpage) {
		if(currpage<=0) {
			this.currpage=pagenum;
		}else if(currpage>pagenum) {
			this.currpage=1;
		}else {
			this.currpage = currpage;
		}
		setStart((this.currpage-1)*pagesize);
	}
	
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pageCount) {
		this.pagecount = pageCount;
		this.pagenum=pageCount%pagesize==0? pageCount/pagesize : pageCount/pagesize+1;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getPagenum() {
		return pagenum;
	}
	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}
		
	public PageBean(String name,String begin,String end) {
		this.pagesize=3;
		setName(name);
		setBegin(begin);
		setEnd(end);
	}
}
