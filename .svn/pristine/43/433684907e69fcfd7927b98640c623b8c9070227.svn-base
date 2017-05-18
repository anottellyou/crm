package com.itheima.crm.page;

import java.util.List;

public class PageBean<T> {

	private int pageNum;
	private int pageSize;
	private int totalRecord;

	private int startIndex;
	private int totalPage;

	private int start;
	private int end;

	public PageBean(int pageNum, int pageSize, int totalRecord) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.totalRecord = totalRecord;

		// ¿ªÊ¼Ë÷Òý
		this.startIndex = (this.pageNum - 1) * (this.pageSize);
		this.totalPage = (this.totalRecord + (this.pageSize - 1))
				/ this.pageSize;

		this.start = 1;
		this.end = 10;

		if (this.totalPage <= 10) {
			this.end = this.totalPage;
		} else {
			if (pageNum > 4) {
				this.start = this.pageNum - 4;
				this.end = this.pageNum + 5;

			}
			if (this.end > this.totalPage) {
				this.end = this.totalPage;
			}
		}

	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	private List<T> data;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}
