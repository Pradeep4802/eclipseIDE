package com.collection.framework;
import java.util.*;

public class ArraylistDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Java");
		al.add(45.09f);
		al.add(23.44);
		al.add(92472884);
		al.add(true);
		al.add(new String("Pradeep"));
		al.add(new StringBuffer("Ronaldo"));
		System.out.println(al.toString());
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Object l : al) {
			System.out.println(l);
		}
	}

	private static void forEach(ArrayList al) {
		// TODO Auto-generated method stub
		
	}
}
