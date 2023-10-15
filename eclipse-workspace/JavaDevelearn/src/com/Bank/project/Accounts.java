package com.Bank.project;

public class Accounts {
	static User us[] = new User[5];
	static Banks bk = new Banks();

	static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static int countUser2 = 0;
	
	public void displayFD() {
		
	}
	
	public void fixedDeposit() {
		double rate;
		double intAmount;
		long interestAmount = 0;
		long totalAmount = 0;
		System.out.println();
		System.out.println("########################################################################################");
		System.out.println("#                                                                                      #");
		System.out.println("#1) If you invest 5 LAKH !! for 2 years then you will get 6.75% per year ineterest rate#");
		System.out.println("#2) If you invest 10 LAKH !! for 3 years then you will get 8.55% per year interest rate#");
		System.out.println("#3) If you invest 15 LAKH !! for 5 years then you will get 9.50% per year interest rate#");
		System.out.println("#                                                                                      #");
		System.out.println("########################################################################################");
		System.out.println();
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println("#--------------------------------------------------------------------------------------#");
		System.out.println("#----------------------------Enter The Investment Amount-------------------------------#");
		System.out.println("#--------------------------------------------------------------------------------------#");
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		int amount = sc.nextInt();
		System.out.println();
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println("#--------------------------------------------------------------------------------------#");
		System.out.println("#----------------------------Enter The Years for you want Fixed------------------------#");
		System.out.println("#--------------------------------------------------------------------------------------#");
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		int year = sc.nextInt();
		System.out.println();
		if(amount >= 100000 && amount <= 500000) {
			rate = 6.75;
			double con = rate / 100;
			intAmount = amount * con;
			for(int i=1 ; i <= year; i++) {
				interestAmount += intAmount;
			}
			totalAmount = amount + interestAmount;
		}
		else if(amount >= 500000 && amount <= 1000000) {
			rate = 8.55;
			double con = rate / 100;
			intAmount = amount * con;
			for(int i=1 ; i <= year; i++) {
				interestAmount += intAmount;
			}
			totalAmount = amount + interestAmount;
		}
		else {
			rate = 9.50;
			double con = rate / 100;
			intAmount = amount * con;
			for(int i=1 ; i <= year; i++) {
				interestAmount += intAmount;
			}
			totalAmount = amount + interestAmount;
		}
		System.out.println();
		System.out.println("########################################################################################");
		System.out.println("#--------------------------------------------------------------------------------------#");
		System.out.println("#                            |                        |                                #");
		System.out.println("#                            | Interest Payout Option |                                #");
		System.out.println("#                            |                        |                                #");
		System.out.println("#--------------------------------------------------------------------------------------#");
		System.out.println("#                                       |                                              #");
		System.out.println("#        Investment Amount              |                "+amount+"                              #");
		System.out.println("#                                       |                                              #");
		System.out.println("#---------------------------------------|----------------------------------------------#");
		System.out.println("#                                       |                                              #");
		System.out.println("#        Interest rate                  |                "+rate+"%                              #");
		System.out.println("#                                       |                                              #");
		System.out.println("#---------------------------------------|----------------------------------------------#");
		System.out.println("#                                       |                                              #");
		System.out.println("#        Tenure (in years)              |                "+year+"                              #");
		System.out.println("#                                       |                                              #");
		System.out.println("#---------------------------------------|----------------------------------------------#");
		System.out.println("#                                       |                                              #");
		System.out.println("#        Interest amount                |                "+interestAmount+"                              #");
		System.out.println("#                                       |                                              #");
		System.out.println("#---------------------------------------|----------------------------------------------#");
		System.out.println("#                                       |                                              #");
		System.out.println("#        Maturity value                 |                "+totalAmount+"                              #");
		System.out.println("#                                       |                                              #");
		System.out.println("#--------------------------------------------------------------------------------------#");
		System.out.println("########################################################################################");
		System.out.println();
	}

