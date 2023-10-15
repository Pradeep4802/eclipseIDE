package com.multi.thread;

public class ThreadDemo1 extends Thread{

	Table t;

	public ThreadDemo1(Table t) {
		this.t=t;
	}

	public void run() {
		t.numberTable(5);
	}
}
