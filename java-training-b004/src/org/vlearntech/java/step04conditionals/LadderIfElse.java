package org.vlearntech.java.step04conditionals;

public class LadderIfElse {

// Test divisibility Rules (by 2, 3, 5, 9, 11)

	public static void main(String[] args) {

		// Get a random number
		int number = RandomDataGeneratorUtility.getRandomNumber(99);
		System.out.println("Random number generated =  " + number + ". Starting divisibility checks...");

		// Find out the lowest factor of this number
		int leastSingleDigitFactor = evaluateDivisibility(number);

		// Print the result of eligibility
		if (leastSingleDigitFactor == 0) {
			System.out.println("No single digit prime factor found for " + number);
		} else {
			System.out.println(String.format("%d is the lowest factor for %d", leastSingleDigitFactor, number));
		}

	}

	private static int evaluateDivisibility(int number) {
		if (number % 2 == 0) {
			return 2;
		} else if (number % 3 == 0) {
			return 3;
		} else if (number % 5 == 0) {
			return 5;
		} else if (number % 7 == 0) {
			return 7;
		} else {
			return 0;
		}
	}

}
