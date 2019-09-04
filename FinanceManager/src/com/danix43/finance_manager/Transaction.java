package com.danix43.finance_manager;

public class Transaction {
	private double balanceBeforeChange;
	private double balanceAfterChange;
	private double amount;
	private boolean isIncrement;

	public Transaction(double balanceBeforeChange, double balanceAfterChange, double amount, boolean isIncrement) {
		this.balanceBeforeChange = balanceBeforeChange;
		this.balanceAfterChange = balanceAfterChange;
		this.amount = amount;
		this.isIncrement = isIncrement;
	}
	
	@Override
	public String toString() {
		String wasIncrement;
		if (isIncrement) {
			wasIncrement = " was an increment";
		} else {
			wasIncrement = " was an decrement";
		}
		return "Balance before the change: " + this.balanceBeforeChange + "RON\n" +
				"Balance after the change: " + this.balanceAfterChange + "RON\n" +
				"The amount was " + this.amount + "RON\n" + 
				"This transaction" + wasIncrement + "\n";
	
	}
}
