package com.Hcl.ExceptionHandling;

public class Account {
	
	protected int balance;
	
	public Account() { 
		this.balance = 0;
	}
	
	protected int deposit(int amt) throws InSufficientBalanceException {
		if (amt < 0)
			return -1;
		
		balance += amt;
		
		if (balance < 0) {
			throw new InSufficientBalanceException();
		}
		
		return balance;
	}
	
	protected int withdraw(int amt) throws InSufficientBalanceException {
		if (amt < 0) 
			return -1;
		
		balance -= amt;
		
		if (balance < 0) {
			throw new InSufficientBalanceException();
		}
		
		return balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
	
	

}
