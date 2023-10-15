package com.String;

public class CompareMethod {
	public static void main(String[] args) {
		String a = "ABC";
		String b = "ABC";
		String c = "ACD";
		String d = "ABD";
		String e = "aBC";
		
		System.out.println(" a and b : "+a.compareTo(b));
		System.out.println(" a and c : "+a.compareTo(c));
		System.out.println(" a and d : "+a.compareTo(d));
		System.out.println(" a and e : "+a.compareTo(e));
		
		System.out.println("------------------------------");
		
		System.out.println(" b and c : "+b.compareTo(c));
		System.out.println(" b and d : "+b.compareTo(d));
		System.out.println(" b and e : "+b.compareTo(e));
		
		System.out.println("------------------------------");
		
		System.out.println(" c and d : "+c.compareTo(d));
		System.out.println(" c and e : "+c.compareTo(e));
	
		System.out.println("-------------------------------");
		
		System.out.println(" d and e : "+d.compareTo(e));
	}
}
