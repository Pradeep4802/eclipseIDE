package com.multi.thread;

public class Execution {
	public static void main(String[] args) {

		Table t=new Table();
		
		ThreadDemo1 tb=new ThreadDemo1(t);
		ThreadDemo2 tb1=new ThreadDemo2(t);
		
		System.out.println("----Demo-----");
		tb.start();
		System.out.println("----Hiiii-----");
		tb1.start();
		System.out.println("----hello-----");
	}
}
