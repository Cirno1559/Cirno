package com.hxzy.dao;

import java.util.List;

import com.hxzy.entity.ClassName;

public interface ClassNameDao {
//查询班级信息
	public List<ClassName> queryClass();
//添加班级信息
	public int addClass(ClassName className);
}
