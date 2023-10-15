package com.exceptionHandling;

class MainA {
	public void doA() {
		MainB mb = new MainB();
		mb.doB();
	}
}
class MainB {
	public void doB() {
		MainC mb = new MainC();
		mb.doC();
	}
}
class MainC {
	public void doC() {
		if(true) {
			throw new NullPointerException();
		}
		System.out.println("doC");
	}
}

public class MultipleExceptionThrpw {
	public static void main(String[] args) {
		try {			
			MainA ma = new MainA();
			ma.doA();
		} catch (Exception e) {
			System.out.println("Error");
		}

	}
}
