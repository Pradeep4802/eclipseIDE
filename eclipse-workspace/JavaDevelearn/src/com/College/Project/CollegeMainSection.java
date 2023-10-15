package com.College.Project;
import java.util.*;


public class CollegeMainSection {
	static CollegeMainSection cms = new CollegeMainSection();
	static CollegeRegister cr = new CollegeRegister();
	static CollegeCourses cc = new CollegeCourses();
	static CollegeAboutUs cau;
	//	static College
	static Scanner sc = new Scanner(System.in);

	// All the VARIABLES
	static int innerAboutUsChoice = 0;

	public void starterPrompt() {
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println("<>                                                                        <>");
		System.out.println("<>               Parle Tilak Vidyala Association's                        <>");
		System.out.println("<>               MULUND COLLEGE OF COMMERCE (AUTONOMOUS)                  <>");
		System.out.println("<>               NAAC 'A' GRADE RE-ACCREDITED (III Cycle) 2016-2026       <>");
		System.out.println("<>                                                                        <>");
		System.out.println("<>               1. About Us                                              <>");
		System.out.println("<>               2. Register                                              <>");
		System.out.println("<>               3. Login                                                 <>");
		System.out.println("<>               4. Courses                                               <>");
		System.out.println("<>               5. Syllabus                                              <>");
		System.out.println("<>               6. Games                                                 <>");
		System.out.println("<>               7. Assignment                                            <>");
		System.out.println("<>               8. Examination                                           <>");
		System.out.println("<>               9. Result						  <>");
		System.out.println("<>              10. Library 						  <>");
		System.out.println("<>              11. Notice 		                                  <>");
		System.out.println("<>              12. News 	     	  				  <>");
		System.out.println("<>              13. Events 	    					  <>");
		System.out.println("<>              14. Chats 	    					  <>");
		System.out.println("<>                                                                        <>");
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
	}

	public void aboutUsCase() {
		// About Us of College
		cau = new CollegeAboutUs("Dr. Sonali Pednekar","Mr. Vinay Jog","The aim of education is the knowledge, not of facts, but of values.");
		System.out.println();
		do {
			System.out.println();
			System.out.println("--------------------==> YOU ARE IN ABOUT US <==---------------------");
			System.out.println();
			System.out.println("Enter 1. Princle Name | 2. Vice-Principle | 3. College Information");
			System.out.println("      4. Code Of Conduct | 5. Milestone | 6. Exit");
			System.out.println();
			System.out.println("--------------------------------------------------------------------");
			System.out.println();
			System.out.println("-------------------==> Select The Option <==------------------------");
			innerAboutUsChoice = sc.nextInt();
			System.out.println();

			switch(innerAboutUsChoice) {
			case 1:
				System.out.println();
				System.out.println("Principle Name: "+cau.getPrinciple());
				System.out.println();
				break;

			case 2:
				System.out.println();
				System.out.println("Vice-Principle Name: "+cau.getVicePresident());
				System.out.println();
				break;

			case 3:
				System.out.println();
				System.out.println(cau.collegeInfo());
				System.out.println();
				break;

			case 4:
				System.out.println();
				System.out.println(cau.codeOfConduct());;
				System.out.println();
				break;

			case 5:
				System.out.println();
				System.out.println(cau.mileStone());;
				System.out.println();
				break;

			case 6:
				System.out.println();
				System.out.println("----------------------==> Exit From ABOUT US<==---------------------");
				break;

			default:
				System.out.println();
				System.out.println("----------------==> Please Enter Correct Choice <==-------------");
			}
		}while(innerAboutUsChoice != 6);
	}

	//	public void loginSection() {
	//		
	//	}

	public static void main(String[] args) {
		cms.starterPrompt();  // Starting the page.

		// select Any Option
		do {
			System.out.println();
			System.out.println("                 -----------------                   ");
			System.out.println("-----------------Select Any Option-------------------");
			System.out.println("                 -----------------                   ");
			int outerChoice = sc.nextInt();
			System.out.println();

			switch(outerChoice) {
			case 1:
				// About US Section
				cms.aboutUsCase();
				break;

			case 2:
				// Registration like : Student and Teacher

				cr.askRegisterType();
				break;

			case 3:
				// Login For Student and Teacher
				cr.loginStudent();				
				break;
				
			case 4:
				// Courses For Student
				cc.collegeList();				
				break;
			}

			cms.starterPrompt();
		}while(true);

	}
}
