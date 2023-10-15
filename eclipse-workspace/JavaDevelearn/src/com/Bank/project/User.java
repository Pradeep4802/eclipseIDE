package com.Bank.project;

public class User {
	private int id;
	private String name;
	private long contact;
	private String email;
	private int account;
	private String password;
	private double balance = 0.0;
	private String accountType;
	private String address;
	
	public User(int id,String name,long contact,String email,int account,String password,String accountType,String address) {
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.account = account;
		this.password = password;
		this.accountType = accountType;
		this.address = address;
	}
	
	public String toString() {
		return "#       --> ID: "+id+"\n#       --> Name: "+name+"\n#       --> Contact: "+contact+"\n#       --> Email: "+email+"\n#       --> Account: "+account+"\n#       --> Password: "+password+"\n#       --> Account Type: "+accountType+"\n#       --> Address: "+address;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance += balance;
	}
	
	public void setWithdraw(double balance) {
		
		this.balance -= balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}
	
	public String getAddress() {
		return address;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
