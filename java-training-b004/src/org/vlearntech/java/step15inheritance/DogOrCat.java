package org.vlearntech.java.step15inheritance;

public class DogOrCat extends Pet {
	String breed;

	public DogOrCat() {
	}

	public DogOrCat(String name, String color, String breed) {
		super(name, color);
		this.breed = breed;
		System.out.println("We are deciding! Its a dog/cat!! - parameterized constructor");
	}

	@Override
	public String toString() {
		return String.format("I am a Dog/Cat. My name is %s. I am a %s %s", name, color, breed);
	}
}
