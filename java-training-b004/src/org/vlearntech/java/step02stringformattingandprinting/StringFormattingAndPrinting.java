package org.vlearntech.java.step02stringformattingandprinting;

public class StringFormattingAndPrinting {
	public static void main(String[] args) {

		String nameOfPerson = "Rakesh";
//		name = "Ramesh";
		double age = 35.5;
		int salary = 100000;
		boolean isMarried = true;
		char gender = 'M';

		System.out.println(nameOfPerson + " is " + age + " years old, has an overall experience of " + (age - 22)
				+ " years and earns " + salary + " pm");

		System.out.println(String.format("%s is %f years old, has an overall experience of %f years and earns %d pm",
				nameOfPerson, age, age - 22, salary));

		System.out.print(String.format("%s is %f years old, has an overall experience of %f years and earns %d pm",
				nameOfPerson, age, age - 22, salary));

		System.out.print("\n");

		System.out.printf("%s is %f years old, has an overall experience of %f years and earns %d pm\n", nameOfPerson,
				age, age - 22, salary);

		System.out.println(String.format("Is %s married : %b", nameOfPerson, isMarried));

		// %s - strings
		// %d - numbers
		// %f - decimals
		// %b - boolean (true/false)

		// Ways of printing information
		// System.out.print
		// System.out.println (prints a line at end of the statement to be printed) = System.out.print + "\n"

		// Ways of concatenating & formatting
		// .concat() method
		// concatenation using +
		// String.format

		// Print and Format together - convenience method
		// System.out.printf - same as System.out.print + String.format

	}
}
