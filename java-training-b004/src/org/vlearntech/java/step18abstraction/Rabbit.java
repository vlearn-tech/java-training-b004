package org.vlearntech.java.step18abstraction;

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
	public void eat() {
		System.out.println("I am a Rabbit. My name is " + this.getName()
				+ ". I like to nibble at my food, and I love to eat nuts..");
	}

	@Override
	public void run() {
		System.out.println("I am a Rabbit. My name is " + this.getName()
				+ ". I can beat anyone in a race... except that tortoise..");
	}

}
