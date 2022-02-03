package com.Hcl.ExceptionHandling;

public class IllegalNameLengthException extends Exception {
	public IllegalNameLengthException() {
		System.out.println("User's name length needs to be between 10 and 15 characters!");
	}
	
	public String toString() {
		return "IllegalNameLengthException Object : Name length is too short or too longs";
	}

}
