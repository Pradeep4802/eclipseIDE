package practice.multithreaded;

import java.util.Iterator;

public class MultiDemo_02_1 extends Thread{
	public MultiDemo_02_1() {
		setName("Suraj");
		setPriority(7);
	}

	public void demo() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("Demo was Called "+i);
			Thread.sleep(200);
		}
	}
	public void show() throws InterruptedException {
		for(int i = 0;i < 5; i++) {
			System.out.println("Show was Calling "+i);
			Thread.sleep(200);
		}
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread "+Thread.currentThread().getThreadGroup());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MultiDemo_02_1 m1 = new MultiDemo_02_1();
//		Thread th1 = new Thread(m1);
		m1.demo();
		m1.start();
		m1.show();
	}
}
