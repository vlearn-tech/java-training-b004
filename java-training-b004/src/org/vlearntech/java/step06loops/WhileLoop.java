package org.vlearntech.java.step06loops;

public class WhileLoop {

	// print numbers from 1 to 10

	public static void main(String[] args) {

		int numberToPrint = 11; // initialization condition

		System.out.println("Start printing numbers...");

		while (numberToPrint <= 10) { // exit condition
			System.out.print(numberToPrint + " ");
			++numberToPrint; // increment operation
		}

		System.out.println("\nCompleted printing numbers...");
	}
}
