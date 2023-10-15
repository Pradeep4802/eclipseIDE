package com.multi.thread;

public class ThreadDemo2 extends Thread{
	Table t;

	public ThreadDemo2(Table t) {
		this.t=t;
	}

	public void run() {
		t.numberTable(7);
	}
}
