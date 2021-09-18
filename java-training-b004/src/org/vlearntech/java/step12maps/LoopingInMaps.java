package org.vlearntech.java.step12maps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LoopingInMaps {

	public static void main(String[] args) {
		List<Person> participantsList = new ArrayList<>();

		participantsList.add(new Person("Subrat", LocalDate.of(2001, 10, 24), 'M', Boolean.FALSE, "Hyderabad"));
		participantsList.add(new Person("Swagatika", LocalDate.of(2002, 11, 12), 'F'));
		participantsList.add(new Person("Supreet", LocalDate.of(2000, 4, 11), 'M', Boolean.FALSE, "Bhopal"));
		participantsList.add(new Person("Priyabrat", LocalDate.of(1999, 10, 24), 'M', Boolean.FALSE, "Bhubaneswar"));
		participantsList.add(new Person("Atish", LocalDate.of(1998, 9, 20), 'M', Boolean.FALSE, "Cuttack"));

		// Looping using the forEach construct
		System.out.println(
				"\n\n ============== L O O P   O N    A R R A Y L I S T       U S I N G       F O R E A C H =================\n");
		participantsList.forEach(p -> System.out.println(p));

		System.out.println("\nLoop and print ArrayList entries using normal for loop ====================>>>>>>");
		for (Person p : participantsList) {
			System.out.println(p);
		}

		Map<Integer, String> employeeMailIds = new HashMap<>();
		employeeMailIds.put(10001, "johndoe@example.com");
		employeeMailIds.put(10003, "johndoe2@example.com");
		employeeMailIds.put(10005, "johndoe3@example.com");
		employeeMailIds.put(10006, "johndoe4@example.com");
		employeeMailIds.put(10001, "john.doe@example.com"); // This will overwrite the info from the first put statement

		System.out.println("\n\n============ L O O P    T H R U    M A P S ==============");

		System.out.println("All the keys : " + employeeMailIds.keySet());
		System.out.println("All the values : " + employeeMailIds.values());

		for (Integer eId : employeeMailIds.keySet()) {
			System.out.println(eId);
		}

		System.out.println("\nLoop and print Map entries using normal for loop ====================>>>>>>");
		for (Entry<Integer, String> entry : employeeMailIds.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("\nLoop and print Map entries using foreach ====================>>>>>>");
		employeeMailIds.forEach((k, v) -> System.out.println(k + " : " + v));

	}

}
