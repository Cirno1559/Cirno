package com.hxzy;

public class Cinema {
	private String name;//电影院名称
	private FilmList[] list;//电影院上映影片信息
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setList(FilmList[] list) {
		this.list=list;
	}
	public FilmList[] getList() {
		return list;
	}
}
