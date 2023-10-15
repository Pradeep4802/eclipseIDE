package javaTutorialProject;

public class Student {

	private String name, contact, email, username ,password;
	
	public Student(String name, String contact, String email, String username,String password) {
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	
	public String toString() {
		return name+" "+contact+" "+email+" "+username+" "+password;
	}
}
