package org.vlearntech.java.step16polymorphism;

public class SumUtil {

	// variable arguments (var-args)
	public static Integer add(Integer... inputNumbers) {
		Integer sum = 0;
		for (Integer i : inputNumbers) {
			sum += i;
		}

		return sum;
	}

	public static Double add(Double... inputNumbers) {
		Double sum = 0.0;
		for (Double i : inputNumbers) {
			sum += i;
		}

		return sum;
	}

	public static String add(String... inputValues) {
		StringBuilder result = new StringBuilder("");
		for (String i : inputValues) {
			result.append(i);
		}

		return result.toString();
	}

}
