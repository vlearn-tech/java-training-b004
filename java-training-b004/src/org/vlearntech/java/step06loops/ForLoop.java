package org.vlearntech.java.step06loops;

public class ForLoop {

	// print numbers from 1 to 10

	public static void main(String[] args) {

		System.out.println("Start printing numbers...");

		// initialization, exit condition, increment - all in same line
		for (int numberToPrint = 1; numberToPrint <= 10; ++numberToPrint) {
			System.out.print(numberToPrint + " ");
		}

		System.out.println("\nCompleted printing numbers...");
	}
}
