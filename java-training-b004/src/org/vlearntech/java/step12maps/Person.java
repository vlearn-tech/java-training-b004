package org.vlearntech.java.step12maps;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person implements Comparable<Person> {
	String name;
	LocalDate dateOfBirth;
	Character gender;
	Boolean isMarried;
	String city;
	Integer age;

	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%d, gender=%s, isMarried=%s, city=%s]", this.name, this.age,
				this.gender, this.isMarried, this.city);
	}

	// All Arguments Constructor
	public Person(String name, LocalDate dateOfBirth, Character gender, Boolean isMarried, String city) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.isMarried = isMarried;
		this.city = city;
		this.age = calculateAge();
	}

	// Parameterized Constructor
	public Person(String name, LocalDate dateOfBirth, Character gender) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.age = calculateAge();
	}

	// Default Constructor
	// No Argument Constructor
	public Person() {
	}

	public void checkForJackpot() {
		if (this.age.equals(20) && this.name.startsWith("P")) {
			System.out.println("You are a lucky person " + this.name + "! You just hit the jackpot for 10 Rupees");
		} else {
			System.out.println("Sorry! Better Luck next time, " + this.name);
		}

//		System.out.println(this.calculateAge().equals(20) && this.name.startsWith("P")
//				? "You are a lucky person " + this.name + "! You just hit the jackpot for 10 Rupees"
//				: "Sorry! Better Luck next time, " + this.name);
	}

	private Integer calculateAge() {
		return this.dateOfBirth == null ? null : (int) ChronoUnit.YEARS.between(this.dateOfBirth, LocalDate.now());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person obj) {
		return this.name.compareTo(obj.name);
	}

}
