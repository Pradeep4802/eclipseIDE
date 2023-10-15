package com.design.pattern;

public class Way {
	public Way no() {
		return new Way();
	}
	public Way no1(Way w1) {
		return w1;
	}
	public static void main(String[] args) {
		Way n1 = new Way();
		System.out.println(n1);
		System.out.println(n1.no());
//		Way n2 = new Way();
		Way n2 = new Way().no1(n1);
		System.out.println(n2);
		System.out.println("--------------------");
		Way x1 = new Way();
		System.out.println(x1);
		Way x2 = new Way().no1(n1);
		System.out.println(x2);
	}
}
