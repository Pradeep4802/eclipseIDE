package com.collection.framework;
import java.util.*;

public class MethodArralListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(24);
		al.add(67);
		al.add(90.849);
		al.add("Pradeep");
		al.add("Java");
		al.add(true);
		al.add(56);
		
		System.out.println(al);
		System.out.println("Size of the array : "+al.size());
		System.out.println("Fetch element is : "+al.get(1));
		System.out.println("---------------------------------");
		al.remove("Java");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
//		al.removeAll(al);
		System.out.println(al);
		System.out.println("---------------------");
//		al.
	}
}
