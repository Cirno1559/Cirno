package com.hxzy.dao;

import java.util.List;
import java.util.Map;

/**
 * 通用的包含增，删，改，根据主键查询，分页查询,结合分页查询总共有多少条数据，的接口
 * @author Administrator
 *
 * @param <T>
 */
public interface CommonDao<T> {
	
	
	
	
	/**
	 * 根据主键查询当个对象
	 * @param t
	 * @return
	 */
	public T findById(T t);
	
	/**
	 * 分页查询
	 * @param params   查询条件
	 * @return
	 */
	public List<T> query(Map<String,Object> map);
	
	
}
