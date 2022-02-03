package com.Hcl.ExceptionHandling;

public class Person {
	String firstName;
	String middleName;
	String lastName;

	public Person(String name) throws IllegalNameLengthException {

		if (name.trim().length() < 10 || name.trim().length() > 15) {
			throw new IllegalNameLengthException();
		}

		String[] splitString = name.split(" ");

		firstName = splitString[0];
		middleName = splitString[1];
		lastName = splitString[2];

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
