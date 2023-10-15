package com.inheritance;

class CreateInstance {
	private static CreateInstance ci = new CreateInstance();
	private CreateInstance() {}
	public void demo() {
		System.out.println("Java Developer");
	}
	public static CreateInstance data() {
		return new CreateInstance();
	}
}
public class PrivateConstructor {
	public static void main(String[] args) {
		CreateInstance.data().demo();
	}
}
