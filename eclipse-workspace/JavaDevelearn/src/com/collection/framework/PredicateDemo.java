package com.collection.framework;

import java.util.*;
import java.util.function.*;

public class PredicateDemo {
	public static void main(String[] args) {
		String str = "abc";
		boolean match = str.equals("def");
		
		List<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(23);
		list.add(90);
		list.add(12);
		list.add(67);
		
		Predicate<Integer> p = (list1) -> list1 == 5;
//		boolean result = p.test(list);
		
//		System.out.println(result);
		
		Object s1[] = {"Pradeep","Pal"};
		Object s2[] = {"Suraj","Verma"};
		Object s3[] = s1;
		
		// String Object
		String string1 = "Ronaldo";
		String string2 = "ronaldo";
		
		System.out.println("Name type is : "+Objects.equals(s1[0], s3[0]));
		System.out.println("Footballer type is : "+Objects.equals(string1.toLowerCase(), string2.toLowerCase()));
		
		System.out.println("Hashcode is : "+Objects.hash(string2));
		System.out.println("2nd hashcode is : "+string2.hashCode());
		
		System.out.println(Objects.toString(string2));
	}
}
