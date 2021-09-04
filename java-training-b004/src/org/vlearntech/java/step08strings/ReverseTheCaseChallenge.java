package org.vlearntech.java.step08strings;

public class ReverseTheCaseChallenge {
	public static void main(String[] args) {
		String input = "sPoNtAnEoUs";
		System.out.println(reverseCase(input));
	}

	public static String reverseCase(String str) {
		StringBuilder sb = new StringBuilder("");

		for (String letter : str.split("")) {
			sb.append(letter.equals(letter.toLowerCase()) ? letter.toUpperCase() : letter.toLowerCase());
		}

		return sb.toString();
	}

}
