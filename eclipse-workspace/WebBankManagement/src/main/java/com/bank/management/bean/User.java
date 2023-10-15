package com.bank.management.bean;

public class User {
	String UserId,Name,Password,Email,Contact,AccountNo,AccountType;
	public User(String id, String name, String password, String email, String contact, String accountNo,
			String accountType) {
		//		super();
		this.UserId = id;
		Name = name;
		Password = password;
		Email = email;
		Contact = contact;
		AccountNo = accountNo;
		AccountType = accountType;
	}
	public User() {

	}
	public String getId() {
		return UserId;
	}
	public void setId(String id) {
		this.UserId = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
}
