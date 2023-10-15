package com.exceptionHandling;

import java.io.IOException;

class DemoException extends Exception
{
	String msg = "Exception Occured";
	public String toString() {
		return msg;
	}
}

class InvalidException extends Exception {
	String msg=" Developer World";
	public InvalidException(String m) {
		super(m);
	}
	
}
public class UserException {
	void show() {
		System.out.println("Hi");
		try {			
			throw new InvalidException("Error Occurred Invalid");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
//		throw new Demo();
	}
	
	void data() {
		System.out.println("Java");
		try {
			throw new IOException();
//			System.out.println("Progaram");  // This will give the error like unreachable code
		
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void display() {
		System.out.println("Java");
		try {
			System.out.println(2/0);
		} catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	void demo() {
		try {
			throw new InvalidException("Hi Message passed");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		UserException ue = new UserException();
		ue.data();
		ue.show();
		ue.display();
		ue.demo();
	}
}
