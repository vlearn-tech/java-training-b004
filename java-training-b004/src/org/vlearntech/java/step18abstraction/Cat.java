package org.vlearntech.java.step18abstraction;

public class Cat extends DogOrCat {

//	String breed;

	public Cat() {
		System.out.println("A new cat is added as a Pet");
	}

	public Cat(String name, String color, String breed) {
		super(name, color, breed);
		System.out.println("Its decided! Its a cat!! - parameterized constructor");
	}

	@Override
	public void eat() {
		System.out.println("I am a Cat. I like to slurp milk and eat fish!");
	}

	@Override
	public void makeSound() {
		mew();
	}

	public void mew() {
		System.out.println("I am a Cat. I mew for everything");
	}

	public void visitNeighbour() {
		System.out.println("I am a Cat. You cannot blame me, sometimes I smell better food there!!");
	}

	public void wagTail() {
		System.out.println("I am a Cat. I am hungry");
	}

	@Override
	public void run() {
		System.out.println(
				"I am a Cat. I can run very fast, but most of the time it happens when I get scared for life. Else I like to stay at same place.");
	}

}
