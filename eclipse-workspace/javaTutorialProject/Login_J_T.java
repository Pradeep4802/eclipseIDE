package javaTutorialProject;
import java.util.Scanner;

public class Login_J_T {

	String name, contact, email, username, password;
	Scanner sc = new Scanner(System.in);

	public String adminName = "myAdmin";
	public String adminPassword = "Admin@123";

	Student sarr[] = new Student[10];
	int count = 0;
	int key = 0;
	int choice = 0;



	public void login() {
		JavaCourse jc = new JavaCourse();

		do {
			System.out.println("Enter 1.Register | 2.Login");
			key = sc.nextInt();

			switch (key) {
			case 1:

				System.out.println("Enter your Name, Contact, Email, Username, Password :-");
				name = sc.next();
				contact = sc.next();
				email = sc.next();
				username = sc.next();
				password = sc.next();

				sarr[count] = new Student(name, contact, email, username,password);
				count++;
				System.out.println("You Have Successfully Registered..!");
				System.out.println("-----------------------------------------");

				System.out.println("Your Username: |"+username+"| "+"Password: |"+password+"|"+"ID: "+count);
				System.out.println("-----------------------------------------");
				System.out.println();
				
				System.out.println("*****************************************************************");
				System.out.println();
				System.out.println("                 +------------------------+");
				System.out.println("---------------->| WELCOME TO JAVA COURSE |<----------------");
				System.out.println("                 +------------------------+");
				System.out.println();
				System.out.println("         ===========>| HELLO "+ name.toUpperCase()+" |<============");
				System.out.println();

				jc.javaCourse();

				break;

			case 2:

				do {
					System.out.println("Enter 1.Student | 2.Admin");
					int choice = sc.nextInt();

					switch (choice) {
					case 1:
						
						System.out.println("Enter Your Username and Password:- ");
						String stuName = sc.next();
						String stuPass = sc.next();

							if(stuName.equals(username) && stuPass.equals(password)) {
								System.out.println(name+" You have Successfully Login...!");
								System.out.println("--------------------------------------");
								System.out.println("***************************************************************************");
								System.out.println();
								System.out.println("---------------->| WELCOME TO JAVA COURSE |<----------------");
								System.out.println("         ===========>|| HEllo "+ name.toUpperCase()+"||<============");
								System.out.println();
								
								jc.javaCourse();
							}
							else {
								System.out.println("Please Enter Correct Username and Password.");
							}

						break;

					case 2:

						System.out.println("Enter Admin_name and Password");
						String adName = sc.next();
						String adpass = sc.next();

						if(adName.equals(adminName)  && adpass.equals(adminPassword)) {
							System.out.println("Admin is Successfully Login...!");
							System.out.println("=================================");
							Admin ad = new Admin();
							ad.main();
						}
						else {

							System.out.println("Please enter correct Admin_Name and Password");
						}
						break;

					default:
						System.out.println("Please Enter Valid Choice");
						break;
					}
				}
				while(choice > 0);

				break;

			default:
				System.out.println("Please Enter Valid Choice...!");
				break;
			}	
		}
		while(key > 0);
	}



	public static void main(String[] args) {
		Login_J_T jt = new Login_J_T();
		jt.login();

		
	}

}
