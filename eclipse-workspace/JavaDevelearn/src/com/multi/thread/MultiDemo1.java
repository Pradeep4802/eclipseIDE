package com.multi.thread;


public class MultiDemo1 extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Java : "+ i + Thread.currentThread());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
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
	public void display() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Display : "+ i + Thread.currentThread());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MultiDemo1 md1 = new MultiDemo1();
		MultiDemo1 md2 = new MultiDemo1();
		md1.start();
		md1.setName("Pradeep");
		md1.setPriority(MAX_PRIORITY);
		md2.start();
		md2.setName("Human");
		md2.setPriority(MIN_PRIORITY);
		md1.show();
		md1.display();
		md2.show();
		md2.display();
	}
}
