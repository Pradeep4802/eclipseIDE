package com.collection.set;
import java.util.*;

public class HashSetDemo {
	public void hashSetDemo() {
		Set set = new HashSet();
		set.add("Java");
		set.add("Python");
		set.add("PRADEEP");
		set.add(90.98);
		set.add(true);
		set.add("Manish");
		set.add(907474663);
		set.add("PHP");
		set.add("ROnaldo");
		set.add(new StringBuffer("NINETY"));
		
		System.out.println(set);
		System.out.println("-------------------------");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------");
		for (Object object : set) {
			System.out.println(object);
		}
	}
	
	public void hasGenDemo() {
		Set<String> set = new HashSet();
		set.add("Java");
		set.add("Python");
		set.add("PRADEEP");
//		set.add(90.98);
//		set.add(true);
		set.add("Manish");
//		set.add(907474663);
		set.add("PHP");
		set.add("ROnaldo");
		set.add("ROnaldo");
		set.add("ROnaldo");
//		set.add(new StringBuffer("NINETY"));
		
		System.out.println(set);
		System.out.println("-------------------------");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------");
		for (Object object : set) {
			System.out.println(object);
		}
	}
	
	public static void main(String[] args) {
		HashSetDemo hsd = new HashSetDemo();
//		hsd.hashSetDemo();
		hsd.hasGenDemo();
	}
}
