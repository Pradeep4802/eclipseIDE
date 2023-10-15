package com.Practice.Mock;

public class FindPrime {
	
	static int x = 2;
	public void checkPrime(int num) {
		int rem = find(num,x);
		x+=1;
		if(x == num) {
			System.out.println("Prime");
			return;
		}
		if(rem == 0) {
			System.out.println("Not prime");
			return;
		}
		checkPrime(num);
	}
	
	public int find(int n,int x) {
		return n % x;
	}
	
	public static void main(String[] args) {
		FindPrime fp = new FindPrime();
		fp.checkPrime(7);
		fp.checkPrime(16);
		fp.checkPrime(27);
		fp.checkPrime(12);
	}
}
