package com.hxzy2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
	public static void main(String[] args) {
		int coer = Runtime.getRuntime().availableProcessors();
		ExecutorService executor = Executors.newFixedThreadPool(coer);
		Ticket ticket = new Ticket();
		
		for (int i = 0; i < 4; i++) {
			executor.execute(new Ticket(i));
		}
		executor.shutdown();
	}
}
