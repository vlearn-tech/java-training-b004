package org.vlearntech.java.step05operators;

import org.vlearntech.java.step04conditionals.RandomDataGeneratorUtility;

public class TernaryOperators {
	public static void main(String[] args) {
		int age = RandomDataGeneratorUtility.getRandomNumber(36);

		String message = "";
		String citizenship = "IN";

		if (age >= 18 && citizenship.equals("IN")) {
			message = "Eligible";
		} else {
			message = "Not eligible";
		}

		String newMessage = (age >= 18 && citizenship.equals("IN")) ? "Eligible" : "Not eligible";

		System.out.println(age + " :: " + message);
		System.out.println(age + " :: " + newMessage);
	}
}
