package com.collection.framework;
import java.util.*;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(45);
		list.add(78);
		list.add(90);
		list.add("Java");
		list.add("Python");
		
		System.out.println(list);
		System.out.println("-----------------------");
		list.offer(67);
		System.out.println(list);
		System.out.println("-----------------------");
		list.offerFirst("Pradeep");
		System.out.println(list);
		System.out.println("-----------------------");
		System.out.println(list.poll());
		System.out.println("-----------------------");
		System.out.println(list);
		System.out.println("-----------------------");
		System.out.println(list.pop());
		list.push("EEEEE");
		System.out.println(list);
		
		AbstractList li = new ArrayList();
		li.add(45);
		li.add(56);
		li.add("Java");
		li.add("Python");
		li.add("PHP");
		li.add(89.099);
		li.add(true);
		
		System.out.println("--------------");
		System.out.println(li);
		
		List listo = li.subList(1,3);
		System.out.println(listo);
		
		li.subList(1,3).clear();
		System.out.println(li);
		
		Iterator it = list.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
