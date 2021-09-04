package org.vlearntech.java.step09dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class DatesBasics {
	public static void main(String[] args) {

		long startTStamp = System.currentTimeMillis();

		// What is today's date
		System.out.println(LocalDate.now());

		// What is the time right now
		System.out.println(LocalTime.now());

		// What is the date and time right now
		System.out.println(LocalDateTime.now());

		// What was the date 100 days back
		System.out.println(LocalDate.now().minusDays(100));

		// Can you find the date 2 years, 3 months and 4 days from today
		System.out.println(LocalDate.now().plusYears(2).plusMonths(3).plusDays(4));

		// How to print the date in a specific format
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy")));

		// How to get a date which is not today
		LocalDate date1 = LocalDate.parse("2021-11-21");
		System.out.println(date1.plusYears(1).plusMonths(1).plusDays(1));

		// How to get a date based on provided year, month and date of month
		LocalDate date2 = LocalDate.of(2020, 9, 13);
		System.out.println(date2.plusYears(1).plusMonths(1));

		// How to parse a string into a date
		LocalDate date3 = LocalDate.parse("04-09-2021", DateTimeFormatter.ofPattern("d-M-yyyy")); // Note the difference
																									// between d & dd
																									// and m & mm
		System.out.println(date3);

		// What is the difference between two dates
		System.out.println(ChronoUnit.WEEKS.between(date2, date1));

		Period period = Period.between(date2, date1);
		System.out.println(period);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());

		// Find a date that exactly falls between two dates
		LocalDate startDate = LocalDate.now();
		LocalDate endDate = LocalDate.now().plusDays(10);
		System.out.println(startDate);
		System.out.println(endDate);

		int daysBetween = (int) ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(daysBetween);
		System.out.println(startDate.plusDays(daysBetween / 2));

		Random random = new Random();
		System.out.println(startDate.plusDays(random.nextInt(daysBetween)));

		// Difference between two timestamp

		long endTStamp = System.currentTimeMillis();
		System.out.println("Execution time :: " + (endTStamp - startTStamp));

		// I have a date+time in India time zone. How to find the time in Australia at that instant

	}
}
