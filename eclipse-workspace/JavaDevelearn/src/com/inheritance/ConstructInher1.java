package com.inheritance;

class Inher1 {
	public int a = 10;
	public String str = "Hi Baby";

	public Inher1() {
		//		System.out.println("Java");
	}
	public Inher1(String lang) {
		System.out.println("PHP");
	}

	//Method
	public String getBaby() {
		return "I Love You!!";
	}
}

public class ConstructInher1 extends Inher1{
	public String str = ", My name is pradeep";
	public ConstructInher1() {
		System.out.println(super.str+str);
	}

	//Method
	public String getBaby(int s) {
		if(s == 0) {
			return " ended ";
		}
		return getBaby(s-1)+" Do you Love Me!!";
	}

	//	public ConstructInher1(String name) {
	//		super(name);
	//		System.out.println("Python");
	//	}
	public static void main(String[] args) {
		ConstructInher1 c1 = new ConstructInher1();
		System.out.println(c1.getBaby(5));
		//		ConstructInher1 c2 = new ConstructInher1("Pradeep");
	}
}
