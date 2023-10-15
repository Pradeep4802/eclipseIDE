package com.enam.pro;

public enum Days {

	Sunday,Monday,TuesDay,Wednesday,Thursday,Friday,Saturday;
	
	static int k = 78;
	
	private Days() {
		System.out.println("Constrictor invoke");
	}
	
	static void meth1() {
		System.out.println("Pradeep");
	}
	
	
	static String show() {
		return "Abhinay";
	}
	
	public static void main(String[] args) {
		meth1();
		String d2 = Days.show();
		System.out.println(d2);
	}
}
