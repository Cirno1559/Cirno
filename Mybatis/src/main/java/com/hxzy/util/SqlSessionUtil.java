package com.hxzy.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {
private static SqlSession SqlSession = null;
private static SqlSessionFactory SqlSessionFactory = null;
static {
	try {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
	}catch (Exception e) {
		e.printStackTrace();
	}	
  }
	public static SqlSession SessionOpen() {
		SqlSession = SqlSessionFactory.openSession();
		return SqlSession;
	}
	public static void close() {
		if(SqlSession != null) {
			SqlSession.close();
		}
	}
}