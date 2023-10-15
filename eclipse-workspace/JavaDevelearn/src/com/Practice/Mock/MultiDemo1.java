package com.Practice.Mock;

class Multi1 extends Thread{
	public void show() {
		System.out.println("Java was Introduced : "+Thread.currentThread());
	}
	
	public void run() {
		System.out.println("Python was Called : "+Thread.currentThread().getName());
	}
}

public class MultiDemo1 extends Thread{
	
	public void data() {
		System.out.println("PHP was intro : "+Thread.currentThread());
	}
	
	public void run() {
		System.out.println("C++ was Called : "+Thread.currentThread());
	}
	
	public static void main(String[] args) {
		MultiDemo1 md1 = new MultiDemo1();
		Multi1 m1 = new Multi1();
		m1.start();
		m1.show();m1.setName("MERAWALADANACE");
		md1.start();
		md1.data();
		md1.setName("DANCE");
	}
}
