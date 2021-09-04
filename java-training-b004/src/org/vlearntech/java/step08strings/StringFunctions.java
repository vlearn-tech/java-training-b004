package org.vlearntech.java.step08strings;

public class StringFunctions {
	public static void main(String[] args) {

		String message = "Hello world";
//		char[] letters = message.toCharArray();
//		System.out.println(Arrays.toString(letters));

		System.out.println("String under question >> " + message);

		// What is the first letter of the string
		System.out.println("What is the first letter of the string >> " + message.charAt(0));

		// What is the 7th letter of the string
		System.out.println("What is the 7th letter of the string >> " + message.charAt(6));

		// Extract the first 5 letters of the string into another string
		String extractedString = message.substring(0, 5);
		System.out.println("Extract the first 5 letters of the string into another string >> " + extractedString);

		// Print the string starting from the 7th character
		System.out.println("Print the string starting from the 7th character >> " + message.substring(6));

		// Print the 3 character string starting from the 7th character
		System.out
				.println("Print the 3 character string starting from the 7th character >> " + message.substring(6, 9));

		// Check if the String contains the letter 'o'
		System.out.println("Check if the String contains the letter 'o' >> " + message.contains("o"));

		// Check if the String contains the string "wo"
		System.out.println("Check if the String contains the letter \"wo\" >> " + message.contains("wo"));

		// Replace 'o' with 'i' in the string
		System.out.println("Replace 'o' with 'i' in the string >> " + message.replaceAll("o", "i"));

		// Find the length of the string
		System.out.println("Find the length of the string >> " + message.length());

		// Whether the string starts with "Hell"
		System.out.println("Whether the string starts with \"Hell\" >> " + message.startsWith("Hell"));

		// Whether the string ends with "old" // "rld"
		System.out.println("Whether the string ends with \"old\" >> " + message.endsWith("old"));

		// Convert the String to all Capital Case
		System.out.println("Convert the String to all Capital Case >> " + message.toUpperCase());

		// Convert the String into all Small Case
		System.out.println("Convert the String into all Small Case >> " + message.toLowerCase());

		// Check if the word "wo" occurs in the string and if yes, then extact the string from that position
		int index = message.indexOf("wo");
		if (index >= 0) {
			System.out.println(message.substring(index));
		} else {
			System.out.println("Pattern was not found in the string");
		}

		// Reverse the string >> No direct function available >> Use StringBuilder
		System.out.println("Reverse the string >> " + new StringBuilder(message).reverse());

	}
}
