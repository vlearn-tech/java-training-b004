package org.vlearntech.java.step17encapsulation.other;

import org.vlearntech.java.step17encapsulation.Pet;

public class SomeOtherRandomClass {
	Pet pet;

	public SomeOtherRandomClass(String name) {
		this.pet = new Pet();
//		this.pet.name = name; // Not allowed since attribute is protected and we are in a different package and not
		// inheriting from the superclass Pet
//		this.pet.color = "White"; //Not allowed
	}

}
