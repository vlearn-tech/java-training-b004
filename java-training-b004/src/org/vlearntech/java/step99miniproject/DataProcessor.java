package org.vlearntech.java.step99miniproject;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {

	public static void processRecords(List<String> allRecords) {
		List<Employee> allEmployees = new ArrayList<>();
		allRecords.forEach(eRec -> {
			try {
				allEmployees.add(new Employee(eRec));
			} catch (NumberFormatException e) {
				System.out.println("LOGGER : Invalid data for employee record : " + eRec + " Skipping this record....");
			}
		});

		System.out.println(allEmployees);

	}

}
