package org.vlearntech.java.step99miniproject;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeReportUtil {

	public static void validateIfEmployeeExists(List<Employee> allEmployees, Long employeeToLookFor) {

		for (Employee e : allEmployees) {
			if (e.id.equals(employeeToLookFor)) {
				System.out.println("Employee Found! : " + e);
				return;
			}
		}

		System.out.println("Employee with id " + employeeToLookFor + " could not be found");
	}

	public static void findRegionWithMaxEmployeeCount(Map<Region, List<Employee>> employeeByRegion) {
		Region regionWithMaxEmployeeCount = null;
		int count = 0;

		for (Entry<Region, List<Employee>> entry : employeeByRegion.entrySet()) {
			if (entry.getValue().size() > count) {
				count = entry.getValue().size();
				regionWithMaxEmployeeCount = entry.getKey();
			}
		}

		System.out.println("Region with max employees " + regionWithMaxEmployeeCount + " (" + count + ")");
	}

	public static void findMostExperiencedEmployeeByRegion(Map<Region, List<Employee>> employeeByRegion) {
		for (Entry<Region, List<Employee>> entry : employeeByRegion.entrySet()) {
			List<Employee> employeesInRegion = entry.getValue();
			employeesInRegion.sort(Comparator.comparing((Employee e) -> e.dateOfJoining)); // use reversed() if you want
																							// least experienced
			System.out.println(entry.getKey() + " : " + employeesInRegion.get(0));
		}

	}

	public static void findYoungestEmployeeByRegion(Map<Region, List<Employee>> employeeByRegion) {
		for (Entry<Region, List<Employee>> entry : employeeByRegion.entrySet()) {
			List<Employee> employees = entry.getValue();
			employees.sort(Comparator.comparing((Employee e) -> e.age));
			System.out.println(entry.getKey() + " : " + employees.get(0));
		}
	}

	public static Map<Region, RegionalDetailReport> generateDetailedRegionalReport(
			Map<Region, List<Employee>> employeeByRegion) {
		Map<Region, RegionalDetailReport> regionalReport = new HashMap<>();
		// Loop through the input map
		// For each region (key), get the list of employees
		// Walk through all the employees of a region
		// Generate/Calculate the metrics
		// Store the calculate metrics against the region in the output map

		for (Entry<Region, List<Employee>> entry : employeeByRegion.entrySet()) {
			RegionalDetailReport report = new RegionalDetailReport(entry.getKey());
			List<Employee> employees = entry.getValue();
			for (Employee e : employees) {
				report.headCount++;
				report.numOfFemaleEmployees += e.gender.equals('F') ? 1 : 0;
				report.maxSalary = e.salary > report.maxSalary ? e.salary : report.maxSalary;
				report.totalSalary += e.salary;
				report.minExperienceInMonths = e.experienceInMonths < report.minExperienceInMonths
						? e.experienceInMonths
						: report.minExperienceInMonths;
				report.maxExperienceInMonths = e.experienceInMonths > report.maxExperienceInMonths
						? e.experienceInMonths
						: report.maxExperienceInMonths;
				report.totalAge = report.totalAge.add(e.age);
			}
			regionalReport.put(report.region, report);
		}

		return regionalReport;
	}

}
