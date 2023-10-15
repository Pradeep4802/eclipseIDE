package com.String;

public class ToCharArray {
	public static void main(String[] args) {
		char ch[] = {'A','B','C','D','E'};
		System.out.println(ch.getClass());
//		String str1 = ch;
		String str = new String(ch);
		System.out.println(str);
		char c[] = str.toCharArray();
		System.out.println(c.getClass());
		System.out.println(str.toCharArray().getClass());
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println("-----------------------");
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
