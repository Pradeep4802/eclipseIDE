package com.exceptionHandling;

public class Test1 {
	public static String myTest() {
		try {
			System.out.println("One ");
			return "Man";
		}
		finally {
			System.out.println("Second");
		}
	}
	public static void main(String[] args) {
		System.out.println(myTest());
	}
}
