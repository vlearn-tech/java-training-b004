package org.vlearntech.java.step03variablesanddatatypes;

import java.util.Random;

public class DataTypeAssignmentAndConversion {

	public static void main(String[] args) {

		Random random = new Random();
		int someValue = random.nextInt(1000);

//		byte ageOfAPerson = 1000; // not allowed
		byte ageOfAPerson = 100; // allowed

//		ageOfAPerson = (byte) someValue; // type casting // down casting

		someValue = ageOfAPerson;

		float height = 5.10f;
		double weight = 65.4;

		byte age = 27;
		short numberOfStepsWalkedToday = 30_000; // 0 - 30_000

		int annualSalary = 20_00_000; // 20_00_000

		long populationOfWorld = 1000_00_00_000L; // 100_00_00_000

	}

}
