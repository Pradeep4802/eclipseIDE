package com.multi.thread;

public class RunnableDemo1 implements Runnable{
	public void run() {
		System.out.println("Hii "+Thread.currentThread().toString());
	}
	public static void main(String[] args) {
		RunnableDemo1 rd1 = new RunnableDemo1();
		
		Thread th = new Thread(rd1,"Java");
		
		th.start();
	}
}
