package com.String;

import java.io.UnsupportedEncodingException;

public class GetBytes {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "@$#%Hello Pradeep PAl";
		byte arr[] = str.getBytes("UTF-8");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
}
