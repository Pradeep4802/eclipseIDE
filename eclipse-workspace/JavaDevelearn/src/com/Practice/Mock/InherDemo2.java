package com.Practice.Mock;

class InherDemon2 {
	public void demo() {
		System.out.println("India is on top.");
	}
	
	public static void show() {
		String str = "Pradeep Was called.";
		System.out.println(str);
	}
}

public class InherDemo2 extends InherDemon2{
	public void demo() {
		System.out.println("Pakistan worst");
		super.demo();
	}
	public static void show() {
		String str = "Abhinay Was called.";
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		InherDemo2 ih = new InherDemo2();
		ih.demo();
		InherDemon2.show();
	}
}
