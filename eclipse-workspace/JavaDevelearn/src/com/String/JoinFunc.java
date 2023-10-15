package com.String;

public class JoinFunc {
	public static void main(String[] args) {
		String str1[] = {"Pradeep","Pal","Manish","Singh"};
		
		String str3 = String.join("-", "Java", "is","cool");
		System.out.println(str3);
		
		int d = 20;
		System.out.println(String.valueOf(d));
		
		System.out.println("---------------------");
		
		char data[] = {'a','b','c','d'};
		String str = String.copyValueOf(data);
		System.out.println(str);
	}
}
