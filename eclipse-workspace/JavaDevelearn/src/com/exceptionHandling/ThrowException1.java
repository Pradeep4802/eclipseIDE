package com.exceptionHandling;

import java.io.IOException;

class ExceptThrow1 {
	void show() {
		System.out.println("Hi");
		try {			
			throw new RuntimeException();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	void demo() {
		System.out.println("Mala");
		throw new NullPointerException();
	}
	void data() throws IOException{
		System.out.println("kala");
		throw new IOException();
//		throw new Exception();
	}
//	void myDemo() throws 
}

public class ThrowException1 {
	public static void main(String[] args) throws Exception {
		ExceptThrow1 et = new ExceptThrow1();
		et.show();
		try {			
			et.demo();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		try {
			et.data();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("Hello");
	}
}
