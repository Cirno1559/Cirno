package com.hxzy.dao;

import java.util.List;

import com.hxzy.entity.Student;

public interface StudentDao {
	//学生添加
	public int insert(Student stu);
	//查询学生
	public List<Student> queryAll();
}
