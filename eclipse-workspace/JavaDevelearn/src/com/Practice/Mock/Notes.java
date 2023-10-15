package com.Practice.Mock;
import java.util.*;
public class Notes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int twoTh = 0;
		int fiveHun = 0;
		int twoHun = 0;
		int oneHun = 0;
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		System.out.println(number/2000);
		while(number != 0) {
			if(number >= 2000) {
				twoTh = number / 2000;
				number = number % 2000;
			}
			else if(number >= 500) {
				fiveHun = number / 500;
				number  = number % 500;
			}
			else if(number >= 200) {
				twoHun = number / 200;
				number  = number % 200;
			}
			else if(number >= 100) {
				oneHun = number / 100;
				number  = number % 100;
			}
			else if(number >= 50) {
				fifty = number / 50;
				number  = number % 50;
			}
			else if(number >= 20) {
				twenty = number / 20;
				number  = number % 20;
			}
			else if(number >= 10) {
				ten = number / 10;
				number  = number % 10;
			}
		}
		
		System.out.println("2000 : "+twoTh);
		System.out.println("500 : "+fiveHun);
		System.out.println("200 : "+twoHun);
		System.out.println("100 : "+oneHun);
		System.out.println("50 : "+fifty);
		System.out.println("20 : "+twenty);
		System.out.println("10 : "+ten);
	}
}
