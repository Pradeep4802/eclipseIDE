package com.exceptionHandling;

import java.io.IOException;

class ThrowsNew1
{
	void show() throws IOException {
		System.out.println("Hi");
	}
	void demo() throws Exception{
		show();
	}
	void data() throws Exception{
		demo();
	}
	void display() throws Exception{
		data();
	}
}
public class ThrowsExample1 {
	public static void main(String[] args) {
		ThrowsNew1 tn = new ThrowsNew1();
		try {
			tn.display();			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
