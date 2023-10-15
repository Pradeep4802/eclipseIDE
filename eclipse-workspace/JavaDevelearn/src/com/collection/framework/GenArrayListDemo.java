package com.collection.framework;
import java.util.*;

public class GenArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList();
		al1.add(23);
		al1.add(45);
		al1.add(Integer.parseInt("4"));
		System.out.println(al1);
		al1.add(1,98);
		System.out.println("-------------------");
		System.out.println(al1);
		ArrayList<Integer> al2 = new ArrayList<>();
		System.out.println("-------------------");
		al2.addAll(al1);
		System.out.println(al2);
		ArrayList<Integer> al3 = new ArrayList<>();
		System.out.println("-------------------");
		Object obj = al3.clone();
		Iterator<Integer> ob = al2.iterator();
		while(ob.hasNext()) {
			Integer on1 = ob.next();
			System.out.println(on1);
		}
		System.out.println("Size of the arralist: "+al2.size());
		System.out.println("-------------------");
		for(Object ooo : al2) {
			System.out.println(ooo);
		}
		System.out.println("-------------------");
		System.out.println(al2.get(1));
	}
}
