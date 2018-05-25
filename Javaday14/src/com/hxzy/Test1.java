package com.hxzy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		 
		comparable();
		System.out.println("------------");
		comparator() ;
	}
	private static void add() {
		TreeSet<Employee> ts = new TreeSet<Employee>(); 
		 ts.add(new Employee("张三", 18, new MyDate(2000, 1, 1)));
		 ts.add(new Employee("李四", 20, new MyDate(1997, 5, 9)));
		 ts.add(new Employee("王五", 28, new MyDate(1989, 11, 21)));
		 ts.add(new Employee("赵六", 50, new MyDate(1967, 3, 6)));
		 ts.add(new Employee("孙七", 34, new MyDate(1983, 6, 8)));
		 for (Employee info : ts) {
			System.out.println(info.toString());
		}
	}
	private static void comparable() {
	 add();
	 }
	@SuppressWarnings("unchecked")
	public static void comparator() {
	List list = new ArrayList<Employee>();
	list.add(new Employee("张三", 18, new MyDate(2000, 1, 1)));
	list.add(new Employee("李四", 20, new MyDate(1997, 5, 9)));
	list.add(new Employee("王五", 28, new MyDate(1989, 11, 21)));
	list.add(new Employee("赵六", 50, new MyDate(1967, 3, 6)));
	list.add(new Employee("孙七", 34, new MyDate(1983, 6, 8)));
	Collections.sort(list, new EmployeeComparator());
	for (Iterator<Employee> iterator = list.iterator(); iterator.hasNext();) {
		Employee list2 =  iterator.next();
		System.out.println(list2.toString());
	}
			
	
	
	}
}
	
