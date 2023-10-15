package com.multi.thread;

import java.util.Scanner;

public class Bank {
	double balance = 100;
	Scanner sc=new Scanner(System.in);

	synchronized public void setDeposit() throws Exception
	{
		System.out.println("Current Balance is : "+balance);
		Thread.sleep(500);
		System.out.println("Enter Amount for Deposit....");
		int amount=sc.nextInt(); 
		Thread.sleep(500);
		balance=balance+amount;
		System.out.println(" Balance After Deposit is : "+balance);
	}



	synchronized public void setWithdraw() throws Exception{
		System.out.println("Current Balance is : "+balance);
		Thread.sleep(500);
		System.out.println("Enter Amount for Withdraw....");
		int amount=sc.nextInt(); 
		Thread.sleep(500);
		balance=balance-amount;
		System.out.println(" Balance After Withdraw is : "+balance);
	}
}
