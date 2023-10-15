package com.servpack;

public class Student {
	private String Name;
	private String Email;
	private String Password;
	private String Contact;
	private String Dob;
	private String Address;
	public Student(String name, String email, String password, String contact, String dob, String address) {
		super();
		Name = name;
		Email = email;
		Password = password;
		Contact = contact;
		Dob = dob;
		Address = address;
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
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
