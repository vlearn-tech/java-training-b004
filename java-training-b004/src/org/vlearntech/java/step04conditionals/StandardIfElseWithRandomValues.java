package org.vlearntech.java.step04conditionals;

public class StandardIfElseWithRandomValues {

//	Find out if a person is eligible to vote
//	Accept name and age of a person
//	If age > 18, then person is eligible, else no

	public static void main(String[] args) {
		// Get a random Name
		String name = RandomDataGeneratorUtility.getARandomName();

		// Get a random age
		int age = RandomDataGeneratorUtility.getRandomNumber(50);

		// Find out if the person is eligible for voting
		boolean isEligible = evaluateEligibility(age);

		// Print the result of eligibility
		System.out.println(String.format("%s is %d years old. He is eligible to vote : %b.", name, age, isEligible));

	}

	private static boolean evaluateEligibility(int age) {
//		If age >= 18, then person is eligible, else no

		if (age >= 18) {
			return true;
		} else {
			return false;
		}

//		return age >= 18 ? true : false;

	}

}
