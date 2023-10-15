package com.multi.thread;

public class RunnableDemo3 implements Runnable{
	
	public RunnableDemo3() {
		
	}
	
	public RunnableDemo3(RunnableDemo3 rd,String name,int prior) {
		Thread th = new Thread(rd,name);
		th.start();
		th.setPriority(prior);
	}

	public void run() {
		System.out.println("Hii "+Thread.currentThread().toString());
	}
	public static void main(String[] args) {
		RunnableDemo3 rd1 = new RunnableDemo3();
		new RunnableDemo3(rd1,"Java",1);
		new RunnableDemo3(rd1,"Python",5);
		new RunnableDemo3(rd1,"PHP",8);
	}
}