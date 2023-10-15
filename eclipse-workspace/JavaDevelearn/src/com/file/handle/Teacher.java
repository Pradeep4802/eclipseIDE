package com.file.handle;

import java.io.Serializable;

public class Teacher implements Serializable{
	private int id;
	private String name;
	private String email;
	private String contact;
	transient private String password;

	public Teacher(int id, String name, String email, String contact, String password) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.password = password;
	}

	public String toString() {
		return id+"   "+name+"   "+email+"   "+contact+"   "+password;
	}
}
