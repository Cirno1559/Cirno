package com.hxzy;

public class Film {
	private String name;
	private String type;//��Ӱ����
	private String location;//���еص�
	private int time;//��Ӱʱ��
	private String date;//��Ӱ��ӳʱ��
	private String info;//��Ӱ���
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
