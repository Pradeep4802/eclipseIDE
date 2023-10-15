package com.Practice.Mock;

class NonDemoInher {
	int k;
	static {
		System.out.println("Java First");
	}
	{
		k=10;
		System.out.println(k);
	}
}

class NonDemoInher1 extends NonDemoInher{
	int m;
	{
		m=20;
		System.out.println(m);
	}
}

public class InherDemo1 extends NonDemoInher1{
	int n;
	public static void demo() {
		System.out.println("Demo Called");
	}
	static {
		demo();
		System.out.println("Python Second");
		InherDemo1 id1 = new InherDemo1();
	}
	{
		n=30;
		System.out.println(n);
		
	
	}
	public static void main(String[] args) {
//		InherDemo1 ih1 = new InherDemo1();
	}
}
