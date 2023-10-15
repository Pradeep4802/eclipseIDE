package com.multi.thread;

public class FirstExampleThread extends Thread{
	void show() {
//		System.out.println("Hi");
		for (int i = 0; i <= 5; i++) {
			System.out.println("Show method "+i);
			try {				
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
	
	void demo() {
//		System.out.println("Java");
		for (int i = 0; i < 5; i++) {
			System.out.println("Demo method : "+i);
			try {				
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
	
	public void run() {
//		System.out.println("java Developer");
		for (int i = 0; i <= 5; i++) {
			System.out.println("Thread "+i);
			try {				
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
	public static void main(String[] args) {
		FirstExampleThread fet = new FirstExampleThread();
		fet.start();
		fet.show();
		fet.demo();
	}
}
