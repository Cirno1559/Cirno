package com.hxzy2;



public class Client2 {
	public static void main(String[] args) {
		//ģ��4����վ��Ʊ
		Ticket train = new Ticket();
		
		//4���߳�ģ�⹲ͬ��Ʊ
		Thread t1 = new Thread(train,"վ��1");
		//t1.setPriority(10);
		t1.start();
		
		Thread t2 = new Thread(train,"վ��2");
		//t2.setPriority(1);
		t2.start();
		
		Thread t3 = new Thread(train,"վ��3");
		//t3.setPriority(1);
		t3.start();
		Thread t4 = new Thread(train,"վ��4");
		//t4.setPriority(1);
		t4.start();
	}
}