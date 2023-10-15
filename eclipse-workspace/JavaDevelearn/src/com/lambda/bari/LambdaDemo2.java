package com.lambda.bari;

interface MyLambda2 {
	public boolean display(String str1,String str2);
}

class Lambda2 {
	
	public Lambda2(String s) {
		System.out.println(s.toUpperCase());
	}
	
//	public void reverse(String str) {
//		StringBuffer sb = new StringBuffer(str);
//		sb.reverse();
//		System.out.println(sb);
//	}
}

public class LambdaDemo2 {
	public static void main(String[] args) {
//		Lambda2 ll = new Lambda2();
//		MyLambda2 ml = ll::reverse;
//		MyLambda2 ml = Lambda2::new;
//		MyLambda2 ml = String::equals;
		MyLambda2 ml = (str1,str2)->str1.equals(str2);
		System.out.println(ml.display("Hello","Hello"));
	}
}
