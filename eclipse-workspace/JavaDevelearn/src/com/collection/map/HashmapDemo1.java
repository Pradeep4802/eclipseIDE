package com.collection.map;
import java.util.*;
public class HashmapDemo1 {
	
	public void hashMapExample() {
		HashMap<Object,Object> h = new HashMap<>();
		
		h.put(23, 56);
		h.put(22, 50);
		h.put("Java", 90);
		h.put(24, 56);
		h.put(null, 90);
		h.put("Apple", "Fruit");
		h.put("Mango", "Delicious");
		h.put(2.3f, "float");
		
		System.out.println(h);
		System.out.println("Contains key : "+h.containsKey(2.3f));
		
		System.out.println("==============================");
		
		Iterator<Map.Entry<Object, Object>> it = h.entrySet().iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
	}
	
	public static void main(String[] args) {
		HashmapDemo1 hash = new HashmapDemo1();
		hash.hashMapExample();
	}
}
