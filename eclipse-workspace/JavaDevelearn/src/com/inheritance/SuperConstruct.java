package com.inheritance;

class Super1 {
	public Super1() {
		System.out.println("Java Developer");
	}
}
public class SuperConstruct extends Super1{
	public SuperConstruct(String name) {
		System.out.println(name+" Developer");
	}
	public static void main(String[] args) {
		new SuperConstruct("Pradeep");
	}
}

// Can we override superclass constructors.