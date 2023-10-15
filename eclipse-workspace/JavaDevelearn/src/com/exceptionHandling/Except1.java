package com.exceptionHandling;

public class Except1 {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;

		System.out.println(a+b);

		try {
			System.out.println(a/b);
			System.out.println("Hi Everyone");
		}
		catch(Exception e) {
//			System.out.println("Exception occurred");
//			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Hello");
		System.out.println("a-b");
		System.out.println("Hi");
		System.out.println(a*b);
	}
}
