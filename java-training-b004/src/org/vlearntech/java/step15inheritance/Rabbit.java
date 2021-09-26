package org.vlearntech.java.step15inheritance;

public class Rabbit extends Pet {

	public Rabbit() {
		System.out.println("A new rabbit is added as a Pet");
	}

	public Rabbit(String name, String color) {
		super(name, color);
		System.out.println("Its decided! Its a rabbit!! - parameterized constructor");
	}

	@Override
	public void makeSound() {
		System.out.println("I am a Rabbit. I Cluck when I am happy..");
	}

}
