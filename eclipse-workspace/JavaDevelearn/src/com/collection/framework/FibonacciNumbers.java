package com.collection.framework;
import java.util.*;
public class FibonacciNumbers {
	public static void main(String[] args) {
		System.out.println(5/2);
		List<Integer> list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int length = sc.nextInt();
		for (int i = 0; i < length; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		System.out.println(list);
		int sum = 0;
		for (Integer integer : list) {
			sum+=integer;
		}
		System.out.println("Sum of the Number is "+sum);
		
		System.out.println("------------------------------------");
		for (Integer integer : list) {
			int num = integer;
			int sum1 = 0;
			for (int i = 1; i <= integer; i++) {
				sum1 += i;
			}
			System.out.println(integer + " = " + sum1);
		}
	}
}
