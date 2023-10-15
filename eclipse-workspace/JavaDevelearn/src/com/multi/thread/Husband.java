package com.multi.thread;

public class Husband extends Thread{
	
	Bank b;

	public Husband(Bank b) {
		this.b = b;
	}

	public void run() {
		try {
		b.setDeposit();
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
