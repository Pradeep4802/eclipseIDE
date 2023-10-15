package com.multi.thread;

public class MultiDemo2 extends Thread{
	public MultiDemo2(String name, int x) {
		start();
		setName(name);
		setPriority(x);
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Run method : "+Thread.currentThread());
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MultiDemo2 mda1 = new MultiDemo2("Brahma",MAX_PRIORITY);
		MultiDemo2 mda2 = new MultiDemo2("Vishnu",MIN_PRIORITY);
		MultiDemo2 mda3 = new MultiDemo2("Mahesh",NORM_PRIORITY);
		
	}
}
