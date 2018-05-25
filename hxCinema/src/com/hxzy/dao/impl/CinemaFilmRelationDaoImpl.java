package com.hxzy.dao.impl;

import java.util.List;
import java.util.Map;

import com.hxzy.dao.CinemaFilmRelationDao;
import com.hxzy.entity.Cinema;
import com.hxzy.entity.CinemaFilmRelation;
import com.hxzy.util.BaseDao;

public class CinemaFilmRelationDaoImpl extends BaseDao implements CinemaFilmRelationDao {

	@Override
	public int insert(CinemaFilmRelation t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CinemaFilmRelation t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(CinemaFilmRelation t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CinemaFilmRelation findById(CinemaFilmRelation t) {
		String sql = "select rno,cno,fno,date,state from `CinemaFilmRelation` where rNo = ? or cno=? fno=?";
		List<CinemaFilmRelation> list = super.query(CinemaFilmRelation.class, sql, t.getrNo());
		return list.size()>0?list.get(1):null;
	}

	@Override
	public List<CinemaFilmRelation> query(int page, int pageSize, Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int total(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public CinemaFilmRelation findName(CinemaFilmRelation cfr) {
		return null;
	}
}
