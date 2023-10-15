package com.Suraj.KFC;

import java.util.Scanner;
public class Order_Details {
	// declaring the variable of food items

	int  frenfries = 100;
	int burger  = 200;
	int pastry = 99;
	int pizaa = 126;
	int coldDrink = 50 ;
	int coldCoffes = 56 ;
	int icecream = 25 ;
	int key;
	int quantity;
	int total;
	String again;
	String payment;
	String Gpay;
	//String Paytm;

	Scanner sc = new Scanner(System.in);

	// method declare of food items jo maine upar declare kiye  hue hai

	public void displayMenu() {


		System.out.println("*****WELCOME TO OUR KFC RESTAURANT *******");

		System.out.println("===================================================================");

		System.out.println("What u want to order today ");
		// this is menu 
		System.out.println("        1 . Frenchfries   100/-  ");
		System.out.println("        2 . Burger         200/-  ");
		System.out.println("        3 . Pastry         99/-  ");
		System.out.println("        4 . Pizaa          126/-  ");
		System.out.println("        5 . Colddrink      50/-  ");
		System.out.println("        6 . Cold Coffe     56/-  ");
		System.out.println("        7 . ice Cream      25/-  ");
		System.out.println("        8 . Exit                 ");
	}


	// switch case use karunga 

	// method  to generate bill 

	public void generateBill() 
	{
		System.out.println();

		System.out.println("****THANK YOU FOR ORDERING***** ");

		System.out.println("******* VISIT AGAIN ********");

		System.out.println("**** YOUR BILL IS :" + total+  "*****");


	}
	public void order () 
	{
		while (true) {
			System.out.println("Enter your Choice");
			key =sc.nextInt();

			switch (key) {

			case 1:

				System.out.println("you have selected French Fries " );

				System.out.println();

				System.out.println(" Enter the quantity ");

				quantity = sc .nextInt();

				total = total +quantity*frenfries;

				break;


			case 2:

				System.out.println("you have selected burger" );

				System.out.println();

				System.out.println(" Enter the quantity ");

				quantity = sc .nextInt();

				total = total +quantity*burger ;

				break;


			case 3:

				System.out.println("you have selected Pastry  " );

				System.out.println();

				System.out.println(" Enter the quantity ");

				quantity = sc .nextInt();

				total = total +quantity*pastry;

				break;

			case 4:

				System.out.println("you have selected pizaa  " );

				System.out.println();

				System.out.println(" Enter the quantity ");

				quantity = sc .nextInt();

				total = total +quantity*pizaa;

				break;

			case 5:

				System.out.println("you have selected Coldrink " );

				System.out.println();

				System.out.println(" Enter the quantity ");

				quantity = sc .nextInt();

				total = total +quantity*coldDrink;


				break;


			case 6:

				System.out.println("you have selected Coldcoffe " );

				System.out.println();

				System.out.println(" Enter the quantity ");

				quantity = sc .nextInt();

				total = total +quantity*coldCoffes;


				break;

			case 7:

				System.out.println("you have selected Icecream  " );

				System.out.println();

				System.out.println(" Enter the quantity ");

				quantity = sc .nextInt();

				total = total +quantity*icecream;

				break;

				//			case 8 :
				//
				//				Back(1);
				//				break;

			default:

				break;
			}

			System.out.println();

			System.out.println("Do u want to order something else  (Y/N) ");
			again =sc.next();

			if( again.equalsIgnoreCase("Y"))
			{
				order ();


			}

			else if (again.equalsIgnoreCase("N"))
			{

				generateBill();

				System.exit(1);
			}
			else {

				System.out.println("invalid choice ");

			}


		}

	}



	private int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
}
