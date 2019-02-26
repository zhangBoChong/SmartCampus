package com.accp.domain;

import java.util.List;

public class PageBean<E> {

	private int currentPage;
	private int prevPage;
	private int nextPage;
	private int pagecount;
	private int pageSize;
	private int pageCount;
	private List<E> lists;
	
	public PageBean(int size, int count, int page, List<E> consumers) {
		// TODO Auto-generated constructor stub
		this.pageSize=size;
		this.pageCount=count;
		this.pagecount=pageCount%pageSize==0?pageCount/pageSize:pageCount/pageSize+1;
		this.currentPage=page;
		this.prevPage=page-1==0?1:page-1;
		this.nextPage=page+1>pagecount?pagecount:page+1;
		this.lists=consumers;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public List<E> getLists() {
		return lists;
	}
	public void setLists(List<E> lists) {
		this.lists = lists;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
}
