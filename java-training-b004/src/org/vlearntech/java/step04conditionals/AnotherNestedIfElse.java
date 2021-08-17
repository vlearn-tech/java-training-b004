package org.vlearntech.java.step04conditionals;

public class AnotherNestedIfElse {

//	Find out the discount applicable for a person

	public static void main(String[] args) {
		// Get a random Name
		String name = RandomDataGeneratorUtility.getARandomName();

		// Get a random age
		int age = RandomDataGeneratorUtility.getRandomNumber(50);

		// Find out if the person is eligible for voting
		Double discount = determineDiscount(age);

		// Print the result of eligibility
		System.out.println(
				String.format("%s is %d years old. He/She is eligible for a %f%% discount", name, age, discount));

	}

	private static Double determineDiscount(int age) {

		Double discount = 0.0;

		// if a person < 18 years then student discount of 5.5%
		// if a person > 60 years then senior citizenship discount of 6.5%
		// if a person > 80 years then additional discount of 2% on top of SCD
		// all other groups - if (age % 7 == 0 ) then give a lucky win 2.9% discount

		if (age < 18) {
			discount = 5.5;
		} else {
			if (age > 60) {
				discount = 6.5;
				if (age > 80) {
					discount = discount + 2.0; // additional discount applicable for octagenerians
				}
			} else {
				if (age % 7 == 0) {
					discount = 2.9;
				}
			}
		}

		return discount;
	}

}
