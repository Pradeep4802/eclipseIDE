package com.exceptionHandling;

class MyAdmission extends Exception{
	public MyAdmission(String message) {
		super(message);
	}
}

class CustomException extends Exception {
	public CustomException(String message ) {		
		super(message);
	}
}

public class ThrowQuestion1 {
	public static void main(String[] args) {
		try {
			int age = -5;
			if(age < 0) {
				throw new CustomException("Age cannot be negative");
			}
			System.out.println("Age : " + age);
		} catch (CustomException e) {
			System.out.println("Caught an exception: "+e.getMessage());
		}
		try {
			String str = "MCCs";
			if(str == "MCC") {
				System.out.println("Yes u r eligible");
			}
			else {
				throw new MyAdmission("No u r not eligible");
			}
		}
		catch(MyAdmission a) {
			System.out.println("College caught : "+a.getMessage());
		}
	}
}
