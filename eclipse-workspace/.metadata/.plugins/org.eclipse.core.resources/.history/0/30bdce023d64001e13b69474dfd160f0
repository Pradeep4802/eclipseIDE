package com.collection.framework;

import java.io.PrintStream;
import java.util.*;

public class CollectionExample {
	
	int meth1() {
		return 10;
	}
	
	int meth1(int num) {
		return num;
	}
	
	void meth1(String str) {
		System.out.println("String is :  "+ str);
	}
	
	public static void main(String[] args) {
		List<Integer> col = new ArrayList();
		col.add(45);
		col.add(56);
		col.add(90);
		col.add(78);
		//		col.add(2,101);

		//		Collection interface can hold reference of ArrayList object
		// And perform all operation and use method also.
		Collection<Integer> col2 = new ArrayList<>();
//		System.out.println(col);

		col2.addAll(col);

		System.out.println(col2);
		Spliterator<Integer> it2 = col.spliterator();
		Iterator<Integer> it1 = col.iterator();
		while(it2.hasCharacteristics(1)) {
			System.out.println(it2.characteristics());
		}
		
		CollectionExample cl = new CollectionExample();
		System.out.println(cl.meth1());
		System.out.println(cl.meth1(104));
		cl.meth1("Kabeer");
		
		// Basic Practice
		PrintStream x = System.out.format("Hello World");
		System.out.println(x);
		
		// Arrays.asList() method
		String myStr[] = {"Jiges","Pradeep","Suraj","Abhinay","Kabeer"};
		List<String> str = Arrays.asList(myStr);
		System.out.println(str);
	}
}
