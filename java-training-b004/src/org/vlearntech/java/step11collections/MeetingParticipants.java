package org.vlearntech.java.step11collections;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class MeetingParticipants {

	public static void main(String[] args) {

		Set<Person> participantsList = new HashSet();

		Person person1 = new Person("Subrat", LocalDate.of(2001, 10, 24), 'M', Boolean.FALSE, "Hyderabad");
		Person person2 = new Person("Subrat", LocalDate.of(2001, 10, 24), 'M', Boolean.FALSE, "Hyderabad");

		System.out.println(person1.equals(person2));

		participantsList.add(new Person("Subrat", LocalDate.of(2001, 10, 24), 'M', Boolean.FALSE, "Hyderabad"));
		participantsList.add(new Person("Subrat", LocalDate.of(2001, 10, 24), 'M', Boolean.FALSE, "Hyderabad"));
		participantsList.add(new Person("Swagatika", LocalDate.of(2002, 11, 12), 'F'));
		participantsList.add(new Person("Supreet", LocalDate.of(2000, 4, 11), 'M', Boolean.FALSE, "Bhopal"));
		participantsList.add(new Person("Priyabrat", LocalDate.of(1999, 10, 24), 'M', Boolean.FALSE, "Bhubaneswar"));

		System.out.println(participantsList);
		System.out.println(participantsList.size());

		// How to add a new Person into the list
		participantsList.add(new Person("Supreeti", LocalDate.of(2002, 4, 11), 'F', Boolean.FALSE, "Bangalore"));

		// How to remove a person from the list
		participantsList.remove(person1);
		participantsList.remove(0);

		// How to sort the person list by name // Collections.sort along with a comparator

		// Retrieve the nth index from the list // get
//		participantsList.get(0);

		// Check if a person is present in this list // contains

		// Remove duplicate person from the list // set

		// Update the entry at a existing index // remove and then add

		// Empty the entire list // clear

		// I have an array of elements. I want to convert that into a list // Arrays.asList

		// Convert this list into its corresponding array // .toArray

		// Loop through the list // enhaced for

	}

}
