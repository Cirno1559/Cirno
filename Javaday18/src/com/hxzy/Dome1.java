package com.hxzy;

public class Dome1 implements Runnable {
	
	private Dome3 n;
	public Dome3 getN() {
		return n;
	}
	public void setN(Dome3 n) {
		this.n = n;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((n == null) ? 0 : n.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dome1 other = (Dome1) obj;
		if (n == null) {
			if (other.n != null)
				return false;
		} else if (!n.equals(other.n))
			return false;
		return true;
	}
	public Dome1(Dome3 n) {
		super();
		this.n = n;
	}
	@Override
	public void run() {
		while(true) {
			try {
			this.n.add();
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
