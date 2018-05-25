package com.hxzy.dao;

import java.util.List;

import com.hxzy.entity.Film;

public interface FilmDao extends CommonDao<Film> {
	/**
	 * 根据电影名称查询电影信息
	 * @param name
	 * @return
	 */
	public Film queryByName(String name);
	/**
	 * 得到所有的电影名称
	 * @return
	 */
	public List<Film> allName();
}
