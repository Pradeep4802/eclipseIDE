package com.multi.thread;

public class Wife extends Thread{

	Bank b;

	public Wife(Bank b) {
		this.b = b;
	}

	public void run() {
		try {
			b.setWithdraw();
		}catch (Exception e) {
			e.printStackTrace();

		}
	}
}
