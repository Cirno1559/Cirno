package com.hxzy;

public class Dome3 {
	private int n = 0;
	public synchronized void add() {
		n++;
		System.out.println("当前n的值是"+n);
		notifyAll();
	}
	public synchronized void del() {
		n--;
		System.out.println("当前n的值是"+n);
		notifyAll();
	}
}
