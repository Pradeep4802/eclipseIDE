package com.inheritance;

public class ExtendsObjectPract extends Object{
	String name;
	
	public ExtendsObjectPract(String name) {
		this.name = name;
	}

	public boolean equals(Object o) {
		if(name==o) {
			return true;
		}else {
			return false;
		}
	}
	
	public int hashCode() {
		return 12;
	}

	public static void main(String[] args) {
		ExtendsObjectPract eop = new ExtendsObjectPract("Abhinay");
		String str = "Abhinay";
		String s = new String("Abhinay");
		System.out.println(s.equals(s));
		System.out.println("Hashcode of str : "+eop.hashCode());
	}
}
