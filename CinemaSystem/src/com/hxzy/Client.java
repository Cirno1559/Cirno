package com.hxzy;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		System.out.println("欢迎使用电影咨询平台");
		Scanner input= new Scanner(System.in);
		CinemaSystemBackManager fm= new CinemaSystemBackManager();
		int choose,time,result;
		String name,type,location,info,date;
		double price;
		Film film;
		Cinema cinema;
		do {
			System.out.println("请输入：");
			System.out.println("1.添加上映电影信息");
			System.out.println("2.添加新增电影院");
			System.out.println("3.查看当前热门电影");
			System.out.println("4.为某个电影院添加电影的排场信息");
			System.out.println("5.查询当前上映的电影，显示名字，类型，上映时间");
			System.out.println("6.根据电影名称显示该电影的所有信息");
			System.out.println("7.根据影院名称，查询该影院正在上映的电影");
			System.out.println("8.退出！");
			choose= input.nextInt();
			switch(choose) {
			case 1:
				System.out.println("请输入电影名称");
				name=input.next();
				System.out.println("请输入电影类型");
				type=input.next();
				System.out.println("请输入电影发行地点");
				location=input.next();
				System.out.println("请输入电影时长");
				time=input.nextInt();
				System.out.println("请输入电影上映时间");
				date=input.next();
				System.out.println("请输入电影简介");
				info=input.next();
				film= new Film();
				film.setName(name);
				film.setType(type);
				film.setLocation(location);
				film.setDate(date);
				film.setInfo(info);
				result=fm.addFilm(film);
				if(result == -1) {
					System.out.println("添加失败！");
				}else {}
				System.out.println("添加成功！");
				break;
			case 2:
				System.out.println("请输入要添加电影院的名称");
				name=input.next();
				cinema = new Cinema();
				cinema.setName(name);
				result=fm.addCinema(cinema);
				if(result == -1) {
					System.out.println("添加失败！");
				}else {}
				System.out.println("添加成功！");
				break;
			case 3:
				
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println( );
				break;
			case 7:
				break;
			case 8:
				break;
			}
		}while(true);
		
		
	}

}
