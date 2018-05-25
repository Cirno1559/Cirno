package com.hxzy.aop;

public class Client {

	public static void main(String[] args) {
		CalcDemo c = new CalcDemo();
	/*	int result = c.add(5, 10);
		System.out.println(result);//重复代码块
		
		int minus = c.minus(40, 20);
		System.out.println(minus);//重复代码块
*/		
		MyProxy<Calc, CalcDemo> proxy = new MyProxy<>();
		Calc calc = proxy.blink(c);//通过动态代理得到代理对象
		calc.add(5, 15);
		
		calc.minus(10, 5);
	}

}
