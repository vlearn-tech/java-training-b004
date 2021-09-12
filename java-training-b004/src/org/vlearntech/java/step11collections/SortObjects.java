package org.vlearntech.java.step11collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortObjects {
	public static void main(String[] args) {

		List<Person> participantsList = new ArrayList<>();

		participantsList.add(new Person("Subrat", LocalDate.of(2001, 10, 24), 'M', Boolean.FALSE, "Hyderabad"));
		participantsList.add(new Person("Swagatika", LocalDate.of(2002, 11, 12), 'F'));
		participantsList.add(new Person("Supreet", LocalDate.of(2000, 4, 11), 'M', Boolean.FALSE, "Bhopal"));
		participantsList.add(new Person("Priyabrat", LocalDate.of(1999, 10, 24), 'M', Boolean.FALSE, "Bhubaneswar"));

		System.out.println("Before Sorting    >>> " + participantsList);

		Collections.sort(participantsList);
		System.out.println("After Sorting     >>> " + participantsList);

		Comparator<Person> compareByAge = (Person p1, Person p2) -> p2.age.compareTo(p1.age);
		participantsList.sort(compareByAge);
		System.out.println("Sorted by Age     >>> " + participantsList);

		Comparator<Person> compareByName = (Person p1, Person p2) -> p1.name.compareTo(p2.name);
		participantsList.sort(compareByName);
		System.out.println("Sorted by Name    >>> " + participantsList);

		Comparator<Person> compareByGender = (Person p1, Person p2) -> p1.gender.compareTo(p2.gender);
		participantsList.sort(compareByGender);
		System.out.println("Sorted by Gender  >>> " + participantsList);

		// LAMBDAS
		participantsList.sort(Comparator.comparing(p -> p.age));
		participantsList.sort(Comparator.comparing((Person p) -> p.name).reversed());

		System.out.println("Sorted by Name (R)>>> " + participantsList);

		participantsList.sort(Comparator.comparing((Person p) -> p.gender).thenComparing((Person p) -> p.name));
		System.out.println("By Gender & Name  >>> " + participantsList);

//		Comparator<Person> compareByNameAndAge = (Person p1, Person p2) -> p1.name.compareTo(p2.name)
//				& p1.age.compareTo(p2.age);
//		participantsList.sort(compareByNameAndAge);

	}
}
