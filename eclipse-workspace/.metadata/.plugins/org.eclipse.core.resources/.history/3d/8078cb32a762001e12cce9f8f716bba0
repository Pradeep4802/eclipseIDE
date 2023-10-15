package com.multithread.advance;

public class MultipleThread implements Runnable{
	
	String task;
	public MultipleThread(String task) {
		this.task = task;
	}
	
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(task + ": "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Thread nThread = Thread.currentThread();
		System.out.println("Name of Thread: "+nThread);
		
		MultipleThread mt = new MultipleThread("Hello java");
		Runnable rn = new Thread(mt);
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		Thread t3 = new Thread(mt);
		Thread t4 = new Thread(rn);
		
		int count = Thread.activeCount();
		System.out.println("Before of active threads: "+count);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		int count1 = Thread.activeCount();
		System.out.println("After of active threads: "+count1);
	}
}
