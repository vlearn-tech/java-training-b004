package org.vlearntech.java.step15inheritance;

public class HouseOfPetsInheritance {
	public static void main(String[] args) {
		Dog duster = new Dog("Duster", "Orange", "Golden Retriever");
		Cat tammy = new Cat("Tammy", "White", "Persian");
		Rabbit wally = new Rabbit("Wally", "White");
		WhiteMouse stuart = new WhiteMouse("Stuart");

//		duster.name = "Duster";
//		duster.color = "Orange";
//		duster.breed = "Golden Retriever";

//		tammy.name = "Tammy";
//		tammy.color = "White";
//		tammy.breed = "Persian";

//		wally.name = "Wally";
//		wally.color = "White";

		System.out.println("============  Intro to my Pets ===========");
		System.out.println("\n\n" + duster);

		duster.eat();
		duster.makeSound();
		duster.wagTail();
		duster.run();
		duster.getVaccinated();
		duster.guardAtNight();

		System.out.println("\n\n" + tammy);
		tammy.eat();
		tammy.makeSound();
		tammy.wagTail();
		tammy.run();
		tammy.getVaccinated();
		tammy.visitNeighbour();

		System.out.println("\n\n" + wally);
		wally.eat();
		wally.makeSound();
		wally.run();
		wally.getVaccinated();

		System.out.println("\n\n" + stuart);
		stuart.eat();
		stuart.makeSound();
		stuart.run();
		stuart.getVaccinated();
	}
}
