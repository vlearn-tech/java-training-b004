package org.vlearntech.java.step11collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.vlearntech.java.step10classes.Person;

public class ArrayAndLists {

	public static void main(String[] args) {

		System.out.println("============ A R R A Y =============");
		Person[] participantsArray = new Person[5];
		participantsArray[0] = new Person("Sudhakar", LocalDate.of(2001, 10, 24), 'M', Boolean.FALSE, "Hyderabad");
		participantsArray[1] = new Person("Swagatika", LocalDate.of(2002, 11, 12), 'F');
		System.out.println(Arrays.toString(participantsArray));
		System.out.println(participantsArray.length);

		System.out.println("============ L I S T =============");

		List<Person> participantsList = new ArrayList<>(5);
		participantsList.add(new Person("Subrat", LocalDate.of(2001, 10, 24), 'M', Boolean.FALSE, "Hyderabad"));
		participantsList.add(new Person("Subrat", LocalDate.of(2001, 10, 24), 'M', Boolean.FALSE, "Hyderabad"));
		participantsList.add(new Person("Swagatika", LocalDate.of(2002, 11, 12), 'F'));
		participantsList.add(new Person("Supreet", LocalDate.of(2000, 4, 11), 'M', Boolean.FALSE, "Bhopal"));
		participantsList.add(new Person("Priyabrat", LocalDate.of(1999, 10, 24), 'M', Boolean.FALSE, "Bhubaneswar"));

		System.out.println(participantsList);
		System.out.println(participantsList.size());
	}

}
