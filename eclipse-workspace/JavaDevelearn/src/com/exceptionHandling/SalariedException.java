package com.exceptionHandling;
class SalaryCalculate extends Exception {

}

class Person {
	public void calculateSalary() throws SalaryCalculate {
		throw new SalaryCalculate();
	}
}

class Comapany {
	public void paySalaries() throws SalaryCalculate{
		new Person().calculateSalary();
	}
}

public class SalariedException {
	public static void main(String[] args){
		Comapany c = new Comapany();
		try {

			c.paySalaries();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
