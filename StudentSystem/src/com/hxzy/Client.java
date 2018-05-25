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
		/*先需实现以下功能
1.	添加学生
2.	添加成绩信息（根据学号添加成绩，不存在的学号则提示用户）
3.	根据姓名查询学生信息（允许学生姓名重复）
4.	查询所有学生考试成绩信息，显示格式（学号，姓名，科目，成绩）
5.	查询所有学生信息,显示格式（学号，姓名，年龄，性别，电话，地址）
6.	查询年龄大于18岁并且性别为女的学生人数
7.	查询所有考试成绩在60分以下的学生信息，显示根式（学号，姓名，科目，成绩）
8.	统计所有的学生人数
9.	根据学号删除学生信息，删除学生信息时，同时删除学生成绩
10.	根据学号修改学生信息
11.	根据学生年龄排序并输出学生信息

		 * */
		
		
		

		do{
			System.out.println("请输入要选择的选项");
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
				System.out.println("谢谢使用，再见！");
				return;
			default :
				System.out.println("输入有误！");
				break;
			}
		}while(true);
		
	}

	/**
	 *根据学号删除学生信息，删除学生信息时，同时删除学生成绩 
	 */
	private static void del() {
		System.out.println("请输入要删除学生信息的学号");
		String stuNo = input.next();
		stuMap.remove(stuNo);
		scoMap.remove(stuNo);
	}

	/**
	 *统计所有的学生人数 
	 */
	private static void total() {
		long count = stuMap.size();
		System.out.println("学生总数为"+count);
		
	}

	/**
	 * 查询所有考试成绩在60分以下的学生信息，显示根式（学号，姓名，科目，成绩）
	 */
	private static void search60() {
		/* filter
		 * map
		 * reduce
		 * collect    Collectors种的方法
		 * */
		List<Score> collect = scoList.stream().filter(i -> i.getScore()<60).collect(Collectors.toList());
	}

	/**
	 * 查询年龄大于18岁并且性别为女的学生人数
	 */
	private static void searchGirl() {
		
		long count=stuMap.values().stream().filter(i -> i.getStuSex().equals("女")&&i.getStuAge()>=18).count();
		System.out.println("年龄大于18岁并且性别为女的学生人数是"+count);
	}

	/**
	 * 查询所有学生信息,显示格式（学号，姓名，年龄，性别，电话，地址）
	 */
	private static void searchAllStudent() {
		stuMap.values().stream().forEach(i -> System.out.println(i.toString()));
	}

	/**
	 * 查询所有学生考试成绩信息，显示格式（学号，姓名，科目，成绩）
	 */
	private static void searchAllScore() {
		scoList.stream().forEach(i -> System.out.println(i.toString()));
	}

	/**
	 * 根据名字查找学生
	 */
	private static void searchName() {
		System.out.println("请输入要查找的学生的名字");
		String stuName = input.next();
		stuMap.values().stream().filter(i -> i.getStuName().equals(stuName)).forEach(i -> i.toString());
	}

	/**
	 * 添加成绩
	 */
	private static void addScore() {
		System.out.println("请输入要添加学生成绩的学生的学号");
		String stuNo = input.next();
		if(stuMap.keySet().equals(stuNo)) {	
			String stuName = stuMap.get(stuNo).getStuName();
			System.out.println("请输入要添加学生成绩的学生的科目");
			String course =  input.next();
			System.out.println("请输入要添加学生成绩的学生的成绩");
			Double score1 = input.nextDouble();
			System.out.println("请输入要添加科目的考试日期");
			String date =  input.next();
			score = new Score(stuName, stuNo, course, score1, date);
			scoList.add(score);
			scoMap.put(stuNo, scoList);
			if(scoMap.get(stuNo).get(1).equals(stuNo)) {
				System.out.println("添加成功！");
			}
			
		}else {
			System.out.println("没有该学生！");
		}
	}

	/**
	 * 添加学生信息
	 */
	private static void addStudent() {
		System.out.println("请输入学生学号");
		String stuNo = input.next();
		System.out.println("请输入学生姓名");
		String stuName = input.next();
		System.out.println("请输入学生性别");
		String stuSex = input.next();
		System.out.println("请输入学生年龄");
		Integer stuAge = input.nextInt();
		System.out.println("请输入学生电话");
		Integer telephone = input.nextInt();
		System.out.println("请输入学生地址");
		String address = input.next();
		student.setAddress(address);
		student.setStuAge(stuAge);
		student.setStuName(stuName);
		student.setStuNo(stuNo);
		student.setStuSex(stuSex);
		student.setTelephone(telephone);
		stuMap.put(stuNo, student);
		if(stuMap.keySet().equals(stuNo)) {
			System.out.println("添加信息成功！");
		}else {
			System.out.println("添加失败！");
		}
	}
	

}
