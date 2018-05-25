package com.hxzy2;

public class Ticket implements Runnable{
	private int ticket = 20;
	private int n ;

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}


	public Ticket(int n) {
		super();
		this.n = n;
	}

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		while(ticket > 0) {
			synchronized(this) {
				if(ticket <= 0) {
					return;
				}
				String name = Thread.currentThread().getName();
				System.out.println(name+"售出一张票"+ticket--+"当前任务编号"+n);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
