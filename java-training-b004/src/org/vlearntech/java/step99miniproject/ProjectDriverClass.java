package org.vlearntech.java.step99miniproject;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ProjectDriverClass {
	public static void main(String[] args) {

		try {
			List<Employee> allEmployees = DataProcessor.processRecords(
					FileUtils.getAllLines("C:\\Users\\HP\\Desktop\\JavaFiles\\MiniProject\\NewInputFile.csv"));
			Map<Region, List<Employee>> employeeByRegion = DataProcessor.createRegionalMapOfEmployee(allEmployees);

			System.out.println("\n\n================= VALIDATE IF EMPLOYEE EXISTS ===================\n");
			EmployeeReportUtil.validateIfEmployeeExists(allEmployees, (long) 6775091);

			System.out.println("\n\n================= FIND REGION WITH MAX HEAD COUNT ===================\n");
			EmployeeReportUtil.findRegionWithMaxEmployeeCount(employeeByRegion);

			System.out.println("\n\n================= FIND MOST EXPERIENCED EMPLOYEE BY REGION ===================\n");
			EmployeeReportUtil.findMostExperiencedEmployeeByRegion(employeeByRegion);

			System.out.println("\n\n================= FIND YOUNGEST EMPLOYEE BY REGION ===================\n");
			EmployeeReportUtil.findYoungestEmployeeByRegion(employeeByRegion);

			System.out.println("\n\n================= REGIONAL REPORT ===================\n");
			Map<Region, RegionalDetailReport> regionalReport = EmployeeReportUtil
					.generateDetailedRegionalReport(employeeByRegion);
			FileUtils.saveRegionalReport("C:\\Users\\HP\\Desktop\\JavaFiles\\MiniProject\\RegionalReportFile.txt",
					regionalReport);
			System.out.println("Regional Report generated and saved on disk");

		} catch (IOException e) {
			System.out.println("Error occurred in processing file. Check logs for exception.");
		}

	}
}
