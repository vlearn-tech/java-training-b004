package org.vlearntech.java.step11collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String[] names = { "Albert", "Bob", "Charlie", "Denise", "Ellie", "Frank", "Gunther", "Harry", "Ian", "Jack",
				"Katherine", "Laura", "Maurice" };

		List<String> listOfNames = new ArrayList<>();
		listOfNames.addAll(Arrays.asList(names));

		listOfNames.add("Swagatika");
		listOfNames.add("Subrat");
		listOfNames.add("Sayoni");
		listOfNames.add("Priyabrat");
		listOfNames.add("Charlie"); // duplicates will get added
		listOfNames.add("Priyabrat"); // duplicates will get added
		listOfNames.add("Denise"); // duplicates will get added

		Collections.sort(listOfNames);
		System.out.println("After adding few names   >>> " + listOfNames);

		Set<String> uniqueNames = new HashSet<>(listOfNames);
		System.out.println("Unique Values            >>> " + uniqueNames);

	}
}
