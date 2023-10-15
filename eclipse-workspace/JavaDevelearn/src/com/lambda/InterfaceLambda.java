package com.lambda;

interface Addition {
	int add(int x,int y);
}

public class InterfaceLambda {
	public static void main(String[] args) {
		Addition ad = (a,b)->a+b;
		int a = ad.add(12,90);
		System.out.println(a);
	}
}
