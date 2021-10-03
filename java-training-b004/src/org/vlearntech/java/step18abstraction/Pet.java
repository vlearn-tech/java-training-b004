package org.vlearntech.java.step18abstraction;

public abstract class Pet {
	private String name;
	private String color;

	public Pet() {
		System.out.println("\nA new pet is getting added");
	}

	public Pet(String name, String color) {
		System.out.println("\nA new pet is getting created through parameterized constructor");
		this.name = name;
		this.color = color;
	}

	public void getVaccinated() {
		System.out.println("I am a Pet. My name is " + this.name + ". Ouch! That hurts");
	}

	public abstract void eat();

	public abstract void run();

	public abstract void makeSound();

	@Override
	public String toString() {
		return String.format("I am a Pet. My name is %s. I am a %s in color", name, color);
	}

	public Pet getClone() throws CloneNotSupportedException {
		Pet clonedPet = (Pet) this.clone();
		return clonedPet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
