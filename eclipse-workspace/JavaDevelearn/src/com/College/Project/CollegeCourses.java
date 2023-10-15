package com.College.Project;
import java.util.*;

public class CollegeCourses {
	Scanner sc = new Scanner(System.in);
	public void collegeList() {
		int choice = 0;
		do {
			System.out.println();
			System.out.println("                   -----------------------                     ");
			System.out.println("-----------------------List Of Courses-------------------------");
			System.out.println("                   -----------------------                     ");
			System.out.println("                   1) Science");
			System.out.println("                   2) Commerce");
			System.out.println("                   3) Arts");
			System.out.println("                   4) Exit");
			System.out.println("---------------------------------------------------------------");
			System.out.println();
			System.out.println("-------------------==> Select The Option <==------------------------");
			choice = sc.nextInt();
			System.out.println();

			switch(choice) {
			case 1:
				// Science Section
				System.out.println();
				System.out.println("-----------------==> You selected Science <==-----------------");
				System.out.println();
				System.out.println("------==> List of Courses of Science Section...");
				System.out.println();
				System.out.println("       ➊ Bachelor of Science (B.Sc.)");
				System.out.println("       ➋ Bachelor of Biology");
				System.out.println("       ➌ Bachelor of Chemistry");
				System.out.println("       ➍ Bachelor of Physics");
				System.out.println("       ➎ Bachelor of MAthematics");
				System.out.println();
				System.out.println("--------------------------------------------------------------");
				System.out.println();
				break;

			case 2:
				// Commerce section
				System.out.println();
				System.out.println("-----------------==> You selected Commerce <==-----------------");
				System.out.println();
				System.out.println("------==> List of Courses of Commerce Section...");
				System.out.println();
				System.out.println("       ➊ Bachelor of Commerce (B.Com):");
				System.out.println("       ➋ Bachelor of Business Administration (BBA)");
				System.out.println("       ➌ Bachelor of Economics");
				System.out.println("       ➍ Bachelor of Accounting");
				System.out.println("       ➎ Bachelor of Finance");
				System.out.println();
				System.out.println("--------------------------------------------------------------");
				System.out.println();
				break;

			case 3:
				// Arts Section
				System.out.println();
				System.out.println("-----------------==> You selected Arts <==-----------------");
				System.out.println();
				System.out.println("------==> List of Courses of Arts Section...");
				System.out.println();
				System.out.println("       ➊ Bachelor of Arts (B.A.) in English Literature");
				System.out.println("       ➋ Bachelor of Arts (B.A.) in History");
				System.out.println("       ➌ Bachelor of Arts (B.A.) in Philosophy");
				System.out.println("       ➍ Bachelor of Arts (B.A.) in Psychology");
				System.out.println("       ➎ Bachelor of Arts (B.A.) in Sociology");
				System.out.println();
				System.out.println("--------------------------------------------------------------");
				System.out.println();
				break;
			}
		}while(choice != 4);
	}
}
