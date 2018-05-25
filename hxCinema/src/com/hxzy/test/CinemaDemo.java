package com.hxzy.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.hxzy.dao.FilmDao;
import com.hxzy.dao.impl.FilmDaoImpl;
import com.hxzy.entity.Film;

public class CinemaDemo {
	public static void start() {
		
		List<Film> list = new FilmDaoImpl().allName();
		for (Film film : list) {
			System.out.println(film.getName());
		}
	}
public static void main(String[] args) {
	FilmDao f = new FilmDaoImpl();
	Scanner input = new Scanner(System.in);
	System.out.println("正在热映！");
	start();
	System.out.println("请选择：1.根据电 影名称查询电影信息  2.根据电影院查看该电影正在上映的电影");
	int choose = input.nextInt();
	if(choose == 1) {
		System.out.println("请输入电影名称");
		String name = input.next();
		Film f1 = f.queryByName(name);
		System.out.println(f1);
	}else if(choose == 2) {
		
		System.out.println("请输入电影院名称");
		String name = input.next();
	}
	
	
}
}
