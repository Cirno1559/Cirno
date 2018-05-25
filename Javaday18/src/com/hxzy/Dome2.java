package com.hxzy;

public class Dome2 implements Runnable {
	private Dome3 n;
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
		Dome2 other = (Dome2) obj;
		if (n == null) {
			if (other.n != null)
				return false;
		} else if (!n.equals(other.n))
			return false;
		return true;
	}
	public Dome3 getN() {
		return n;
	}
	public void setN(Dome3 n) {
		this.n = n;
	}
	
	public Dome2(Dome3 n) {
		super();
		this.n = n;
	}
	@Override
	public void run() {
		while(true) {
			try {
				this.n.del();
				Thread.sleep(300);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
