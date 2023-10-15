package com.multithread.advance;

class SharedResource {
	boolean dataReady = false;
	int a = 10;
	synchronized void produce() {
		// Produce data here
		dataReady = true;
		System.out.println(a);
		
		notify(); // Notify waiting consumer
		System.out.println("Notify All");
		System.out.println("Notify All");
		System.out.println("Notify All");
	}

	synchronized void consume() throws InterruptedException {
		while (!dataReady) {
			wait(); // Wait for data to be ready
		}
		// Consume data here
		a=30;
		System.out.println(a);
		System.out.println(dataReady);
		System.out.println(dataReady);
		System.out.println(dataReady);
	}
}

public class SyncThread {
	public static void main(String[] args) {
		SharedResource sharedResource = new SharedResource();

		Thread producerThread = new Thread(() -> {
			sharedResource.produce();
		});

		Thread consumerThread = new Thread(() -> {
			try {
				sharedResource.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		producerThread.start();
		consumerThread.start();
	}
}

