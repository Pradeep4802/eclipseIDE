package com.exceptionHandling;

public class MultipleException {
	public static void main(String[] args) {
		try {
			System.out.println(2/2);
			int a[] = {1,2,3};
			System.out.println(a[2]);
			String x="null"; 
			System.out.println(x.toUpperCase());
			Integer.parseInt("Java");
		} 
		catch(ArithmeticException  | NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		//		catch (ArithmeticException e) {
		//			System.out.println("java " + e);
		//		}
		//		catch (NullPointerException e) {
		//			System.out.println("Python" + e);
		//		}
		//		catch (ArrayIndexOutOfBoundsException e) {
		//			System.out.println("Ruby" + e);
		//		}
		//		catch(Exception e) {
		//			System.out.println("c++" + e);
		//		}
		finally {
			System.out.println("Developer");
		}
	}
}
