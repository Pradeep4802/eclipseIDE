package com.multithread.advance;

class Thread1 extends Thread{
	MultiDemo1 d1;

	public Thread1(MultiDemo1 d1) {
		this.d1 = d1;

	}

	public void run() {
		try {
			d1.show();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Thread2 extends Thread{
	MultiDemo1 d2;

	public Thread2(MultiDemo1 d2) {

		this.d2 = d2;
	}
	public void run() {
		try {
			d2.show();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class SyncThread1 {
	public static void main(String[] args) {
		MultiDemo1 md1 = new MultiDemo1();
		System.out.println("------Thread was started-----");
		new Thread1(md1).start();
		new Thread2(md1).start();
		System.out.println("------Thread was ended-----");
	}
}
