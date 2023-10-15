package com.Practice.Mock;

class MultiPart1 implements Runnable {
//	public MultiPart1(String name,int x) {
//		Thread mc = new Thread(this,name);
//		mc.start();
//		mc.setPriority(x);
//	}
	public MultiPart1() {
		
	}
	
	public MultiPart1(MultiPart1 mt, String name,int x) {
		Thread mc = new Thread(mt,name);
		mc.start();
		mc.setPriority(x);
	}
	
	public void run() {
		System.out.println("Python : " + Thread.currentThread());
	}
}

public class MultiThread2 extends Thread{

	public MultiThread2(String name, int prior) {
		start();
		setName(name);
		setPriority(prior);
		show();
	}

	public void show() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Show : "+ i + Thread.currentThread());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void run() {
		System.out.println("Java : " + Thread.currentThread());
	}

	public static void main(String[] args) {
//		MultiThread2 mt1 = new MultiThread2("Messi", MAX_PRIORITY);
//		MultiThread2 mt2 = new MultiThread2("Ronaldo", MIN_PRIORITY);
//		MultiThread2 mt3 = new MultiThread2("Neymar", NORM_PRIORITY);
//		mt1.show();
		
//		MultiPart1 mp1 = new MultiPart1("Akshay",MAX_PRIORITY);
//		MultiPart1 mp2 = new MultiPart1("Ajay",MAX_PRIORITY);
//		MultiPart1 mp3 = new MultiPart1("Hrithik",MAX_PRIORITY);
		
		MultiPart1 mp1 = new MultiPart1();
		new MultiPart1(mp1,"Ninja Hattori",MAX_PRIORITY);
		new MultiPart1(mp1,"Motu_Patlu",MIN_PRIORITY);
		new MultiPart1(mp1,"Doraemon",NORM_PRIORITY);
		
//		Thread th1 = new Thread(mp1);
	}
}
