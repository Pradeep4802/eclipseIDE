package com.exceptionHandling;
import java.util.*;
public class ThrowQuestion2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int divi = 10;
		int div = sc.nextInt();
		
		try {
			if(div == 0) {
				throw new ArithmeticException("Cannot divide by zero");
			}
			int res = divi/div;
			System.out.println("Result : " + res);
		} catch (ArithmeticException e) {
			System.out.println("Exception Caught : "+e.getMessage());
		}
	}
}
