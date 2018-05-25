package com.hxzy;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.equals(o2)) {
			return 0;
		}
		return o1.getAge()<o2.getAge()?-1:(o1.getAge() == o2.getAge()? 0 : 1);
	}

}
