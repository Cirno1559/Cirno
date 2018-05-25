package com.hxzy.dao.impl;

import java.util.List;
import java.util.Map;

import com.hxzy.dao.CinemaDao;
import com.hxzy.entity.Cinema;
import com.hxzy.util.BaseDao;

public class CinemaDaoImpl extends BaseDao implements CinemaDao {

	@Override
	public int insert(Cinema t) {
		return 0;
	}

	@Override
	public int update(Cinema t) {
		return 0;
	}

	@Override
	public int delete(Cinema t) {
		return 0;
	}

	@Override
	public Cinema findById(Cinema c) {
		String sql = "select name from `cinema` where cNo = ?";
		List<Cinema> list = super.query(Cinema.class, sql, c.getcNo());
		return list.size()>0?list.get(1):null;
	}

	@Override
	public List<Cinema> query(int page, int pageSize, Map<String, Object> map) {
		String sql = "select cNo,name from `cinema` where 1=1 ";
		StringBuilder sb = new StringBuilder(sql);
		Object[] params = null;
		if(map.size()>0) {
			params = new Object[map.size()];
		}
		int i = 0;
		for (String key : map.keySet()) {
			sb.append("and "+key+"?");
			params[i++] = map.get(key);
		}
		sb.append("limit"+(page-1) * pageSize+","+pageSize);
		return super.query(Cinema.class, sb.toString(), params);
	}

	@Override
	public int total(Map<String, Object> map) {
		return 0;
	}
	/* (non-Javadoc)
	 * @see com.hxzy.dao.CommonDao#findName(java.lang.Object)
	 * 根据电影院名称查询，该电影院正在上映的电影
	 */
	@Override
	public Cinema findName(Cinema c) {
		String sql = "SELECT t1.name from `film` t1 JOIN cinema_film_relation t3 ON t1.fno = t3.fno\r\n" + 
				"JOIN cinema t2 ON t2.cNo = t3.cno WHERE t2.name = ? ";
		System.out.println(sql);
		List<Cinema> list = super.query(Cinema.class, sql, c.getName());
		return list.size()>0?list.get(1):null;
	}
}
