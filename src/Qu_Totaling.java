/**
 * 
 * @author Akhilesh
 * 
 * Version 1.0
 * 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Qu_Totaling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in); //identifier to allow user input
		DecimalFormat df2 = new DecimalFormat("####.##"); //identifier to allow round off
		
		
		// variables to store user input
		int cost;
		int quantity;
		int vatRate;
		int choice;
		
		// variables to store totals
		double itemTotal;
		double subTotal;
		double vatTotal;
		double grandTotal;
		
		
		
		do {
			//initialisation
			itemTotal = 0;
			subTotal = 0;
			vatTotal = 0;
			grandTotal = 0;
		
		for(int i = 1; i <= 2; i++ ) {
		do{
		System.out.print("Enter Unit Cost of Item " + i + ": ");
		cost = myInput.nextInt();
		
		if(cost <= 0) { //validating cost
			System.out.println("Invalid Unit Cost of item entered! Please Re-Enter..");
		}
		
		}while(cost <= 0);
		
		
		do {
		System.out.print("Enter Quantity of Item " + i + ": ");
		quantity = myInput.nextInt();
		
		if (quantity <= 0) { //validating quantity
			System.out.println("Invalid quantity of item entered! Please Re-Enter..");
		}
		
		}while(quantity <= 0);
				
		
		do {
			System.out.print("Enter VAT Rate of Item " + i + ": ");
			vatRate = myInput.nextInt();
			
			if (vatRate <= 0) { //validating VAT Rate
				System.out.println("Invalid Vat Rate of item entered! Please Re-Enter..");
			}
			
		}while(vatRate <= 0);
		
		itemTotal = quantity * cost; //calculating cost for one item
		subTotal = subTotal + itemTotal; //calculation of sub Total
		vatTotal = vatTotal + ((itemTotal * vatRate) / 100); //Calculation of Total VAT
		
		System.out.println(); //leaving a line
		
		}
		
		grandTotal = subTotal + vatTotal; //Calculation of Grand Total
		
		//Displaying Result
		System.out.println("******************************************************");
		System.out.println("Sub Total       : " + df2.format(subTotal));
		System.out.println("Add VAT         : " + df2.format(vatTotal));
		System.out.println("The Grand Total : " + df2.format(grandTotal));
		
		
		do {
			//menu to ask user if he/she wants to re-try the program
			System.out.println("Choose 1 to Continue..");
			System.out.println("Choose 2 to Exit...");
			
			choice = myInput.nextInt();
			
			if (choice != 1 && choice != 2) { //validating choice
				System.out.println("Invalid Choice entered! Please Re-enter..");
			}
			
		}while(choice != 1 && choice != 2);
		
		if (choice == 2) {
			System.out.println("You are exiting the program...");
		}
		else {
	
			
		}
		
		}while(choice == 1);
		
		myInput.close();
		
	}

	
	
	
	
	
}
