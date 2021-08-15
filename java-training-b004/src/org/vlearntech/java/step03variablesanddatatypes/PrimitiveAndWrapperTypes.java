package org.vlearntech.java.step03variablesanddatatypes;

import java.math.BigDecimal;

public class PrimitiveAndWrapperTypes {
	public static void main(String[] args) {

		int number = 1000;
//		int i = "1000"; // not allowed and no way of coverting directly.

		Integer newNumber = 1000;
		int i = Integer.valueOf("2000");

		// What is the max value for an int data types
		System.out.println(Integer.MAX_VALUE);

		// What is the size of an int data type
		System.out.println(Integer.SIZE);

//		"The max value of a byte data type is XXXXX and it occupies YYY bits in memory";

		System.out.println(String.format(
				"The max value of a byte data type is %d, min value is %d, and it occupies %d bits in memory",
				Byte.MAX_VALUE, Byte.MIN_VALUE, Byte.SIZE));

		System.out.println("Number : " + (number + 100));
		System.out.println("New Number : " + (newNumber + 100));
		System.out.println("i from String : " + (i + 100));

		boolean isTrue1 = Boolean.valueOf("false");
		Boolean isTrue2 = Boolean.valueOf("TrUe");
		boolean isTrue3 = Boolean.valueOf("FALSE");

		System.out.println(isTrue1 + " " + isTrue2 + " " + isTrue3);

		BigDecimal val = BigDecimal.valueOf(Double.valueOf("70.6")); // .setScale(2, RoundingMode.HALF_EVEN);
		System.out.println(val.divide(BigDecimal.valueOf(2)));

		Integer iNew = 100;
		Integer iNewer = new Integer(100);

	}
}
