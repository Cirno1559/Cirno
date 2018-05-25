package com.hxzy;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		//空针异常
		try {
			String s = null;
			int length = s.length();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 验证数学异常
		try {
			int i=1,j=0;
			int n;
			n=i/j;
		} catch (Exception e) {
			e.printStackTrace();
		}
		//数字格式异常
		try {
				String number = "月亮";
				Integer s2 = Integer.parseInt(number);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//索引越界异常
		try {
			int [] a = new int[10];
			System.out.println(a[10]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//类型转换异常
		try {
			Object a1 = "月亮";
			int a2 = (int)a1;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
