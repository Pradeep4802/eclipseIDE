package com.exceptionHandling;

class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}
}

public class ThrowBankAccount {
	private double bal;
	
	public ThrowBankAccount(double initialBal) {
		bal = initialBal;
	}
	
	public double withdraw(double amount) throws InsufficientFundsException {
		if(amount > bal) {
			throw new InsufficientFundsException("Insufficient funds");
		}
		return bal -= amount;
	}
	
	public static void main(String[] args) {
		ThrowBankAccount ta = new ThrowBankAccount(10000);
		try {
			double bal = ta.withdraw(1200);
			System.out.println("Balance: "+bal);
		} catch(InsufficientFundsException a) {
			System.out.println("Exceptions: " + a.getSuppressed());
		}
	}
}
