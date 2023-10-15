package com.lambda.bari;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@FunctionalInterface
interface MyLambda {
	//	void display(String str);
	//	void demo();
	//	public void show();
	public int add(int x,int y);
}

/*class My implements MyLambda {
	public void display() {
		System.out.println("Hello World");
	}
}*/

public class LambdaDemo {
	public static void main(String[] args) {
		MyLambda m1 = (a,b)-> a+b;
		int r = m1.add(12, 13);
		System.out.println(r);


	}
}
