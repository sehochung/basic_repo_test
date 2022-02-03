package com.Hcl.ExceptionHandling;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTest {

	public static StringBuilder method(String s) {

		StringTokenizer st = new StringTokenizer(s, "_");

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		int count = 0;
		int size = st.countTokens();

		while (st.hasMoreTokens()) {
			String temp = st.nextToken();
			if (count == size - 1) {
				sb1.append(temp);
				sb2.append(temp);

			} else {

				sb1.append(temp + ":");
				sb2.append(temp + " ");

			}

			count++;
		}

		System.out.println(sb1);
		System.out.println(sb2);

		return sb2;

	}

	public static void main(String args[]) {

		Scanner sn = new Scanner(System.in);
		System.out.print("Enter full name: ");
		String name = sn.nextLine();
		System.out.print("Enter your DOB: ");
		String dob = sn.nextLine();
		System.out.print("Enter your Address: ");
		String address = sn.nextLine();

		System.out.println("\n****RESULTS****");
		StringBuilder cleanName = method(name);

		String[] dobArray = dob.split("/");
		System.out.printf("\nYou were born on the year %s, month of %s, and day of %s", dobArray[2], dobArray[1],
				dobArray[0]);
		System.out.println("\n\n" + cleanName + "'s address is " + address);

	}
}
