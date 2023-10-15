package com.Practice.Mock;

class MRun1 extends Thread{
	public void show() {
		System.out.println("Some Work : "+Thread.currentThread());
	}
	
	public void forDumb() {
		System.out.println("PHP Maker : "+Thread.currentThread());
	}
	
	public void run() {
		System.out.println("Java Thread "+Thread.currentThread());
	}
}

public class MultiThread1 extends Thread{
	public void run() {
		System.out.println("Python Thread "+Thread.currentThread().toString());
	}
	public void forDumb() {
		System.out.println("KOTLIN Maker : "+Thread.currentThread().toString());
	}
	public void show() {
		System.out.println("Other Work : "+Thread.currentThread().toString());
	}
	public static void main(String[] args) {
		MultiThread1 mt1 = new MultiThread1();
		MRun1 mr1 = new MRun1();
//		mt1.start();
		mr1.start();
		System.out.println("----------------------------");
		mr1.setName("Ronaldo");
		mr1.setPriority(MIN_PRIORITY);
//		mr1.show();
//		mr1.forDumb();
		System.out.println("----------------------------");
		System.out.println("----------------------------");		
		mr1.show();
		mr1.forDumb();
	}
}
