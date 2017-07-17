package pers.ljy.background.share.dto;

import java.util.concurrent.CopyOnWriteArrayList;

public class PageForm<T> {

	private Integer total;  //总纪录条数
	private CopyOnWriteArrayList<T> rows;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public CopyOnWriteArrayList<T> getRows() {
		return rows;
	}
	public void setRows(CopyOnWriteArrayList<T> rows) {
		this.rows = rows;
	}
	
	
	
	
}
