package javaTutorialProject;
import java.util.Scanner;

class Admin {
	private int id;
	private String name;
	private String contact;
	private String email;


	public String toString() {
		return id+" "+name+" "+contact+" "+email;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getContact() {
		return contact;
	}
	public String getEmail() {
		return email;
	}

	Scanner sc = new Scanner(System.in);
	Student[] sArr = new Student[10];
	Admin[] aArr = new Admin[10];
	int count = 0;


	public void deleteStudent() {

		System.out.println("--------Enter name ID for Delete Student Record--------");
		id = sc.nextInt();
		for(int i=0; i<sArr.length; i++) {
			if(sArr[i] != null  &&  aArr[count].getId() == id) {
				sArr[i] = null;
				System.out.println("--------Student Record Deleted Successfully--------");
			}
		}
	}

	public void getStudentById() {

		System.out.println("Enter ID for Select Student Record: ");
		id = sc.nextInt();
		for(int i=0; i<sArr.length; i++) {
			if(sArr[i] != null && aArr[count].getId() == id) {
				System.out.println(sArr[i]);
			}
		}
	}


	public void main() {

		Admin a = new Admin();
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		System.out.println("Enter (1.Select | 2.Delete) Student");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			a.getStudentById();
			break;

		case 2: 
			a.deleteStudent();
			break;
		default:
			System.out.println("Please Enter Valid choice");
			break;
		}
	}
}

