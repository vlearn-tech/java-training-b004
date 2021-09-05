package org.vlearntech.java.step10classes;

import java.time.LocalDate;
import java.util.Arrays;

public class Meeting {

	public static void main(String[] args) {

		String[] names = new String[3];
		String nameOfFirstPerson = new String("Supreet");
//		nameOfFirstPerson = "Supreet";

		String nameOfSecondPerson = new String("Sudhakar");
//		nameOfSecondPerson = "Sudhakar";

		names[0] = nameOfFirstPerson;
		names[1] = nameOfSecondPerson;
		names[2] = "Swagatika";

		System.out.println(Arrays.toString(names));

		Person[] participants = new Person[5];

		Person supreet = new Person("Supreet", LocalDate.of(2000, 4, 11), 'M', Boolean.FALSE, "Bhopal");
//		supreet.name = "Supreet";
//		supreet.dateOfBirth = LocalDate.of(2000, 4, 11);
//		supreet.city = "Bhopal";
//		supreet.gender = 'M';
//		supreet.isMarried = Boolean.FALSE;
		participants[0] = supreet;
		supreet.checkForJackpot();

		Person sudhakar = new Person("Sudhakar", LocalDate.of(2001, 10, 24), 'M', Boolean.FALSE, "Hyderabad");
//		sudhakar.name = "Sudhakar";
//		sudhakar.dateOfBirth = LocalDate.of(2001, 10, 24);
//		sudhakar.city = "Hyderabad";
//		sudhakar.gender = 'M';
//		sudhakar.isMarried = Boolean.FALSE;
		participants[1] = sudhakar;

//		Person swagatika = new Person("Swagatika", LocalDate.of(2002, 11, 12), 'F', Boolean.FALSE, "Bhubaneswar");
		participants[2] = new Person("Swagatika", LocalDate.of(2002, 11, 12), 'F');

		Person subrat = new Person();
		subrat.name = "Subrat";
		subrat.dateOfBirth = LocalDate.of(1998, 11, 12);
		subrat.checkForJackpot();
		participants[3] = subrat;

		Person priyabrat = new Person();
		priyabrat.name = "Priyabrat";
		priyabrat.dateOfBirth = LocalDate.of(2000, 9, 12);
		priyabrat.checkForJackpot();
		participants[4] = priyabrat;

		System.out.println(Arrays.toString(participants));

	}

}
