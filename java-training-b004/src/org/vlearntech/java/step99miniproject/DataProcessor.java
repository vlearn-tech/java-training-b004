package org.vlearntech.java.step99miniproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProcessor {

	public static List<Employee> processRecords(List<String> allRecords) {
		List<Employee> allEmployees = new ArrayList<>();
		allRecords.forEach(eRec -> {
			try {
				allEmployees.add(new Employee(eRec));
			} catch (Exception e) {
				System.out.println(
						"LOGGER : Invalid data : " + e.getMessage() + " : " + eRec + " Skipping this record....");
			}
		});

		return allEmployees;
	}

	public static Map<Region, List<Employee>> createRegionalMapOfEmployee(List<Employee> allEmployees) {
		Map<Region, List<Employee>> employeeByRegion = new HashMap<>();

		// Find out each region
		// For each region run a loop on the employee list and add all employees belonging to the region into the map

		// Loop through the employees
		// For each employee find the region
		// Check if entry is already present in the map for this region
		// If yes, add the employee
		// If no, add the entry for the region and then add the employee

		allEmployees.forEach(e -> {
			if (!employeeByRegion.containsKey(e.getRegion())) {
				employeeByRegion.put(e.getRegion(), new ArrayList<Employee>());
			}
			employeeByRegion.get(e.getRegion()).add(e);

		});

		return employeeByRegion;
	}

}
