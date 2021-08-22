package org.vlearntech.java.step05operators;

public class LogicalOperators {
	public static void main(String[] args) {

		int counter = 4;
		String citizenship = "UK";
		String currentCountry = "IN";

		// Eligible to vote >>>>>>

		// age + 1 should be > 18
		// citizenship = "IN"
		// currentCountry = "IN"

		System.out.println("------------ USING NORMAL LOGICAL OPERATORS -------------");
		if (isValidCitizen(citizenship) && isValidCountry(currentCountry) && isValidAge(counter)) {
			System.out.println("Eligible to vote");
			System.out.println("... Casting the vote ...");

		} else {
			System.out.println("Not eligible to vote");
		}

		System.out.println("------------ USING BITWISE LOGICAL OPERATORS -------------");
		if (isValidCitizen(citizenship) & isValidCountry(currentCountry) & isValidAge(counter)) {
			System.out.println("Eligible to vote");
			System.out.println("... Casting the vote ...");

		} else {
			System.out.println("Not eligible to vote");
		}

//		System.out.println("You have voted for " + counter + " times now");

	}

	private static boolean isValidAge(int counter) {
		System.out.println("Validating age.....");
		return counter < 6;
	}

	private static boolean isValidCountry(String currentCountry) {
		System.out.println("Validating Country.....");
		return currentCountry.equals("IN");
	}

	private static boolean isValidCitizen(String citizenship) {
		System.out.println("Validating Citizenship.....");
		return citizenship.equals("IN");
	}

}
