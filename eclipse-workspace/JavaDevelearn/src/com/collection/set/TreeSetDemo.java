package com.collection.set;

import java.util.*;

public class TreeSetDemo {
	
	public void treeDemo() {
		TreeSet tree = new TreeSet();
		
		tree.add("Java");
		tree.add("Aba");
		tree.add("Python");
		tree.add("GABA");
		tree.add("Natural");
		tree.add("Mayuresh");
		
		
		TreeSet tr1 = new TreeSet();
		tr1.add("Paul");
		tr1.add("Kiran");
		tr1.add("Pradeep");
		
		TreeSet<Integer> tr2 = new TreeSet();
		
		tr2.add(1200);
		tr2.add(45);
		tr2.add(87);
		tr2.add(13000);
		tr2.add(45767);
		
		
		Iterator it = tree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------------------------");
		for (Object string : tree) {
			System.out.println(string);
		}
		System.out.println("----------------------------");
		
		System.out.println(tree.pollFirst());
		System.out.println("-----------------------------");
		System.out.println(tree);
		
		System.out.println("=------------================");
		System.out.println("floor: "+tr2.floor(1300));
		System.out.println("=------------================");
		System.out.println("Ceiling is: "+tr2.ceiling(90));
		System.out.println("=------------================");
		System.out.println("Contains is: "+tr2.contains(87));
		System.out.println("=------------================");
		System.out.println("Lower is: "+tr2.lower(87));
		
		SortedSet<Integer> sor = tr2.headSet(15000);
		SortedSet<Integer> newsor = sor.tailSet(1300);
		System.out.println("---------------------------");
		System.out.println(newsor);
	}
	
	public static void main(String[] args) {
		TreeSetDemo tsd = new TreeSetDemo();
		tsd.treeDemo();
	}
}
