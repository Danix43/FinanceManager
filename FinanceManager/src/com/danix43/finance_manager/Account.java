package com.danix43.finance_manager;

import java.util.LinkedList;
import java.util.List;

public class Account {
	private final String accountName;
	private double balance;
	private List<Transaction> transactions;

	public Account(String accountName) {
		this.accountName = accountName;
		this.balance = 0.00;
		this.transactions = new LinkedList<>();
		getAccountName();
		getBalance();
	}
	
	public Account(String accountName, double initialBalance) {
		this.accountName = accountName;
		this.balance = initialBalance;
		this.transactions = new LinkedList<>();
		transactions.add(new Transaction(initialBalance, initialBalance, initialBalance, true));
		getAccountName();
		getBalance();
	}
	
	public String getAccountName() {
		return "This account was oppened with the name " + "\"" + this.accountName + "\".";
	}
	
	public String getBalance() {
		return "Current balance is " + this.balance + " RON.";
	}
	
	public boolean depositSum(double amount) {
		if (amount < 0) {
			System.out.println("You can't deposit a negative sum!");
			return false;
		}
		double balanceBefore = this.balance += amount;
		transactions.add(new Transaction(balanceBefore, this.balance, amount, true));
		System.out.println("You've added " + amount + "RON to your account.");
		System.out.println("The new balance is " + this.balance + "RON.");
		return true;
	}
	
	public boolean withdrawSum(double amount) {
		if (amount < 0) {
			System.out.println("You can't withdraw a negative sum!");
			return false;
		}
		if (amount > this.balance) {
			System.out.println("You don't have enough money to withdraw that much!");
			return false;
		}
		double balanceBefore = this.balance -= amount;
		transactions.add(new Transaction(balanceBefore, this.balance, amount, false));
		System.out.println("You've withdraw " + amount + "RON from your account.");
		System.out.println("The new balance is " + this.balance + "RON.");
		return true;
	}
	
	public void listTransactions() {
		for (Transaction t : transactions) {
			System.out.println(t.toString());
		}
	}
		
}
