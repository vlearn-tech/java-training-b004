package org.vlearntech.java.step99miniproject;

import java.math.BigDecimal;

public class RegionalDetailReport {
	Region region;
	Integer headCount = 0;
	Integer numOfFemaleEmployees = 0;
	Integer maxSalary = 0;
	Integer totalSalary = 0;
	Integer minExperienceInMonths = Integer.MAX_VALUE;
	Integer maxExperienceInMonths = 0;
	BigDecimal totalAge = BigDecimal.ZERO;

	public RegionalDetailReport(Region region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return String.format(
				"RegionalDetailReport [region=%s, headCount=%s, numOfFemaleEmployees=%s, maxSalary=%s, totalSalary=%s, minExperienceInMonths=%s, maxExperienceInMonths=%s, totalAge=%s]",
				region, headCount, numOfFemaleEmployees, maxSalary, totalSalary, minExperienceInMonths,
				maxExperienceInMonths, totalAge);
	}

}