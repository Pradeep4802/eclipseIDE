package com.Edtech.project;
import java.util.Scanner;

public class AdminManage {
	static MainUser mu[] = new MainUser[5];
	static AdminManage am = new AdminManage();
	static Admin ad = new Admin();
	static Courses cr = new Courses();
	static Scanner sc = new Scanner(System.in);
	public int count = 0;
	public static int amount = 0;
	public static String confirmPayment;

	public void courseFunc() {
		System.out.println();
		System.out.println("### This is the list of courses ###");
		System.out.println();
		System.out.println("#1. Core Java + Advanced");
		System.out.println("#2. DSA with C++");
		System.out.println("#3. Data Science and ML with Python");
		System.out.println("#4. Data Analytics");
		System.out.println("#5. DevOps");
		System.out.println();
		System.out.println("#-------------------Enter the choice--------------------#");
		System.out.println();
		int courseChoice = sc.nextInt();

		switch(courseChoice) {
		case 1:
			int price1 = new Courses("Java").getCourse1();
			am.paymentOption(price1);
			break;
		case 2:
			int price2 = new Courses("DSA").getCourse2();
			am.paymentOption(price2);
			break;
		case 3:
			int price3 = new Courses("DataSci").getCourse3();
			am.paymentOption(price3);
			break;
		case 4:
			int price4 = new Courses("DataAnaly").getCourse4();
			am.paymentOption(price4);
			break;
		case 5:
			int price5= new Courses("DevOps").getCourse5();
			am.paymentOption(price5);
			break;
		default:
			System.out.println();
			System.out.println("#-----------------------------Please Enter rigth case--------------------");
			System.out.println();
			break;
		}
	}

	public void registerUser() {
		String username,name,email,password;
		System.out.println();
		System.out.println("#---------------------------SIGN UP---------------------------#");
		System.out.println("#---Enter Username, name, email, password---#");
		username = sc.next();
		name = sc.next();
		email = sc.next();
		password = sc.next();
		mu[count++] = new MainUser(username,name,email,password);
		System.out.println("#-------------------Registered Successfully-------------------#");

	}

	public void paymentOption(int price) {
		System.out.println();
		System.out.println("#----------------------Pay the fees----------------------#");
		System.out.println("#--------------Payment through UPI interface-------------#");
		System.out.println("#---Payment Option are: 1.paytm  2.gpay  3.phonepe ---- *#");
		System.out.println("#----------------Select The option-----------------------#");
		int paymentOption = sc.nextInt();
		switch(paymentOption) {
		case 1:
			System.out.println();
			System.out.println("#-----------------Paytm--------------------#");
			System.out.println();
			System.out.println("#----------------Enter the amount---------------#");
			amount = sc.nextInt();
			if(price == amount) {
				confirmPayment = "successful";
				System.out.println();
				System.out.println("Yeah hurre !!! You successfully register your course");
				System.out.println();
				System.out.println("Transaction Id: "+(int)(Math.floor(Math.random()*1000000000)));
				System.out.println();
			}
			else {
				System.out.println();
				System.out.println("Oh sit!! Your payment was unsuccessfull");
				System.out.println();
			}
			break;

		case 2:
			System.out.println();
			System.out.println("#-----------------GPay--------------------#");
			System.out.println();
			System.out.println("#----------------Enter the amount---------------#");
			amount = sc.nextInt();
			if(price == amount) {
				confirmPayment = "successful";
				System.out.println();
				System.out.println("Yeah hurre !!! You successfully register your course");
				System.out.println();
				System.out.println("Transaction Id: "+(int)(Math.floor(Math.random()*1000000000)));
				System.out.println();
			}
			else {
				System.out.println();
				System.out.println("Oh sit!! Your payment was unsuccessfull");
				System.out.println();
			}
			break;

		case 3:
			System.out.println();
			System.out.println("#-----------------Phonepe--------------------#");
			System.out.println();
			System.out.println("#----------------Enter the amount---------------#");
			amount = sc.nextInt();
			if(price == amount) {
				confirmPayment = "successful";
				System.out.println();
				System.out.println("Yeah hurre !!! You successfully register your course");
				System.out.println();
				System.out.println("Transaction Id: "+(int)(Math.floor(Math.random()*1000000000)));
				System.out.println();
			}
			else {
				System.out.println();
				System.out.println("Oh sit!! Your payment was unsuccessfull");
				System.out.println();
			}
			break;

		default:
			System.out.println();
			System.out.println("-----------------Please enter correct option-----------------");
			System.out.println();
			break;
		}
	}

