package org.vlearntech.java.step01firstprograms;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int c = doSomeCalculation(a, b);
		System.out.println("result = " + c);

		System.out.println(doSomeCalculation(100, 200));
		System.out.println(doSomeCalculation(a, 222));
		System.out.println(doSomeCalculation(111, b));

	}

	private static int doSomeCalculation(int a, int b) {
		int result = (a + b - 23 + 74) * 21;
		return result;
	}

}
