package org.vlearntech.java.step11collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetFunctions {
	public static void main(String[] args) {

		// I have an array of elements. I want to convert that into a list

		String[] names = { "Albert", "Bob", "Charlie", "Denise", "Ellie", "Frank", "Gunther", "Harry", "Ian", "Jack",
				"Katherine", "Laura", "Maurice" };

		// How to add Array elements into a modifiable list
		Set<String> listOfNames = new HashSet<>();
		listOfNames.addAll(Arrays.asList(names));

		// How to add a new Name into the list
		listOfNames.add("Swagatika");
		listOfNames.add("Subrat");
		listOfNames.add("Sayoni");
		listOfNames.add("Priyabrat");
		listOfNames.add("Priyabrat");
		listOfNames.add("Priyabrat");
		listOfNames.add("Priyabrat");
		System.out.println("After adding few names   >>> " + listOfNames);

//		// Retrieve the nth index from the list
//		System.out.println("5th person in the list   >>> " + listOfNames.get(4)); // not allowed for a set to search by index
//
//		// How to remove a person from the list - by index
//		listOfNames.remove(4);// not allowed
//		System.out.println("Removed 5th element      >>> " + listOfNames);
//
//		// How to remove a person from the list - by index
		listOfNames.remove("Charlie");
		System.out.println("Removed Mr. Charlie      >>> " + listOfNames);
//
//		// Check if a person is present in this list
		System.out.println("Check for Charlie        >>> " + listOfNames.contains("Charlie"));
		System.out.println("Check for Gunther        >>> " + listOfNames.contains("Gunther"));
//
//		// Update the entry at a existing index
//		System.out.println("Last person in the list  >>> " + listOfNames.get(listOfNames.size() - 1));
//
//		// Convert this list into its corresponding array
		String[] namesArray = listOfNames.toArray(new String[listOfNames.size()]);
//		String[] namesArray = listOfNames.toArray(String[]::new); // new way of doing it using method reference 
//
//		// How to sort the person list by name
//		Collections.sort(listOfNames); // not allowed
////		listOfNames.sort(Comparator.comparing(d -> d)); // lambda expressions // new way of coding
//		System.out.println("Sorted list              >>> " + listOfNames);
//
//		// Loop through the list
		System.out.print("Looping through the list >>> ");
		for (String name : listOfNames) {
			System.out.print(name + " ");
		}
		System.out.println();
//
//		// Remove a smaller list from a larger list
		List<String> namesToRemove = List.of("Harry", "Katherine", "Maurice");
		listOfNames.removeAll(namesToRemove);
		System.out.println("Removed few names          >>> " + listOfNames);
//
//		// Empty the entire list
		listOfNames.clear();
		System.out.println("Emptied the entire list  >>> " + listOfNames);
//
//		// Remove duplicate person from the list (refer to HashSet)
	}
}
