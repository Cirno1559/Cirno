package com.hxzy;

public class CinemaSystemBackManager {
	private Film[] films=new Film[500];
	private Cinema[] cinemas=new Cinema[500];
	
	/**
	 * @param film
	 * @return
	 * 添加电影信息
	 */
	public int addFilm(Film film) {
		if(film==null) {
			return -1;
		}
		for (int i = 0; i < this.films.length; i++) {
			if(films[i] == null) {
				films[i] = film;
				return i;
			}
		}
		return -1;
	}
		public int addCinema(Cinema cinema) {
			if(cinema==null) {
				return -1;
			}
			for (int i = 0; i < this.cinemas.length; i++) {
				if(cinemas[i] == null) {
					cinemas[i] = cinema; 
					return i;
				}
			}
			return -1;
		}
		public Film getFilmByName(String name) {
			for (int i = 0; i < this.films.length; i++) {
				Film film=this.films[i];
				if(film!=null&&film.getName().equals(name)) {
					return film;
				}
			}return null;
		}


}
