package com.hxzy;

/**
 * @author Administrator
 *��ӰԺ��ĳһ����Ӱ�ĳ�����Ϣ
 */
public class FilmList {
	private String film;
	private FilmItem[] item;
	public void setFilm(String film) {
		this.film=film;
	}
	public String getFilm() {
		return film;
	}
	public void setItem(FilmItem[] item) {
		this.item=item;
	}
	public FilmItem[] getItem() {
		return item;
	}
}
