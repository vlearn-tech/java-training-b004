package org.vlearntech.java.step12maps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapsDemo {

	public static void main(String[] args) {
		List<Person> participantsList = new ArrayList<>();

		participantsList.add(new Person("Subrat", LocalDate.of(2001, 10, 24), 'M', Boolean.FALSE, "Hyderabad"));
		participantsList.add(new Person("Swagatika", LocalDate.of(2002, 11, 12), 'F'));
		participantsList.add(new Person("Supreet", LocalDate.of(2000, 4, 11), 'M', Boolean.FALSE, "Bhopal"));
		participantsList.add(new Person("Priyabrat", LocalDate.of(1999, 10, 24), 'M', Boolean.FALSE, "Bhubaneswar"));
		participantsList.add(new Person("Atish", LocalDate.of(1998, 9, 20), 'M', Boolean.FALSE, "Cuttack"));

		System.out.println(participantsList);

		// Find a specific person in this list and print his/her details

		System.out.println("Now searching for a person with name starting with letter P");

		for (Person p : participantsList) {
			if (p.name.startsWith("P")) {
				System.out.println("Found " + p.name + " at " + p.city);
			}
		}

		System.out.println("Now searching specifially for Swagatika");
		for (Person p : participantsList) {
			if (p.name.equals("Swagatika")) {
				System.out.println("Found " + p.name + " Details :  " + p);
				break;
			}
		}

		// Looping using the forEach construct
		System.out.println("\n\n ============== L O O P   U S I N G   F O R E A C H =================\n");
		participantsList.forEach(p -> System.out.println(p));

		for (Person p : participantsList) {
			System.out.println(p);
		}

		// List of 1000 items
		// 25 items out of this list

		// 25000 // WORST CASE -- Always the item you are searching for is the last item in the list
		// 25 times // BEST CASE -- Always the item you are searching for is the first item in the list

		// Key - Value
		// Swagatika - Person [Swagatika]
		// Priyabrat - Person [Priyabrat]

		System.out.println("\n\n============ M A P S ====================");

		Map<String, Person> mapOfPeople = new HashMap<>();
		mapOfPeople.put("Subrat", new Person("Subrat", LocalDate.of(2001, 10, 24), 'M', Boolean.FALSE, "Hyderabad"));
		mapOfPeople.put("Swagatika", new Person("Swagatika", LocalDate.of(2002, 11, 12), 'F'));

		if (mapOfPeople.containsKey("Subrat")) {
			System.out.println("Found Subrat " + " Details :  " + mapOfPeople.get("Subrat"));
		}

		System.out.println(mapOfPeople.get("Swagatika").dateOfBirth);

		Map<Integer, String> employeeMailIds = new HashMap<>();
		employeeMailIds.put(10001, "johndoe@example.com");
		employeeMailIds.put(10003, "johndoe2@example.com");
		employeeMailIds.put(10005, "johndoe3@example.com");
		employeeMailIds.put(10006, "johndoe4@example.com");
		employeeMailIds.put(10001, "john.doe@example.com"); // This will overwrite the info from the first put statement

		System.out.println(employeeMailIds.get(10001));

		// upsert

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

		Map<Integer, List<String>> employeeMailIdMap = new HashMap<>();
		employeeMailIdMap.put(10001, new ArrayList<String>(List.of("johndoe@example.com")));
		employeeMailIdMap.put(10003, new ArrayList<String>(List.of("johndoe@example.com")));
		employeeMailIdMap.put(10005, new ArrayList<String>(List.of("johndoe@example.com")));
		employeeMailIdMap.put(10006, new ArrayList<String>(List.of("johndoe@example.com")));

		List<String> currentMailIds = employeeMailIdMap.get(10001);
		System.out.println(currentMailIds);
		currentMailIds.add("john.doe@example.com");
		employeeMailIdMap.put(10001, currentMailIds); // This will overwrite the info previously set for this employee

		System.out.println(employeeMailIdMap.get(10001));

	}

}