	// method for registering user
	public void registerUser(String accountType) {
		int id=0,acc;
		String name,email,pass,add;
		long contact;
		System.out.println();
		System.out.println("#********************************************************************************#");
		System.out.println("#Register---------------------REGISTRATION PAGE--------------------------Register#");
		System.out.println("#********************************************************************************#");
		System.out.println();
		System.out.println("----------->> Enter ID, NAME, CONTACT, EMAIL, PASSWORD, ADDRESS  <<---------------");
		System.out.println();
		id = sc.nextInt();
		name = sc.next();
		contact = sc.nextLong();
		email = sc.next();
		pass = sc.next();
		add = sc.next();
		acc = bk.generateAccountUser();

		us[countUser2++] = new User(id,name,contact,email,acc,pass,accountType,add);

		System.out.println();
		System.out.println("=========================>  Account Number: " + acc +"<==========================");
		System.out.println();
		System.out.println("--------------------->>  Account Registered Successfully  <<---------------------");
		System.out.println();
	}

	//method for displaying user details
	public static void userDetail(int id) {
		System.out.println();
		System.out.println("################################################################################");
		System.out.println("#--------------------------------USER DETAILS----------------------------------#");
		for(User u : us) {
			if(u != null) {
				if(u.getId() == id) {
					System.out.println(u);
				}
			}
		}
		System.out.println("#------------------------------------------------------------------------------#");
		System.out.println("################################################################################");
		System.out.println();
	}

