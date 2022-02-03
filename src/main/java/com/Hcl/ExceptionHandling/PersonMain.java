package com.Hcl.ExceptionHandling;

import java.util.Scanner;

public class PersonMain {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Full Name (first middle last): ");

		String name = s.nextLine();

		try {
			Person p = new Person(name);

			System.out.println("Person created with...");
			System.out.println("First name: " + p.getFirstName());
			System.out.println("Middle name: " + p.getMiddleName());
			System.out.println("Last name: " + p.getLastName());

		} catch (IllegalNameLengthException e) {
			e.printStackTrace();
		}

	}

}
