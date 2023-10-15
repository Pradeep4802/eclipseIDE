package com.lambda.bari;

import com.inheritance.MySystem;

interface Lambda1 {
	void display();
}

class UseLambda {
	public void callLambda(Lambda1 lm) {
		lm.display();
	}
}

class MyDemo {
	public void method1() {
		UseLambda ul = new UseLambda();
		ul.callLambda(()->{MySystem.out.println("Hello");});
	}
}

public class NewLambda {
	public static void main(String[] args) {
		MyDemo d1 = new MyDemo();
		d1.method1();
		MySystem.out.println("Method");
	}
}
