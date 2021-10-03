package org.vlearntech.java.step18abstraction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HouseOfPetsAbstraction {
	public static void main(String[] args) {

		Pet duster = new Dog("Duster", "Orange", "Golden Retriever");
		Pet spooky = new Dog("Spooky", "Brown", "Pug");
		Pet wally = new Rabbit("Wally", "White");
		Pet tammy = new Cat("Tammy", "White", "Persian");

		List<Pet> pets = new ArrayList<>();
		pets.add(duster);
		pets.add(spooky);
		pets.add(tammy);
		pets.add(wally);
		pets.add(new Dog("Spider", "Grey", "German Shepherd"));
//		pets.add(new Pet("Puppet", "Brown")); // This is not allowed because Pet is abstract
//		pets.add(new DogOrCat("Dash", "Black", "SomeBreed")); // This is not allowed because DogOrCat is abstract

		// Each pet needs to go to the vet once every quarter for a checkup
		// Months 1, 4, 7, 10 >> Dog
		// Months 2, 5, 8, 11 >> Cat
		// Months 3, 6, 9, 12 >> Rabbit

		Integer month = LocalDate.now().getMonthValue();

		for (Pet p : pets) {
			if ((p instanceof Dog && (month == 1 || month == 4 || month == 7 || month == 11))
					|| (p instanceof Cat && (month == 2 || month == 5 || month == 8 || month == 10))
					|| (p instanceof Rabbit && (month == 3 || month == 6 || month == 9 || month == 12))) {
				p.getVaccinated();
				p.eat();
				// Special method call to a sub class method. You need to first downcast and then call
				if (p instanceof Cat) {
					((Cat) p).visitNeighbour();
				}

			} else {
				System.out.println("Visit is not yet scheduled for you.." + p);
			}
		}

	}

}
