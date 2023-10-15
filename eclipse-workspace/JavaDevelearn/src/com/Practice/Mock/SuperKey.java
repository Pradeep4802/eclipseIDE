package com.Practice.Mock;

class Super {
	int k = 10;
	String name = "Pradeep";
	public void speak() {
		System.out.println("Human");
	}
}

public class SuperKey extends Super{
	
	public void speak() {
		super.speak();
		System.out.println("Animal Voice");
	}
	
	public static void main(String[] args) {
		SuperKey sp = new SuperKey();
		sp.speak();
	}
}
