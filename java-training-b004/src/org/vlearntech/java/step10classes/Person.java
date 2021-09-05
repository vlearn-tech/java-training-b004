package org.vlearntech.java.step10classes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
	String name;
	LocalDate dateOfBirth;
	Character gender;
	Boolean isMarried;
//	String addressLine1;
//	String addressLine2;
	String city;
//	Integer zipcode;
	Integer age;

	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%d, gender=%s, isMarried=%s, city=%s]", name, calculateAge(), gender,
				isMarried, city);
	}

	// All Arguments Constructor
	public Person(String name, LocalDate dateOfBirth, Character gender, Boolean isMarried, String city) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.isMarried = isMarried;
		this.city = city;
	}

	// Parameterized Constructor
	public Person(String name, LocalDate dateOfBirth, Character gender) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	// Default Constructor
	// No Argument Constructor
	public Person() {
	}

	public void checkForJackpot() {
		if (this.calculateAge().equals(20) && this.name.startsWith("P")) {
			System.out.println("You are a lucky person " + this.name + "! You just hit the jackpot for 10 Rupees");
		} else {
			System.out.println("Sorry! Better Luck next time, " + this.name);
		}

//		System.out.println(this.calculateAge().equals(20) && this.name.startsWith("P")
//				? "You are a lucky person " + this.name + "! You just hit the jackpot for 10 Rupees"
//				: "Sorry! Better Luck next time, " + this.name);
	}

	private Integer calculateAge() {
		return (int) ChronoUnit.YEARS.between(this.dateOfBirth, LocalDate.now());
	}
}
