package com.multithread.advance;

public class MultiDemo1 {
	public void show() throws InterruptedException {
		System.out.println("------Start of the thread ------");
		synchronized(this) {
			for (int i = 0; i < 4; i++) {
				Thread.sleep(500);
				System.out.println(i);
			}
		}

		System.out.println("-----End of thread--------------");
	}
}
