package s30338277;

import java.util.Scanner;

public class Shrestha30338277 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display welcome message
		double cheaphouse = 0; 
		double chosenhouse = 0;
		double medianhouse = 0;
		
		for (int a=1; a<75; a++)
			System.out.print("*");
		System.out.println();
		System.out.println("\n\t\t\t SAVE A HOUSE DEPOSIT CALCULATOR\n");
		System.out.println("Developed by Hijas Shrestha, Student ID: 30338277 for ITECH1000 Sem 1 2017\n");
		for (int a=1; a<75; a++)
			System.out.print("*");
		System.out.println();
		//Display Menu
		int choice;
		Scanner scan = new Scanner(System.in);
		do{
		System.out.println("Please select an option from the menu:");
		System.out.println("1. Enter House Prices");
		System.out.println("2. Enter Avocado on Test Price");
		System.out.println("3. Deposit Calculator");
		System.out.println("4. Exit System");
		choice = scan.nextInt();
		//validate input choice and goto selected choice options.

			switch(choice)
			{
			case 1:
				
				System.out.println("House Details: \n");
				System.out.println("Enter price for cheapest house listing");
				cheaphouse = scan.nextDouble();
				if(cheaphouse < 0)
				{
					System.out.println("Price should be positive. Please re enter the value."); 
					cheaphouse = scan.nextDouble();
				}
				System.out.println("Enter price for chosen house listing");
				chosenhouse = scan.nextDouble();
				if (chosenhouse < 0)
				{
					System.out.println("Price should be positive. Please re enter the value."); 
					chosenhouse = scan.nextDouble();
				}
				System.out.println("Enter price for median house listing");
				medianhouse = scan.nextDouble();
				if (medianhouse < 0)
				{
					System.out.println("Price should be positive. Please re enter the value."); 
					medianhouse = scan.nextDouble();
				}
			default: System.out.println("Invalid choice. Please enter again.\n");	
			}
			
			
		} while (choice!=4);
	scan.close();
	//Shrestha30338277
	}

}