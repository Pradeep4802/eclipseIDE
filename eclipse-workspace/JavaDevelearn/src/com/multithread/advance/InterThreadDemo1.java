package com.multithread.advance;

class Data {
	synchronized void show() throws InterruptedException {
		System.out.println("Python Developer.."+Thread.currentThread().toString());
		Thread.sleep(1000);
		if(Thread.currentThread().getName().equals("Java") || Thread.currentThread().getName().equals("Python")) {			
			wait();
		} else {
			notify();
		}
		
		System.out.println("Java Developer.."+Thread.currentThread());
	}
}

public class InterThreadDemo1 extends Thread{
	Data d;
	public InterThreadDemo1(Data d) {
		this.d = d;
	}
	public void run() {
		try {
			d.show();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Data d1 = new Data();
		InterThreadDemo1 id1 = new InterThreadDemo1(d1);
		InterThreadDemo1 id2 = new InterThreadDemo1(d1);
		id1.setName("Python");
		id2.setName("Java");
		System.out.println("----------------");
		id1.start();
		System.out.println("----------------");
		id2.start();
		System.out.println("----------------");
	}
}
