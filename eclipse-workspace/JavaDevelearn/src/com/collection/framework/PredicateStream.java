package com.collection.framework;
import java.util.*;
import java.util.stream.Collectors;
public class PredicateStream {
	public static void main(String[] args) {
		List<Boys> list = new ArrayList<>();
		
		list.add(new Boys("S1", 5));
		list.add(new Boys("S2", 12));
		list.add(new Boys("S3", 19));
		list.add(new Boys("S4", 20));
		list.add(new Boys("S5", 10));
		list.add(new Boys("S6", 22));
		
		System.out.println(list);
		// Using predicate to filter the List
		List<Boys> filtered = list.stream().collect(Collectors.toList());
		System.out.println(filtered);
		
//		Iterator<Boys> it1 = list.listIterator();
//		while(it1.hasNext()) {			
//			System.out.println(it1.next().getAge());
//		}
		
		
//		System.out.println("----------------");
//		List<Boys> filtered = new ArrayList<>();
//		for(Boys student : list) {
//			if(student.getAge() >= 15) {
//				filtered.add(student);
//			}
//		}
//		System.out.println(filtered.getClass());
//		Iterator<Boys> it = filtered.listIterator();
//		while(it.hasNext()) {			
//			System.out.println(it.next().getAge());
//		}
	}
}
