package com.Hcl.ExceptionHandling;

public class InSufficientBalanceException extends Exception {
	
	public InSufficientBalanceException() {
		System.out.println("User does not have sufficient balance!");
	}
	
	public String toString() {
		return "InSufficientBalanceException Object : Balance cannot be less than 0";
	}

}
