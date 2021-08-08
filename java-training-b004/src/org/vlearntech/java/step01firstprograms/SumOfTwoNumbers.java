package org.vlearntech.java.step01firstprograms;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int c = SomeRandomCalculation.doSomeCalculation(a, b);
		System.out.println("result = " + c);

		System.out.println(SomeRandomCalculation.doSomeCalculation(100, 200));
		System.out.println(SomeRandomCalculation.doSomeCalculation(a, 222));
		System.out.println(SomeRandomCalculation.doSomeCalculation(111, b));

	}

}
