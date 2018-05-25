package com.hxzy.aop;

public class Client {

	public static void main(String[] args) {
		CalcDemo c = new CalcDemo();
	/*	int result = c.add(5, 10);
		System.out.println(result);//�ظ������
		
		int minus = c.minus(40, 20);
		System.out.println(minus);//�ظ������
*/		
		MyProxy<Calc, CalcDemo> proxy = new MyProxy<>();
		Calc calc = proxy.blink(c);//ͨ����̬����õ��������
		calc.add(5, 15);
		
		calc.minus(10, 5);
	}

}
