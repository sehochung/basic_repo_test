package com.Hcl.ExceptionHandling;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StudentMain {
	public static void main(String args[]) throws InterruptedException {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Creating Account object...\n");
		Account a = new Account();
		
		TimeUnit.SECONDS.sleep(2);	
		
		System.out.println("Created one Account object!");
		
		Boolean isRunning = true;
		
		System.out.println("Type d/w/e for deposit, withdraw, or exit program");
		
		while (isRunning) {
			
			
			String dwe = s.nextLine();
			
			if (dwe.toLowerCase().equals("d")) {
				// Deposit prompt
				System.out.println("Enter how much to deposit: ");
				int deposit = s.nextInt();
				
				try {
					a.deposit(deposit);
					System.out.println("Your balance is: " + a.getBalance());
					System.out.println("Type d/w/e for deposit, withdraw, or exit program");
					
				} catch (InSufficientBalanceException e) {

					e.printStackTrace();
				}
				
			}
			
			if (dwe.toLowerCase().equals("w")) {
				// Withdraw prompt
				
				System.out.println("Enter how much to withdraw: ");
				int withdraw = s.nextInt();
				
				try {
					a.withdraw(withdraw);
					System.out.println("Your balance is: " + a.getBalance());
					System.out.println("Type d/w/e for deposit, withdraw, or exit program");
					
				} catch (InSufficientBalanceException e) {

					e.printStackTrace();
				}
				
				
			}
			
			if (dwe.toLowerCase().equals("e")) {
				isRunning = false;
				System.out.println("Quitting program...");
			}
			
		}
		
		
	}
}
