package com.hxzy.dao;

import java.util.List;

import com.hxzy.entity.BaseArea;

public interface areaDao {
	//查询省
	public List<BaseArea> findProvince();  
	//查询市县
	public List<BaseArea> findCountry(BaseArea params);
}
