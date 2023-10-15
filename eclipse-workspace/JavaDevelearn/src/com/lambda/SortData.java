package com.lambda;

import java.util.*;

//import com.collection.set.Teacher;

public class SortData {

	// Add all Teacher data from Teacher class.
	public void insertData() {
		List<Teacher> list = new ArrayList<Teacher>();
		list.add(new Teacher(104,"Zafar","zafar@gmail.com"));
		list.add(new Teacher(103,"Jay","jay@gmail.com"));
		list.add(new Teacher(105,"Hiren","hiren@gmail.com"));
		list.add(new Teacher(102,"Vishal","vishal@gmail.com"));
		list.add(new Teacher(101,"jyotika","jyotika@gmail.com"));

		// Sorting by Id 
		System.out.println("--------------Sorting by ID--------------");
		Collections.sort(list,(o1,o2)->{
			return o1.getId()-o2.getId();
		});
		System.out.println();
		print(list);
		System.out.println("------------------------------------------");
		// Sorting by name
		System.out.println("------------Sorting By Name--------------------");
		Collections.sort(list, (o1,o2)->{
			return o1.getName().compareTo(o2.getName());
		});
		print(list);
		System.out.println();
		System.out.println("---------------------------------------------");
		
		// Sorting by Email
		System.out.println("--------------------Sorting by Email----------------------");
		Collections.sort(list,(o1,o2)->{
			return o1.getEmail().compareTo(o2.getEmail());
		});
		System.out.println();
		print(list);
	}

	public void print(List<Teacher> list) {
		Iterator<Teacher> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {
		SortData sd = new SortData();
		sd.insertData();


	}
}
