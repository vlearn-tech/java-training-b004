package org.vlearntech.java.step17encapsulation.other;

import org.vlearntech.java.step17encapsulation.Pet;

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

	@Override
	public Rabbit getClone() throws CloneNotSupportedException {
		Rabbit clonedPet = (Rabbit) this.clone();
		return clonedPet;
	}

	@Override
	public String toString() {
		return String.format("I am a Rabbit. My name is %s. I am %s in color.", this.name, this.color);
	}

}
