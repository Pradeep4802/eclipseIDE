package com.collection.framework;
import java.util.*;

public class SecondDemoArray {
	public static void main(String[] args) {
		List list = new ArrayList(5);
		list.add(23);
		list.add(67);
		list.add(90);
		list.add("Java");
		list.add(true);
		list.add(9084.838388);
		list.add("Python");
		System.out.println(list);
		list.add(7,89);
		System.out.println(list);
		ArrayList list1 = new ArrayList(list);
		System.out.println(list1);
		
		System.out.println(list1.contains("Java"));
		System.out.println("Last Index of : "+list1.lastIndexOf(90));
		
		ListIterator x = list1.listIterator();
		System.out.println("Next Method: "+x.next());
		while(x.hasNext()) {
			System.out.println(x.next());
		}
//		Object obj[] = {true};
//		if(x.next() == obj) {
//			System.out.println(x.next());
//		}
//		System.out.println(x.next());
		
		AbstractList ls = new ArrayList();
		ls.add(45);
		System.out.println(ls);
		
		ArrayList<Integer> lost = new ArrayList<>();
		lost.add(34);
		lost.add(56);
		lost.add(90);
		lost.add(35);
		lost.add(45);
		System.out.println(lost);
		Collections.sort(lost);
		
		System.out.println(lost);
	}
}
