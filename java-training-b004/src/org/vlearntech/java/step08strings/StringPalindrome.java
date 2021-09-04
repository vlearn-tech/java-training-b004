package org.vlearntech.java.step08strings;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a message of your choice : ");
		String message = scanner.nextLine();
		scanner.close();

		System.out.println("Your message             >> " + message);

		message = message.replaceAll(" ", "");
		System.out.println("Your updated message     >> " + message);
		String reversedMessage = new StringBuilder(message).reverse().toString();
		System.out.println("Reversed message         >> " + reversedMessage);

		System.out.println("Is palendrome            >> " + message.equalsIgnoreCase(reversedMessage));

	}
}
