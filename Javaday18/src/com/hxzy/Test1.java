package com.hxzy;

public class Test1 {
public static void main(String[] args) {
	Dome3 n = new Dome3();
	Thread t1 = new Thread(new Dome1(n));
	Thread t2 = new Thread(new Dome1(n));
	Thread t3 = new Thread(new Dome2(n));
	Thread t4 = new Thread(new Dome2(n));
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	
}
}
