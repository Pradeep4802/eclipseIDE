package com.String;

import java.util.Iterator;

public class StringIndex {
	public static void main(String[] args) {
		char ch[] = {'A','B','C','D','E'};
		String x = new String(ch);
//		String c = ch;
		
		System.out.println(x);
		
		System.out.println(ch);
		
		for (char c : ch) {
			System.out.println(c);
		}
		
		System.out.println();
		
		for (int i = 0; i < x.length(); i++) {
			System.out.println(x.charAt(i));
		}
		System.out.println();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
	}
}
