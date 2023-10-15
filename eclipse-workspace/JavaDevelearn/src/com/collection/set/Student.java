package com.collection.set;


public class Student implements Comparable<Student>{
	private int id;
	private String Name;
	private String Email;
	private String Contact;

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public Student(int id,String Name,String Email,String contact) {
		this.id = id;
		this.Name = Name;
		this.Email = Email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String toString() {
		return "Id : "+id+"\nName : "+Name+"\nEmail : "+Email;
	}

	@Override
	public int compareTo(Student arg) {
		return Email.compareTo(arg.Email);
	}
}
