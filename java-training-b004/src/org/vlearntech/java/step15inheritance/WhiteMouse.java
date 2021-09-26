package org.vlearntech.java.step15inheritance;

public class WhiteMouse extends Pet {
	public WhiteMouse(String name) {
		super(name, "White");
		System.out.println("Its decided! Its a mouse!! - parameterized constructor");
	}
}
