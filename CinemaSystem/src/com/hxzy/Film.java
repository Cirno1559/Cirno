package com.hxzy;

public class Film {
	private String name;
	private String type;//电影类型
	private String location;//发行地点
	private int time;//电影时长
	private String date;//电影上映时间
	private String info;//电影简介
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setTime(int time) {
		this.time=time;
	}
	public int getTime() {
		return time;
	}
	public void setDate(String date) {
		this.date=date;
	}
	public String getDate() {
		return date;
	}
	public void setInfo(String info) {
		this.info=info;
	}
	public String getInfo() {
		return info;
	}

}
