package com.Pattern;

public class NumberPattern_1 {
	public static void FirstPattern() {
		int i = 1;
		while(i<=5) {
			int j = 5;
			while(j>i) {
				System.out.print(" ");
				j--;
			}
			int k = i;
			while(k >= 1) {
				System.out.print(k);
				k--;
			}
			System.out.println();
			i++;
			
		}
	}
	public static void main(String[] args) {
		FirstPattern();
	}
}
