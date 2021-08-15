package org.vlearntech.java.step04conditionals;

import java.util.Scanner;

public class StandardIfElseWithUserInput {

//	Find out if a person is eligible to vote
//	Accept name and age of a person
//	If age > 18, then person is eligible, else no

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name and age (press enter after each) : ");
		// Accept the name
		String name = scanner.nextLine();

		// Accept the age
		int age = Integer.valueOf(scanner.nextLine());
		scanner.close();

		// Find out if the person is eligible for voting
		boolean isEligible = evaluateEligibility(age);

		// Print the result of eligibility
		System.out
				.println(String.format("%s is eligible for casting a vote : This statement is %b.", name, isEligible));

	}

	private static boolean evaluateEligibility(int age) {
//		If age > 18, then person is eligible, else no

		if (age > 18) {
			return true;
		} else {
			return false;
		}
	}

}
