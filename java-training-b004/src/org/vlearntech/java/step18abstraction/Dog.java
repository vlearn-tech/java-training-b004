package org.vlearntech.java.step18abstraction;

public class Dog extends DogOrCat {
//	String breed;

	public Dog() {
		System.out.println("A new dog is added as a Pet");
	}

	public Dog(String name, String color, String breed) {
		super(name, color, breed);
		System.out.println("Its decided! Its a dog!! - parameterized constructor");
	}

	@Override
	public void eat() {
		System.out.println("I am a Dog. I like to chew a bone!");
	}

	@Override
	public void run() {
		System.out.println("I am a Dog. I challenge you to outrun me..");
	}

	@Override
	public void makeSound() {
		bark();
	}

	public void bark() {
		System.out.println("I am a Dog. I bark to get attention");
	}

	public void guardAtNight() {
		System.out.println("I am a Dog. Don't come to my house at night, else I will wake everyone up");
	}

	public void wagTail() {
		System.out.println("I am a Dog. I want to play with you");
	}

//	@Override
//	public String toString() {
//		return String.format("I am a Dog. My name is %s. I am a %s %s", name, color, breed);
//	}

}