	// entry point of the program main() method
	public static void main(String args[]) {

		int innerLoginChoice = 0;
		int fixedChoice = 0;
		int choice = 0;
		String account = null;

		// creating an object of banks class.
		Accounts ats = new Accounts();   

		do {
			// starting point of the program
			System.out.println();
			System.out.println("################################################################################");
			System.out.println("#                                                                              #");
			System.out.println("#----------------------------(   Saving Account   )----------------------------#");
			System.out.println("#---------------------------(   Current Account   )----------------------------#");
			System.out.println("#----------------------------(   Fixed Deposit   )-----------------------------#");
			System.out.println("#--------------------------------(   EXIT   )----------------------------------#");
			System.out.println("#                                                                              #");
			System.out.println("################################################################################");
			System.out.println();
			System.out.println("################################################################################");
			System.out.println("#                                                                              #");
			System.out.println("#------------>>   For Saving Account type : \"\"saving\"\"   <<--------------------#");
			System.out.println("#------------>>   For Current Account type : \"\"current\"\"   <<------------------#");
			System.out.println("#------------>>   For Fixed Deposit type : \"\"FD\"\"   <<---------------------#");
			System.out.println("#                                                                              #");
			System.out.println("################################################################################");
			System.out.println();
			
			System.out.println();
			System.out.println("################################################################################");
			System.out.println("#                   -->     ENTER ACCOUNT TYPE      <--                        #");
			System.out.println("################################################################################");
			System.out.println();

			// To take user input for checking which account type is this.
			account = sc.next();


			do {
				// starting point of the program
				System.out.println();
				System.out.println("################################################################################");
				System.out.println("#                                                                              #");
				System.out.println("#                          1) Register User                                    #");
				System.out.println("#                          2) Login USer                                       #");
				System.out.println("#                          3) EXIT                                             #");
				System.out.println("#                                                                              #");
				System.out.println("################################################################################");
				System.out.println();
				
				// Taking the option for further details
				System.out.println();
				System.out.println("################################################################################");
				System.out.println("#                   -->     ENTER OPTION    <--                                #");
				System.out.println("################################################################################");
				System.out.println();
				
				// taking input from user
				choice = sc.nextInt();

				// switch case was initialized
				switch(choice) {

				case 1:
					// when case 1 was selected for register the user
					ats.registerUser(account);
					break;

				case 2:
					// when case 2 was selected to login  into the bank user account.
					System.out.println();
					System.out.println("#********************************************************************************#");
					System.out.println("#Login-----------------------------LOGIN PAGE-------------------------------Login#");
					System.out.println("#********************************************************************************#");
					System.out.println();

					// Enter the account number to verify the user
					System.out.println();
					System.out.println("------------------------>> ENTER ACCOUNT NUMBER  <<-------------------------------");
					int accNum1 = sc.nextInt();
					System.out.println();



					// Enter the password to verify the user
					System.out.println();
					System.out.println("------------------------>> ENTER ACCOUNT PASSWORD  <<-----------------------------");
					String password = sc.next();
					System.out.println();

					// using enhance for loop for every user verification if the user found then login into that account
					for(User s : us) {

						// if statement to check the any array is not NULL or not.
						if(s != null) {

							// nested if statement for verifying the user that he was entering correct information or not.
							if(s.getAccount() == accNum1 && s.getPassword().equals(password)) {
								System.out.println();
								System.out.println("#-------------------->> Login Successfully <<------------------------");
								System.out.println();

								// using do-while loop to repeat the process until user enter incorrect details.
								if(account.equals("saving") || account.equals("current")) {
									do {

										// entering point after user login successfully
										System.out.println();
										System.out.println("################################################################################");
										System.out.println("#                                                                              #");
										System.out.println("#                          1) Check User Detail                                #");
										System.out.println("#                          2) Check Balance                                    #");
										System.out.println("#                          3) Deposit                                          #");
										System.out.println("#                          4) Withdraw                                         #");
										System.out.println("#                          5) EXIT                                             #");
										System.out.println("#                                                                              #");
										System.out.println("################################################################################");
										System.out.println();

										// Taking input for switch case for showing list of function for user
										System.out.println();
										System.out.println("################################################################################");
										System.out.println("#                   -->     ENTER OPTION    <--                                #");
										System.out.println("################################################################################");
										System.out.println();
										innerLoginChoice = sc.nextInt();

										// inner switch case started
										switch(innerLoginChoice) {

										// case 1 for displaying user details at screen
										case 1:
											userDetail(s.getId());
											break;

											// case 2 for checking the balance of the user
										case 2:
											bk.checkBalance(s.getBalance());
											break;

											// case 3 for deposit the amount into the account
										case 3:
											double amount = bk.depositBal();
											s.setBalance(amount);
											break;

											// case 4 for withdrawing the amount from the account
										case 4:
											double with = bk.withdrawBal();
											if(account.equals("current")) {
												if(with > s.getBalance()) {
													System.out.println();
													System.out.println("#------------------>> Overdraft Facilities was provided <<-----------------#");
												}
												s.setWithdraw(with);
											}
											else if(with <= s.getBalance()) {
												s.setWithdraw(with);
											}
											else {
												System.out.println();
												System.out.println("#------------------------>> Amount is not sufficient <<-------------------------#");
												System.out.println();
											}
											break;

											// case 5 for exiting
										case 5:
											System.out.println();
											System.out.println("#----------------------------------->> Exit <<--------------------------------------#");
											System.out.println();
											break;

											// default for wrong input.
										default: 
											System.out.println();
											System.out.println("#------------------------------>> Enter Correct details <<----------------------------#");
											System.out.println();
											break;
										}	

										// checking for user condition that exiting from the account.
									}while(innerLoginChoice != 5);
								}
								else if(account.equals("FD")) {
									do {
										System.out.println();
										System.out.println("################################################################################");
										System.out.println("#                                                                              #");
										System.out.println("#                          1) Check User Details                               #");
										System.out.println("#                          2) Select Any FD Facilities                         #");
										System.out.println("#                          3) EXIT                                             #");
										System.out.println("#                                                                              #");
										System.out.println("################################################################################");
										System.out.println();
										
										System.out.println();
										System.out.println("################################################################################");
										System.out.println("#                   -->     ENTER OPTION    <--                                #");
										System.out.println("################################################################################");
										System.out.println();
										
										fixedChoice = sc.nextInt();
										
										switch(fixedChoice) {
										case 1:
											userDetail(s.getId());
											break;
											
										case 2:
											ats.fixedDeposit();
											break;
											
										case 3:
											System.out.println();
											System.out.println("#--------------------------->> Exit from FD <<-------------------------------#");
											System.out.println();
											break;
											
										default:
											System.out.println();
											System.out.println("#---------------------->> Please Enter correct Option <<---------------------#");
											System.out.println();
											break;
										}
									} while(fixedChoice!=3);
								}
								break;
							}

						}

						// printing message when credential is wrong that entered by the user
						else {
							System.out.println();
							System.out.println("#------------------------>> Credential is WRONG <<------------------------------#");
							System.out.println("#--------------------------->> LOGIN Again <<-----------------------------------#");	
							System.out.println();
						}

					}
					break;

				case 3:
					System.out.println();
					System.out.println("#---------------------------->> EXIT <<-----------------------------------#");
					System.out.println();
					break;

				default:
					System.out.println();
					System.out.println("#------------------------>> Wrong Option <<-----------------------------#");
					System.out.println();
					break;
				}


			}while(choice != 3);
		} while(account != "EXIT");

	}
}