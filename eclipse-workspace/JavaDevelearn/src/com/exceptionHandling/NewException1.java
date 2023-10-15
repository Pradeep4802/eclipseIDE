package com.exceptionHandling;
import java.util.*;
public class NewException1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = null;
		System.out.println("Supposed Error");
		try {
			System.out.println(x.toUpperCase());
			System.out.println(x.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		int rd[] = {1,22,333,4444,5555};
		try {
			System.out.println(rd[10]);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {		
			System.out.println(rd[rd.length]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String str = "A";
		try {
			System.out.println(Integer.parseInt(str)+10+20);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int a = sc.nextInt();
		try {
			System.out.println(a);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
