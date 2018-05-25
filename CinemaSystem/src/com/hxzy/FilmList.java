package com.hxzy;

/**
 * @author Administrator
 *电影院对某一部电影的场次信息
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
