package com.Practice.Mock;

public class SynchronizedExample {
	private int count = 0;
	private Object lock = new Object(); // Object used as a lock

	public void increment() {
		synchronized (lock) { // Synchronized block using the 'lock' object
			count++;
		}
	}

	public int getCount() {
		return count;
	}

	public static void main(String[] args) {
		SynchronizedExample example = new SynchronizedExample();

		// Create multiple threads to increment the count
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				example.increment();
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				example.increment();
			}
		});

		thread1.start();
//		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final count: " + example.getCount());
	}
}

