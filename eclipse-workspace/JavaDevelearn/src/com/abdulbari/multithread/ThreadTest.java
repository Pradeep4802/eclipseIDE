package com.abdulbari.multithread;

class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
		setPriority(Thread.MIN_PRIORITY+2);
		//		Thread t1 = new Thread(name);
		//		System.out.println(t1.getName());
	}

	public void run() {
		int count = 1;

		while(true) {
			System.out.println(count++ +"My thread");	
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) throws Exception{
		MyThread t = new MyThread("My Thread");
		t.start();

		//		System.out.println("ID : "+t.getId());
		//		System.out.println("Name : "+t.getName());
		//		System.out.println("Priorities : "+t.getPriority());
		//		t.start();
		//		System.out.println("State : "+t.getState());
		//		System.out.println("Alive : "+t.isAlive());
		//		t.setDaemon(true);
		//		Thread mainThread = Thread.currentThread();
		//		mainThread.join();
		//		t.interrupt();

		//		try {Thread.sleep(5000);}catch(Exception e) {}

		int count = 1;

		while(true) {
			System.out.println(count++ +"Main");
			Thread.yield();
		}
	}
}
