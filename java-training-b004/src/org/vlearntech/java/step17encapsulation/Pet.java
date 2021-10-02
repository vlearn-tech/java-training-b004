package org.vlearntech.java.step17encapsulation;

public class Pet {
	protected String name;
	protected String color;

	public Pet() {
		System.out.println("\nA new pet is getting added");
	}

	public Pet(String name, String color) {
		System.out.println("\nA new pet is getting created through parameterized constructor");
		this.name = name;
		this.color = color;
	}

	public void eat() {
		System.out.println("I am a Pet. My name is " + this.name + ". I like to eat!");
	}

	public void run() {
		System.out.println("I am a Pet. My name is " + this.name + ". I run when you run with me");
	}

	public void getVaccinated() {
		System.out.println("I am a Pet. My name is " + this.name + ". Ouch! That hurts");
	}

	public void makeSound() {
		System.out.println("I am a Pet. My name is " + this.name + ". I am making some sound..");
	}

	@Override
	public String toString() {
		return String.format("I am a Pet. My name is %s. I am a %s in color", name, color);
	}

	public Pet getClone() throws CloneNotSupportedException {
		Pet clonedPet = (Pet) this.clone();
		return clonedPet;
	}
}
