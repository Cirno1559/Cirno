package com.hxzy;

/**
 * @author Administrator
 *具体某一场电影的信息
 */
public class FilmItem {
	//放映时间，语言，放映厅，价格
	private String time;//放映时间
	private String language;//语言
	private String house;//放映厅编号
	private double price;//电影单价、
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
