package org.vlearntech.java.step07arrays;

import java.util.Arrays;

public class WorkingWithStringsAndArrays {
	public static void main(String[] args) {

		// find the longest word
		String message = "We are learning about Java Arrays today! I think it is tough, but interesting";

		// Break this sentence into words // String[]
		// Loop for each word, and find the length
		// Print the longest word

		String[] words = message.split(" |,|!"); // spilt accepts multiple delimiters separated by | >> split(" |,|!")
		System.out.println(Arrays.toString(words));

		String longestWord = null;
		int lengthOfLongestWord = 0;

		for (String word : words) {
			if (word.length() > lengthOfLongestWord) {
				longestWord = word;
				lengthOfLongestWord = word.length();
			}
		}

		System.out.println(String.format("The longest word in the sentence is '%s' and its length is %d", longestWord,
				lengthOfLongestWord));

		// JOIN ARRAYS INTO STRING >> OPPOSITE OF SPLIT

		String[] randomWords = { "It", "is", "a", "lovely", "day" };
		System.out.println(Arrays.toString(randomWords));

		String sentence = String.join(" ", randomWords);
		System.out.println(sentence + ".");

		String name = "Prakash";
		String[] characters = name.split("");
		System.out.println(Arrays.toString(characters));

	}
}
