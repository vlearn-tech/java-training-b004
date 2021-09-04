package org.vlearntech.java.step08strings;

public class StringImmutability {
	public static void main(String[] args) {
		String message = "     Hello    ";
		System.out.println(message.trim().concat(" world"));

		// String are immutable, hence value of message is retained even though you executed a trim and a concat
		// function on the string itself
		System.out.println(message);

		// Overcoming the problem
		message = message.trim().concat(" new world");
		System.out.println(message);

	}
}
