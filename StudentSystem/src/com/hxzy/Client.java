package com.hxzy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Client {
	 static Scanner input = new Scanner(System.in);
	 static Student student = new Student();
	 static Score score = new Score();
	 static Map<String, Student> stuMap = new HashMap<String, Student>();
	 static Map<String, List> scoMap = new HashMap<String, List>();
	 static List<Score> scoList = new ArrayList<Score>();
	 
	public static void main(String[] args) {
		/*����ʵ�����¹���
1.	���ѧ��
2.	��ӳɼ���Ϣ������ѧ����ӳɼ��������ڵ�ѧ������ʾ�û���
3.	����������ѯѧ����Ϣ������ѧ�������ظ���
4.	��ѯ����ѧ�����Գɼ���Ϣ����ʾ��ʽ��ѧ�ţ���������Ŀ���ɼ���
5.	��ѯ����ѧ����Ϣ,��ʾ��ʽ��ѧ�ţ����������䣬�Ա𣬵绰����ַ��
6.	��ѯ�������18�겢���Ա�ΪŮ��ѧ������
7.	��ѯ���п��Գɼ���60�����µ�ѧ����Ϣ����ʾ��ʽ��ѧ�ţ���������Ŀ���ɼ���
8.	ͳ�����е�ѧ������
9.	����ѧ��ɾ��ѧ����Ϣ��ɾ��ѧ����Ϣʱ��ͬʱɾ��ѧ���ɼ�
10.	����ѧ���޸�ѧ����Ϣ
11.	����ѧ�������������ѧ����Ϣ

		 * */
		
		
		

		do{
			System.out.println("������Ҫѡ���ѡ��");
			int choose = input.nextInt();
			switch(choose) {
			case 1:
				addStudent();
				break;
			case 2:
				addScore();
				break;
			case 3:
				searchName();
				break;
			case 4:
				searchAllScore();
				break;
			case 5:
				searchAllStudent();
				break;
			case 6:
				searchGirl();
				break;
			case 7:
				search60();
				break;
			case 8:
				total();
				break;
			case 9:
				del();
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				System.out.println("ллʹ�ã��ټ���");
				return;
			default :
				System.out.println("��������");
				break;
			}
		}while(true);
		
	}

	/**
	 *����ѧ��ɾ��ѧ����Ϣ��ɾ��ѧ����Ϣʱ��ͬʱɾ��ѧ���ɼ� 
	 */
	private static void del() {
		System.out.println("������Ҫɾ��ѧ����Ϣ��ѧ��");
		String stuNo = input.next();
		stuMap.remove(stuNo);
		scoMap.remove(stuNo);
	}

	/**
	 *ͳ�����е�ѧ������ 
	 */
	private static void total() {
		long count = stuMap.size();
		System.out.println("ѧ������Ϊ"+count);
		
	}

	/**
	 * ��ѯ���п��Գɼ���60�����µ�ѧ����Ϣ����ʾ��ʽ��ѧ�ţ���������Ŀ���ɼ���
	 */
	private static void search60() {
		/* filter
		 * map
		 * reduce
		 * collect    Collectors�ֵķ���
		 * */
		List<Score> collect = scoList.stream().filter(i -> i.getScore()<60).collect(Collectors.toList());
	}

	/**
	 * ��ѯ�������18�겢���Ա�ΪŮ��ѧ������
	 */
	private static void searchGirl() {
		
		long count=stuMap.values().stream().filter(i -> i.getStuSex().equals("Ů")&&i.getStuAge()>=18).count();
		System.out.println("�������18�겢���Ա�ΪŮ��ѧ��������"+count);
	}

	/**
	 * ��ѯ����ѧ����Ϣ,��ʾ��ʽ��ѧ�ţ����������䣬�Ա𣬵绰����ַ��
	 */
	private static void searchAllStudent() {
		stuMap.values().stream().forEach(i -> System.out.println(i.toString()));
	}

	/**
	 * ��ѯ����ѧ�����Գɼ���Ϣ����ʾ��ʽ��ѧ�ţ���������Ŀ���ɼ���
	 */
	private static void searchAllScore() {
		scoList.stream().forEach(i -> System.out.println(i.toString()));
	}

	/**
	 * �������ֲ���ѧ��
	 */
	private static void searchName() {
		System.out.println("������Ҫ���ҵ�ѧ��������");
		String stuName = input.next();
		stuMap.values().stream().filter(i -> i.getStuName().equals(stuName)).forEach(i -> i.toString());
	}

	/**
	 * ��ӳɼ�
	 */
	private static void addScore() {
		System.out.println("������Ҫ���ѧ���ɼ���ѧ����ѧ��");
		String stuNo = input.next();
		if(stuMap.keySet().equals(stuNo)) {	
			String stuName = stuMap.get(stuNo).getStuName();
			System.out.println("������Ҫ���ѧ���ɼ���ѧ���Ŀ�Ŀ");
			String course =  input.next();
			System.out.println("������Ҫ���ѧ���ɼ���ѧ���ĳɼ�");
			Double score1 = input.nextDouble();
			System.out.println("������Ҫ��ӿ�Ŀ�Ŀ�������");
			String date =  input.next();
			score = new Score(stuName, stuNo, course, score1, date);
			scoList.add(score);
			scoMap.put(stuNo, scoList);
			if(scoMap.get(stuNo).get(1).equals(stuNo)) {
				System.out.println("��ӳɹ���");
			}
			
		}else {
			System.out.println("û�и�ѧ����");
		}
	}

	/**
	 * ���ѧ����Ϣ
	 */
	private static void addStudent() {
		System.out.println("������ѧ��ѧ��");
		String stuNo = input.next();
		System.out.println("������ѧ������");
		String stuName = input.next();
		System.out.println("������ѧ���Ա�");
		String stuSex = input.next();
		System.out.println("������ѧ������");
		Integer stuAge = input.nextInt();
		System.out.println("������ѧ���绰");
		Integer telephone = input.nextInt();
		System.out.println("������ѧ����ַ");
		String address = input.next();
		student.setAddress(address);
		student.setStuAge(stuAge);
		student.setStuName(stuName);
		student.setStuNo(stuNo);
		student.setStuSex(stuSex);
		student.setTelephone(telephone);
		stuMap.put(stuNo, student);
		if(stuMap.keySet().equals(stuNo)) {
			System.out.println("�����Ϣ�ɹ���");
		}else {
			System.out.println("���ʧ�ܣ�");
		}
	}
	

}
