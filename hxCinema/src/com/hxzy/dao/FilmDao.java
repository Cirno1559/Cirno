package com.hxzy.dao;

import java.util.List;

import com.hxzy.entity.Film;

public interface FilmDao extends CommonDao<Film> {
	/**
	 * ���ݵ�Ӱ���Ʋ�ѯ��Ӱ��Ϣ
	 * @param name
	 * @return
	 */
	public Film queryByName(String name);
	/**
	 * �õ����еĵ�Ӱ����
	 * @return
	 */
	public List<Film> allName();
}
