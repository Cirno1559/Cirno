package com.hxzy;

/**
 * @author Administrator
 *����ĳһ����Ӱ����Ϣ
 */
public class FilmItem {
	//��ӳʱ�䣬���ԣ���ӳ�����۸�
	private String time;//��ӳʱ��
	private String language;//����
	private String house;//��ӳ�����
	private double price;//��Ӱ���ۡ�
	public void setTime(String time) {
		this.time=time;
	}
	public String getTime() {
		return time;
	}
	public void setLanguage(String language) {
		this.language=language;
	}
	public String getLanguage() {
		return language;
	}
	public void setHouse(String house) {
		this.house=house;
	}
	public String getHouse() {
		return house;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}

}
