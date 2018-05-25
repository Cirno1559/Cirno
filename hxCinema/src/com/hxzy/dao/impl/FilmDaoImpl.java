package com.hxzy.dao.impl;

import java.util.List;
import java.util.Map;

import com.hxzy.dao.FilmDao;
import com.hxzy.entity.CinemaFilmRelation;
import com.hxzy.entity.Film;
import com.hxzy.util.BaseDao;

public class FilmDaoImpl extends BaseDao implements FilmDao {

	@Override
	public int insert(Film t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Film t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Film t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Film findById(Film f) {
		String sql = "select fno,name,type,location,time,date,info from `film` where fno = ?";
		List<Film> list = super.query(Film.class, sql, f.getfNo());
		return list.size()>0?list.get(1):null;
	}

	@Override
	public List<Film> query(int page, int pageSize, Map<String, Object> map) {
		String sql = "select fno,name from Film where 1=1 ";
		StringBuilder sb = new StringBuilder(sql);
		Object[] params = null;
		int i = 0;
		if(map.size()>0) {
			params =new Object[map.size()];
		}
		for (String key : map.keySet()) {
			sb.append("and" +key+"= ?");
			params[i++] = map.get(key);
		}
		sb.append("limit"+(page-1)*pageSize+","+page);
		return super.query(Film.class, sb.toString(),params );
	}

	@Override
	public int total(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}
	//���ݵ�Ӱ���Ʋ�ѯ��Ӱ��Ϣ
	@Override
	public Film queryByName(String name) {
		/*String sql = "select fno fNo,name name,type type,location location,time time,date date,info info from `film` where name = ?";
		List<Film> list = super.query(Film.class, sql, name);*/
		String sql="select f.fno fNo,f.name name,f.type type,f.location location,f.time time,f.date date,f.info info from film f where f.name=?";
		List<Film> list = this.query(Film.class, sql,name);
		for (Film film : list) {
			return film;
		}
		return null;
	}
	//���ݵ�Ӱ���Ʋ�ѯ������ӳ�ĵ�ӰԺ
	@Override
	public Film findName(Film f) {
		String sql = "SELECT t2.name from cinema t2 JOIN cinema_film_relation t3 ON t3.cno = t2.cNo JOIN film t1 ON t1.fno= t3.fno WHERE t1.`name`=?" ; 
				
		List<Film> list = super.query(Film.class, sql, f.getName());
		return list.size()>0?list.get(1):null;
		}
	@Override
	public List<Film> allName(){
		String sql = "select name from film";
		List<Film> list = super.query(Film.class, sql);
		return list;
		
	}
}
