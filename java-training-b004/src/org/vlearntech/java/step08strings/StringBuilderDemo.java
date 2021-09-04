package org.vlearntech.java.step08strings;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder message = new StringBuilder("Hello");
		message.append(" world");
		System.out.println(message);

		// System.out.println(message.reverse());
		message.insert(6, "to the new ");

		System.out.println(message);

		message.setCharAt(0, 'B');
		System.out.println(message);

	}
}
