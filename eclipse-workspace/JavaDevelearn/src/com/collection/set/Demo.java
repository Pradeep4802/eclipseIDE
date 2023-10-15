package com.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Demo {

	void firstExample() {
		LinkedList<Student> al= new LinkedList<>();
		al.add(new Student(101,"Suraj","s@gmail.com","888888"));
		al.add(new Student(103,"Esha","e@gmail.com","912388"));
		al.add(new Student(104,"Kala","k@gmail.com","66662388"));
		al.add(new Student(102,"BALA","b@gmail.com","7777388"));
		for(Student s:al)
			System.out.println(s);
		System.out.println("===============");
		Collections.sort(al);
		for(Student s:al)
			System.out.println(s);
	}

	void secondExample() {
		TreeSet<Student> al= new TreeSet<>();
		al.add(new Student(101,"Suraj","s@gmail.com","888888"));
		al.add(new Student(103,"Esha","e@gmail.com","912388"));
		al.add(new Student(104,"Kala","k@gmail.com","66662388"));
		al.add(new Student(102,"BALA","b@gmail.com","7777388"));
		for(Student s:al)
			System.out.println(s);
		System.out.println("===============");
		for(Student s:al)
			System.out.println(s);
	}


	void Examplthird() {
		ArrayList<Teacher> al= new ArrayList<>();
		al.add(new Teacher(101,"Suraj","s@gmail.com","888888"));
		al.add(new Teacher(103,"Esha","e@gmail.com","912388"));
		al.add(new Teacher(104,"Kala","k@gmail.com","66662388"));
		al.add(new Teacher(102,"BALA","b@gmail.com","7777388"));
		for(Teacher s:al)
			System.out.println(s);
		System.out.println("===============");
		Collections.sort(al,new TeacherSortByID());
		for(Teacher s:al)
			System.out.println(s);
	}

	void ExamplFourth() {
		ArrayList<Teacher> al= new ArrayList<>();
		al.add(new Teacher(101,"Suraj","s@gmail.com","888888"));
		al.add(new Teacher(103,"Esha","e@gmail.com","912388"));
		al.add(new Teacher(104,"Kala","k@gmail.com","66662388"));
		al.add(new Teacher(102,"BALA","b@gmail.com","7777388"));
		for(Teacher s:al)
			System.out.println(s);
		System.out.println("===============");
		Collections.sort(al,new TeacherSortByName());
		for(Teacher s:al)
			System.out.println(s);
	}

	void ExamplFifth() {
		ArrayList<Teacher> al= new ArrayList<>();
		al.add(new Teacher(101,"Suraj","s@gmail.com","888888"));
		al.add(new Teacher(103,"Esha","e@gmail.com","912388"));
		al.add(new Teacher(104,"Kala","k@gmail.com","66662388"));
		al.add(new Teacher(102,"BALA","b@gmail.com","7777388"));
		for(Teacher s:al)
			System.out.println(s);
		System.out.println("===============");
		Collections.sort(al,new Comparator<Teacher>() {
			public int compare(Teacher o1, Teacher o2) {

				return o1.getEmail().compareTo(o2.getEmail());
			}
		});
		for(Teacher s:al)
			System.out.println(s);
	}

	void ExampleSix() {
		ArrayList<Teacher> al= new ArrayList<>();
		al.add(new Teacher(101,"Suraj","s@gmail.com","888888"));
		al.add(new Teacher(103,"Esha","e@gmail.com","912388"));
		al.add(new Teacher(104,"Kala","k@gmail.com","66662388"));
		al.add(new Teacher(102,"BALA","b@gmail.com","7777388"));
		for(Teacher s:al)
			System.out.println(s);
		System.out.println("===============");

		Collections.sort(al,new Comparator<Teacher>() {

			@Override
			public int compare(Teacher o1, Teacher o2) {
				// TODO Auto-generated method stub
				return o1.getContact().compareTo(o2.getContact());
			}
		});
		for(Teacher s:al)
			System.out.println(s);
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		//d.firstExample();
		System.out.println("==========================");
		//d.secondExample();
		d.Examplthird();
		System.out.println("==========================");
		d.ExamplFourth();
		System.out.println("==========================");
		d.ExamplFifth();
		System.out.println("==========================");
		d.ExampleSix();
	}

}