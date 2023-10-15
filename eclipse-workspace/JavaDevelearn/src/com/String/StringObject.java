package com.String;

public class StringObject {
	public static void main(String[] args) {
		String str1 = "Java";		// This is SCP(String constant pool)  
		String x1 = new String("Python");
		
		System.out.println(str1==x1);
		
		String str2 = "Java";
		
		System.out.println(str1==str2);
		
		String x2 = new String("Python");
		
		System.out.println(x1==x2);
		
		System.out.println(x1.equals(x2));
		
		System.out.println(x1.compareTo(x2));
		
		String x3 = new String("PHP");
		
		System.out.println(x1.compareTo(x3));
	}
}
