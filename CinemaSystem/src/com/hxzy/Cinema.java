package com.hxzy;

public class Cinema {
	private String name;//��ӰԺ����
	private FilmList[] list;//��ӰԺ��ӳӰƬ��Ϣ
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
