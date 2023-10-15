package com.multi.thread;

public class Table {
	synchronized void numberTable(int n) {
		for(int i=1;i<=10;i++) {
			
			try {
				Thread.sleep(500);
				System.out.println(n*i);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
