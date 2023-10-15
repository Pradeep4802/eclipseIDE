package com.Bank.project;
import java.util.*;

public class Banks {
	static Scanner sc = new Scanner(System.in);
	public static int countUser1 = 1;
	
	// method for checking balance
	public void checkBalance(double b) {
		System.out.println();
		System.out.println("################################################################################");
		System.out.println("#                                                                              #");
		System.out.println("#                        --> CHECK BALANCE <--                                 #");
		double bal = b;
		System.out.println("#    ------>> Balance: " + bal);
		System.out.println("#                                                                              #");
		System.out.println("#                        --> BALANCE CHECKED <--                               #");
		System.out.println("#                                                                              #");
		System.out.println("################################################################################");
		System.out.println();
	}
	
	// method for generating account number to the user 
	public int generateAccountUser() {
		return countUser1++;
	}
	
	
	// method for depositing amount to the bank account
	public double depositBal() {
		System.out.println();
		
		System.out.println();
		System.out.println("*******************************************************************************");
		System.out.println("*------------------------Enter the Amount TO DEPOSIT--------------------------*");
		System.out.println("*******************************************************************************");
		double depositAmount = sc.nextDouble();
		System.out.println();
		return depositAmount;
	}
	
	// method for withdrawing amount from the bank
	public double withdrawBal() {
		System.out.println();
		System.out.println("*******************************************************************************");
		System.out.println("*------------------------Enter the Amount TO WITHDRAW-------------------------*");
		System.out.println("*******************************************************************************");
		double withdrawAmount = sc.nextDouble();
		System.out.println();
		return withdrawAmount;
	}
	
	
}