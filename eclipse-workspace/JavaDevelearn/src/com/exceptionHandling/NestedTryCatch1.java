package com.exceptionHandling;

public class NestedTryCatch1 {
	public static void main(String[] args) {
		try {
			System.out.println(2/2);
			System.out.println(Integer.parseInt("A"));
			try {
				int num = 10;
				System.out.println();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		catch(RuntimeException e) {
			try {
//				String s = null;
//				System.out.println(s.length());
				System.out.println(Integer.parseInt("A"));
			}
			catch(NullPointerException e1) {
				System.out.println("Mala");
			}
			catch(NumberFormatException e2) {
				System.out.println("jahala");
			}
			finally {
				System.out.println("Karjat");
			}
		}
		catch(Exception e) {
			System.out.println("Kala");
		}
		finally {
			System.out.println("Thane");
		}
		System.out.println("Hi");
	}
}
