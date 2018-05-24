package com.hxzy.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.hxzy.dao.ClassNameDao;
import com.hxzy.entity.ClassName;
import com.hxzy.util.SqlSessionUtil;

public class ClassNameTest {
	
	
	@Test
	public void testAddClass() {
		SqlSession sqlSession = SqlSessionUtil.SessionOpen();
		ClassName cn = new ClassName();
		cn.setCname("Java");
		ClassNameDao cd = sqlSession.getMapper(ClassNameDao.class);
		cd.addClass(cn);
		System.out.println(cn.getCid());
		sqlSession.commit();
	} 
}
