package org.vlearntech.java.step01firstprograms;

public class SomeRandomCalculation {
	public static void main(String[] args) {

		int num1 = 1234;
		int num2 = 8765;

		System.out.println(doSomeCalculation(num1, num2));

	}

	public static int doSomeCalculation(int aa, int bb) {
		int result = (aa + bb - 23 + 74) * 21;
		return result;
	}
}
