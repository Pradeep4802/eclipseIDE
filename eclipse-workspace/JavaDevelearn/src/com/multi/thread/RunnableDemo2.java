package com.multi.thread;

public class RunnableDemo2 implements Runnable{
	public RunnableDemo2(String name,int prior) {
		Thread th = new Thread(this,name);
		th.start();
		th.setPriority(prior);
	}

	public void run() {
		System.out.println("Hii "+Thread.currentThread().toString());
	}
	public static void main(String[] args) {
		RunnableDemo2 rd1 = new RunnableDemo2("Java",1);
		RunnableDemo2 rd2 = new RunnableDemo2("Python",5);
		RunnableDemo2 rd3 = new RunnableDemo2("PHP",8);
	}
}
