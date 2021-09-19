package org.vlearntech.java.step99miniproject;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
	Long id;
	String firstName;
	String lastName;
	Character gender;
	BigDecimal age;
	LocalDate dateOfJoining;
	Integer salary;
	String phoneNumber;
	Region region;

	Employee() {

	}

	Employee(String eRec) {
		String[] tokens = eRec.split(",");
		this.id = Long.valueOf(tokens[0]);
		this.firstName = tokens[1];
		this.lastName = tokens[2];
		this.gender = tokens[3].charAt(0);
		this.age = new BigDecimal(tokens[4]);
		// if data has come in format XX/XX/XXXX then M/d/yyyy
		// else if data has come in format XX-XX-XXXX then d-M-yyyy
		String dateInput = tokens[5];
		String pattern = "M/d/yyyy";
		if (dateInput.matches("[0-3][0-9]-[0-1][0-9]-[1-2][0-9]{3}")) {
			pattern = "d-M-yyyy";
		}
		this.dateOfJoining = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern(pattern));
		this.salary = Integer.valueOf(tokens[6]);
		this.phoneNumber = tokens[7];
		this.region = Region.valueOf(tokens[8].toUpperCase());
	}

	@Override
	public String toString() {
		return String.format(
				"Employee [id=%s, firstName=%s, lastName=%s, gender=%s, age=%s, dateOfJoining=%s, salary=%s, phoneNumber=%s, region=%s]",
				id, firstName, lastName, gender, age, dateOfJoining, salary, phoneNumber, region);
	}

}
