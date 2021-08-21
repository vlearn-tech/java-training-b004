package org.vlearntech.java.step05operators;

public class CalculateFactorial {
	public static void main(String[] args) {
		int i = 3;
		System.out.println(String.format("Factorial of %d is %d", i, factorial(i)));

	}

	// recursive programming
	private static int factorial(int i) {
		return i == 1 ? 1 : i * factorial(--i);

//		if (i == 1) {
//			return 1;
//		} else {
//			return i * factorial(--i);
//		}

	}

//	5! = 5 * 4!;
//	4! = 4 * 3!;
//	3! = 3 * 2!;
//	2! = 2 * 1!;
//  1! = 1;

}
