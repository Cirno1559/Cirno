package com.hxzy.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.hxzy.entity.Student;
import com.hxzy.util.SqlSessionUtil;

public class StudentTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void addtest() {
		SqlSession sqlSession = SqlSessionUtil.SessionOpen();
		Student stu = new Student();
		
	}
}
