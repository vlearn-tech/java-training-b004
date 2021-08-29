package org.vlearntech.java.step07arrays;

import java.util.Arrays;

public class ArrayUtilities {
	public static void main(String[] args) {

		String[] names = { "Laura", "Albert", "Ellie", "Charlie", "Katherine", "Denise", "Harry", "Ian", "Frank",
				"Jack", "Bob", "Maurice", "Gunther" };

		// Find an element in the array >> "Frank"

		for (String name : names) {
			if (name.equals("Frank")) {
				System.out.println("Found Frank!!!");
				break;
			}
		}

		// Sort the array
		System.out.println("Unsorted Array : " + Arrays.toString(names));
		Arrays.sort(names);
		System.out.println("Sorted Array : " + Arrays.toString(names));

		// Find Ian in the sorted Array

		if (Arrays.binarySearch(names, "Charlie") >= 0) {
			System.out.println("Found Clarlie");
		}

		// Update an element in the array
		names[5] = "Prakash";
		System.out.println(Arrays.toString(names));

		// Delete an element from the array >> Not possible in arrays (shortcoming)

		// Add a new element into the array >> Not possible in arrays (shortcoming)

	}
}
