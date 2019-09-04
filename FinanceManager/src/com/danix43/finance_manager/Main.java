package com.danix43.finance_manager;

import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to FinanceManager");
		System.out.println("Made possible by @Danix43");
		System.out.println("This tool helps managining your income and expenses in a simple way");
		System.err.println("Stil in development stage - expect bugs, incomplete or inexistent features and more");
		System.err.println("Always be careful when buying online, use when posible a one-time use bank card");
		
		boolean quit = false;
		int choise;
		while (!quit) {
			System.out.println("Enter your choise");
			choise = scan.nextInt();
			switch (choise) {
				case 0:
					quit = true;
				case 1:
					printOptions();
					break;
				case 2:
					createAccount();
					break;
				case 3:
					
			}
		}
	}	
	
	public static void createAccount() {
	// need to add a check to verifies if an account with the same details is already existent
		System.out.println("You are now creating a new account!");
		System.out.println("Please provide a name for this account ");
		String accountName = scan.nextLine();
		if (accountName.equals(null)) { 
			System.err.println("You need to provide a name for the account");
			return;
		}
		System.out.println("If you have an existing account and have some balance, please introduce the balance now or leave empty for 0");
		String accountBalance = scan.nextLine();
		if (accountBalance.equalsIgnoreCase("")) {
			System.out.println("Balance left empty, considering 0");
			Account newAccount = new Account(accountName);
		} else {
			System.out.println("Balance introduced: " + accountBalance);
			double balance = Double.parseDouble(accountBalance); 
			Account newAccount = new Account(accountName, balance);
		}
	}
	
	public static void printOptions() {
		
	}	

}