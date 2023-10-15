package com.collection.framework;
import java.util.*;

public class LinkedlistDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(34);
		ll.add(56);
		ll.add("Pradeep");
		ll.add("Pradeep");
		ll.add("Pradeep");
		ll.add("Java");
		System.out.println(ll);
		System.out.println("----------------------");
		ll.addFirst("Java");
		System.out.println(ll);
		System.out.println("----------------------");
		ll.addLast("Python");
		System.out.println(ll);
		System.out.println("----------------------");
		System.out.println(ll.contains(56));
		System.out.println("----------------------");
		System.out.println(ll.get(4));
		System.out.println("----------------------");
		System.out.println(ll.getFirst());
		System.out.println("----------------------");
		System.out.println(ll.getLast());
		System.out.println("----------------------");
		System.out.println(ll.indexOf("Pradeep"));
		ll.add(8948.584594);
		ll.add("PHP");
		System.out.println("----------------------");
		System.out.println(ll);
		System.out.println("----------------------");
		System.out.println(ll.peek());
		System.out.println("----------------------");
		System.out.println(ll.peekLast());
	}
}