	public static void main(String args[]) {
		int outerChoice = 0;
		int loginChoice = 0;
		int userLoginChoice = 0;

		do {
			System.out.println();
			System.out.println("#------------------------- 1) Sign Up --------------------------#");
			System.out.println("#------------------------- 2) Sign In --------------------------#");
			System.out.println("#--------------------------3) EXIT -----------------------------#");
			System.out.println();

			outerChoice = sc.nextInt();

			switch(outerChoice) {
			case 1:
				am.registerUser();
				break;

			case 2:
				System.out.println();
				System.out.println("#Login-----------------------------LOGIN PAGE-------------------------------Login#");
				System.out.println();

				// Enter the username to verify the user
				System.out.println();
				System.out.println("------------------------>> ENTER USERNAME  <<-------------------------------");
				String userName = sc.next();
				System.out.println();

				// Enter the password to verify the user
				System.out.println();
				System.out.println("------------------------>> ENTER ACCOUNT PASSWORD  <<-----------------------------");
				String password = sc.next();
				System.out.println();
				for(MainUser m : mu) {
					if((m != null) || userName.equals(ad.getAdminUsername())) {
						if((userName.equals(ad.getAdminUsername())) && (password.equals(ad.getAdminPassword()))) {
							System.out.println();
							System.out.println("#-------------------->> Login Successfully <<------------------------");
							System.out.println();

							do {
								System.out.println();
								System.out.println("################################################################################");
								System.out.println("#                                                                              #");
								System.out.println("#                          1) Courses                                          #");
								System.out.println("#                          2) Tutorial                                         #");
								System.out.println("#                          3) Article                                          #");
								System.out.println("#                          4) MCQ                                              #");
								System.out.println("#                          5) Admin Profile                                    #");
								System.out.println("#                          6) List of all User                                 #");
								System.out.println("#                          7) User Search By Username                          #");
								System.out.println("#                          8) Delete User                                      #");
								System.out.println("#                          9) EXIT                                             #");
								System.out.println("#                                                                              #");
								System.out.println("################################################################################");
								System.out.println();

								// Taking input for switch case for showing list of function for user
								System.out.println();
								System.out.println("################################################################################");
								System.out.println("#                   -->     ENTER OPTION    <--                                #");
								System.out.println("################################################################################");
								System.out.println();

								loginChoice = sc.nextInt();

								switch(loginChoice) {
								case 1:
									// Courses
									System.out.println();
									System.out.println("There are 5 courses : ");
									System.out.println("1) Java");
									System.out.println("2) DSA");
									System.out.println("3) Data Science");
									System.out.println("4) Data Analytics");
									System.out.println("5) DevOps");
									System.out.println();
									am.courseFunc();
									if(confirmPayment.equals("successful")) {
										if(cr.getCourseName(3500).equals("java"))
											m.setPayment("java");
										else if(cr.getCourseName(4500).equals("DSA"))
											m.setPayment("DSA");
										else if(cr.getCourseName(5500).equals("DataSci"))
											m.setPayment("DataSci");
										else if(cr.getCourseName(4300).equals("DataAnaly"))
											m.setPayment("DataAnaly");
										else if(cr.getCourseName(9500).equals("DevOps"))
											m.setPayment("DevOps");
									}
									break;

								case 2:
									// Tutorials
									break;

								case 3:
									// Articles
									break;

								case 4:
									// MCQ
									break;

								case 5:
									// Admin Profile
									break;

								case 6:
									// List of all User
									break;

								case 7:
									// User Search by Username
									break;

								case 8:
									// Delete User
									break;

								case 9:
									// Exit
									break;

								default:
									System.out.println();
									System.out.println("#----------------------------------Please enter correct options-----------------------------------#");
									System.out.println();
									break;
								}
							} while(loginChoice != 9);
						}
						else if(userName.equals(m.getUsername()) && password.equals(m.getPassword())) {
							// Login By User
							do {
								System.out.println();
								System.out.println("################################################################################");
								System.out.println("#                                                                              #");
								System.out.println("#                          1) Courses                                          #");
								System.out.println("#                          2) Tutorial                                         #");
								System.out.println("#                          3) Article                                          #");
								System.out.println("#                          4) MCQ                                              #");
								System.out.println("#                          5) Admin Profile                                    #");
								System.out.println("#                          6) EXIT                                             #");
								System.out.println("#                                                                              #");
								System.out.println("################################################################################");
								System.out.println();

								// Taking input for switch case for showing list of function for user
								System.out.println();
								System.out.println("################################################################################");
								System.out.println("#                   -->     ENTER OPTION    <--                                #");
								System.out.println("################################################################################");
								System.out.println();

								userLoginChoice = sc.nextInt();

								switch(userLoginChoice) {
								case 1:
									// Courses
									System.out.println();
									System.out.println("There are 5 courses : ");
									System.out.println("1) Java");
									System.out.println("2) DSA");
									System.out.println("3) Data Science");
									System.out.println("4) Data Analytics");
									System.out.println("5) DevOps");
									System.out.println();
									am.courseFunc();
									if(confirmPayment.equals("successful")) {
										if(cr.getCourseName(3500).equals("java"))
											m.setPayment("java");
										else if(cr.getCourseName(4500).equals("DSA"))
											m.setPayment("DSA");
										else if(cr.getCourseName(5500).equals("DataSci"))
											m.setPayment("DataSci");
										else if(cr.getCourseName(4300).equals("DataAnaly"))
											m.setPayment("DataAnaly");
										else if(cr.getCourseName(9500).equals("DevOps"))
											m.setPayment("DevOps");
									}
									System.out.println();
									System.out.println("User can Access the course: ");
									System.out.println(m.getPayment());
									System.out.println();
									break;

								case 2:
									// Tutorials
									break;

								case 3:
									// Articles
									break;

								case 4:
									// MCQ
									break;

								case 5:
									// Admin Profile
									break;

								case 6:
									// Exit
									break;

								default:
									System.out.println();
									System.out.println("#----------------------------------Please enter correct options-----------------------------------#");
									System.out.println();
									break;
								}
							}while(userLoginChoice != 6);
						}
					}
				}
				break;
			}
		}while(outerChoice != 3);

	}
}
