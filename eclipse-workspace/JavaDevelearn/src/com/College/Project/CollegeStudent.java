package com.College.Project;

public class CollegeStudent {
	
	// Student Variables
		private String studentUsername;
		private String studentPassword;
		private String studentConfirmPassword;
		private String studentContact;
		private String studentEmail;
	
	public CollegeStudent(String studentUsername,String studentPassword,String studentConfirmPassword,String studentContact,String studentEmail) {
		this.studentUsername = studentUsername;
		this.studentPassword = studentPassword;
		this.studentConfirmPassword = studentConfirmPassword;
		this.studentContact = studentContact;
		this.studentEmail = studentEmail;
	}

	public String getStudentUsername() {
		return studentUsername;
	}

	public void setStudentUsername(String studentUsername) {
		this.studentUsername = studentUsername;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public String getStudentConfirmPassword() {
		return studentConfirmPassword;
	}

	public void setStudentConfirmPassword(String studentConfirmPassword) {
		this.studentConfirmPassword = studentConfirmPassword;
	}

	public String getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	public String toString() {
		return "USERNAME : "+studentUsername+"\nPASSWORD : "+studentPassword+"\nCONTACT : "+studentContact+"\nEMAIL : "+studentEmail;
	}
}
