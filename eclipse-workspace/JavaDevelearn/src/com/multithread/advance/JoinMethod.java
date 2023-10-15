package com.multithread.advance;

import java.util.Iterator;

class ThreadMeth1 extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName() +" "+ i);
		}
	}
}

public class JoinMethod {
	public static void main(String[] args) throws InterruptedException {
		ThreadMeth1 t1 = new ThreadMeth1();t1.setName("Java");
		ThreadMeth1 t2 = new ThreadMeth1();t2.setName("Python");
		ThreadMeth1 t3 = new ThreadMeth1();t3.setName("PHP");
		ThreadMeth1 t4 = new ThreadMeth1();t4.setName("C++");
		t1.start();
		t1.join();
		t2.start();
		t3.start();
		t4.start();
	}
}
