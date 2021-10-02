package org.vlearntech.java.step16polymorphism;

public class Cat extends DogOrCat {

//	String breed;

	public Cat() {
		System.out.println("A new cat is added as a Pet");
	}

	public Cat(String name, String color, String breed) {
		super(name, color, breed);
		System.out.println("Its decided! Its a cat!! - parameterized constructor");
	}

	/*
	 * public Cat(String name, String color, String breed) { this.name = name; this.color = color; this.breed = breed; }
	 */

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

//	@Override
//	public String toString() {
//		return String.format("I am a Cat. My name is %s. I am a %s %s", name, color, breed);
//	}

}
