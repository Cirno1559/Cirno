package com.hxzy.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.hxzy.dao.areaDao;
import com.hxzy.entity.BaseArea;

public class areaDaoImpl implements areaDao {

	@Override
	public List<BaseArea> findProvince() {
		String sql = "SELECT name,base_areaid areaId FROM base_area WHERE parentid = '0'";
		List<BaseArea> list = new ArrayList<BaseArea>();
		
		return null;
	}

	@Override
	public List<BaseArea> findCountry(BaseArea params) {
		// TODO Auto-generated method stub
		return null;
	}

}
