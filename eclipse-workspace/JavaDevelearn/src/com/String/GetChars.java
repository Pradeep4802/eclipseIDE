package com.String;

public class GetChars {
	public static void main(String[] args) {
		String source = "Hello Pradeep Pal Manush Syrah hduusj";
		char[] dest = new char[10];
		source.getChars(7, 15, dest, 0);
		System.out.println(dest);
	}
}
