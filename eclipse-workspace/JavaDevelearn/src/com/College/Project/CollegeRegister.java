package com.College.Project;
import java.util.Scanner;

public class CollegeRegister {
	static Scanner sc = new Scanner(System.in);
	static CollegeRegister cr = new CollegeRegister();
	CollegeStudent cs[] = new CollegeStudent[10];
	
	// variables
	int count = 0;
	private int registerChoice = 0;
	private String stuUsername;
	private String stuPassword;
	int studentChoice;
	
	// Student Variables
	private String studentUsername;
	private String studentPassword;
	private String studentConfirmPassword;
	private String studentContact;
	private String studentEmail;
	
	// Teacher Variables
	private String teacherUsername;
	private String teacherPassword;
	private String teacherConfirmPassword;
	private String teacherContact;
	private String teacherEmail;
	
//	public CollegeRegister() {
//		
//	}
	
	public String getStudentUsername() {
		return studentUsername;
	}

	public String getTeacherUsername() {
		return teacherUsername;
	}

	public void setTeacherUsername(String teacherUsername) {
		this.teacherUsername = teacherUsername;
	}

	public String getTeacherPassword() {
		return teacherPassword;
	}

	public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword = teacherPassword;
	}

	public String getTeacherConfirmPassword() {
		return teacherConfirmPassword;
	}

	public void setTeacherConfirmPassword(String teacherConfirmPassword) {
		this.teacherConfirmPassword = teacherConfirmPassword;
	}

	public String getTeacherContact() {
		return teacherContact;
	}

	public void setTeacherContact(String teacherContact) {
		this.teacherContact = teacherContact;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
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
	
	public void studentInformation() {
		System.out.println();
		System.out.println("----------------------------==> USER DETAILS <==------------------------------");
		System.out.println();
		for(CollegeStudent cStu : cs) {
			if(cStu != null) {
				System.out.println(cStu);
			}
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
	}
	
	public void loginStudent() {
		System.out.println();
		System.out.println("-----------------------==> Student LOGIN <==--------------------------");
		System.out.println();
		System.out.println("---------------------==> Enter the USERNAME <==-----------------------");
		stuUsername = sc.next();
		System.out.println("---------------------==> Enter the PASSWORD <==-----------------------");
		stuPassword = sc.next();
		
		// Student Authentication
		for(CollegeStudent cStu : cs) {
			if(cStu != null) {
				System.out.println(cStu.getStudentUsername()+" "+cStu.getStudentPassword());
				if(stuUsername.equals(cStu.getStudentUsername()) && stuPassword.equals(cStu.getStudentPassword())) {
					System.out.println();
					System.out.println("------------------------==>  YOU HAVE SUCCESSFULLLY LOGGED <==----------------------------");
					System.out.println();
					do {
						System.out.println("Enter 1. Profile Information | 2. Update | 3. Logout");
						studentChoice = sc.nextInt();
						
						switch(studentChoice) {
						case 1:
							// Profile Information
							studentInformation();
							break;
							
						case 2:
							// Update Student Details
							
							break;
						
						case 3:
							// Logout The Student
							System.out.println();
							System.out.println("-------------------------==> LOGOUT <==-----------------------------");
							System.out.println();
							break;
							
						default:
							System.out.println();
							System.out.println("------------------------==> Please Enter Correct Choice <==--------------------");
							System.out.println();
						}
					}while(studentChoice != 3);
				}
				else {
					System.out.println();
					System.out.println("-----------------------==> INCORRECT USERNAME and PASSWORD <==---------------------------");
					System.out.println();
				}
			}
		}
	}
	
	public void loginTeacher() {
		
	}

	public void askRegisterType() {
		String name,pass,confPass,cont,email;
		do {
			System.out.println();
			System.out.println("--------------------==> Which User You Want To Register <==-----------------------");
			System.out.println();
			System.out.println("Enter 1. Student | 2. Teacher | 3. Exit");
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("---------------------------==> Select The Option <==------------------------------");
			System.out.println();
			registerChoice = sc.nextInt();
			
			switch(registerChoice) {
			case 1:
				// Register As Student
				System.out.println();
				System.out.println("-------------------==> Student Registration <==--------------------");
				System.out.println("Enter UserName | Password | Confirm Password | Contact | Email");
				name = sc.next();
				pass = sc.next();
				confPass = sc.next();
				cont = sc.next();
				email = sc.next();
				System.out.println();
				setStudentUsername(name);
				setStudentPassword(pass);
				setStudentConfirmPassword(confPass);
				setStudentContact(cont);
				setStudentEmail(email);
//				cs[count++] = new CollegeStudent(cr.getStudentUsername(), cr.getStudentPassword(), cr.getStudentConfirmPassword(), cr.getStudentContact(), cr.getStudentEmail());
				cs[count++] = new CollegeStudent(name, pass, confPass, cont, email);
				
				break;
				
			case 2:
				System.out.println();
				System.out.println("-------------------==> Teacher Registration <==--------------------");
				System.out.println("Enter UserName | Password | Confirm Password | Contact | Email");
				name = sc.next();
				pass = sc.next();
				confPass = sc.next();
				cont = sc.next();
				email = sc.next();
				System.out.println();
				setTeacherUsername(name);
				setTeacherPassword(pass);
				setTeacherConfirmPassword(confPass);
				setTeacherContact(cont);
				setTeacherEmail(email);
				// Register As Teacher
				break;
				
			case 3:
				System.out.println();
				System.out.println("-------------------------------==> EXIT <==-----------------------------------");
				System.out.println();
				break;
				
			default:
				System.out.println();
				System.out.println("-----------------==> PLease Enter the Correct Choice <==----------------------");
				System.out.println();
			}
		}while(registerChoice != 3);
	}
}
