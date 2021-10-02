package org.vlearntech.java.step99miniproject;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Employee {
	private Long id;
	private String firstName;
	private String lastName;
	private Character gender;
	private BigDecimal age;
	private LocalDate dateOfJoining;
	private Integer salary;
	private String phoneNumber;
	private Region region;
	private Integer experienceInMonths;

	Employee() {

	}

	Employee(String eRec) {
		String[] tokens = eRec.split(",");
		this.id = Long.valueOf(tokens[0]);
		this.firstName = tokens[1];
		this.lastName = tokens[2];
		this.gender = tokens[3].charAt(0);
		this.age = new BigDecimal(tokens[4]);
		this.dateOfJoining = getDateFromText(tokens[5]);
		this.experienceInMonths = (int) ChronoUnit.MONTHS.between(dateOfJoining, LocalDate.now());
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

	private LocalDate getDateFromText(String dateInput) {
		// if data has come in format XX/XX/XXXX then M/d/yyyy
		// else if data has come in format XX-XX-XXXX then d-M-yyyy
		String pattern = "M/d/yyyy";
		if (dateInput.matches("[0-3][0-9]-[0-1][0-9]-[1-2][0-9]{3}")) {
			pattern = "d-M-yyyy";
		}
		return LocalDate.parse(dateInput, DateTimeFormatter.ofPattern(pattern));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public BigDecimal getAge() {
		return age;
	}

	public void setAge(BigDecimal age) {
		this.age = age;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Integer getExperienceInMonths() {
		return experienceInMonths;
	}

	public void setExperienceInMonths(Integer experienceInMonths) {
		this.experienceInMonths = experienceInMonths;
	}

}
