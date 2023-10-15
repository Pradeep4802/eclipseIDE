package com.collection.set;
import java.util.*;
public class LinkedHashSetDemo {
	
	public void linkedDemo() {
		LinkedHashSet listset = new LinkedHashSet();
		
		listset.add("Pradeep");
		listset.add("Manish");
		listset.add("Phulwa");
		listset.add(973723);
		listset.add(8953.9883);
		listset.add(9222772);
		listset.add(9222772);
		listset.add(9222772);
		listset.add(9222772);
		listset.add(true);
		
		Iterator it = listset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------------------");
		System.out.println(listset.isEmpty());
		System.out.println(listset.size());
	}
	
	public static void main(String[] args) {
		LinkedHashSetDemo demo = new LinkedHashSetDemo();
		demo.linkedDemo();
	}
}
