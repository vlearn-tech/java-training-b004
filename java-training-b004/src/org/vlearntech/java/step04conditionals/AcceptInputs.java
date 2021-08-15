package org.vlearntech.java.step04conditionals;

import java.util.Scanner;

public class AcceptInputs {
	public static void main(String[] args) {

		System.out.println("Enter your name : ");

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		System.out.println("Enter your age : ");
		int age = Integer.valueOf(sc.nextLine());
		sc.close(); // Not mandatory, but excellent practice

		System.out.println("Name scanned is " + name);
		System.out.println("Age scanned is " + age);

		// printer --> scanner
		// System.out --> System.in

	}
}
