package com.hxzy;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		System.out.println("��ӭʹ�õ�Ӱ��ѯƽ̨");
		Scanner input= new Scanner(System.in);
		CinemaSystemBackManager fm= new CinemaSystemBackManager();
		int choose,time,result;
		String name,type,location,info,date;
		double price;
		Film film;
		Cinema cinema;
		do {
			System.out.println("�����룺");
			System.out.println("1.�����ӳ��Ӱ��Ϣ");
			System.out.println("2.���������ӰԺ");
			System.out.println("3.�鿴��ǰ���ŵ�Ӱ");
			System.out.println("4.Ϊĳ����ӰԺ��ӵ�Ӱ���ų���Ϣ");
			System.out.println("5.��ѯ��ǰ��ӳ�ĵ�Ӱ����ʾ���֣����ͣ���ӳʱ��");
			System.out.println("6.���ݵ�Ӱ������ʾ�õ�Ӱ��������Ϣ");
			System.out.println("7.����ӰԺ���ƣ���ѯ��ӰԺ������ӳ�ĵ�Ӱ");
			System.out.println("8.�˳���");
			choose= input.nextInt();
			switch(choose) {
			case 1:
				System.out.println("�������Ӱ����");
				name=input.next();
				System.out.println("�������Ӱ����");
				type=input.next();
				System.out.println("�������Ӱ���еص�");
				location=input.next();
				System.out.println("�������Ӱʱ��");
				time=input.nextInt();
				System.out.println("�������Ӱ��ӳʱ��");
				date=input.next();
				System.out.println("�������Ӱ���");
				info=input.next();
				film= new Film();
				film.setName(name);
				film.setType(type);
				film.setLocation(location);
				film.setDate(date);
				film.setInfo(info);
				result=fm.addFilm(film);
				if(result == -1) {
					System.out.println("���ʧ�ܣ�");
				}else {}
				System.out.println("��ӳɹ���");
				break;
			case 2:
				System.out.println("������Ҫ��ӵ�ӰԺ������");
				name=input.next();
				cinema = new Cinema();
				cinema.setName(name);
				result=fm.addCinema(cinema);
				if(result == -1) {
					System.out.println("���ʧ�ܣ�");
				}else {}
				System.out.println("��ӳɹ���");
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
