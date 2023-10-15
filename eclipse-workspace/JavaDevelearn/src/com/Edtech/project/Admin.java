package com.Edtech.project;

public class Admin {
	private String adminUsername = "myadmin";
	private String adminPassword = "admin123";
	private String name = "Pradeepkumar";
	private String email = "Pradeep@gmail.com";
	
	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public String getAdminPassword() {
		return adminPassword;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
}
