package org.vlearntech.java.step07arrays;

import java.util.Arrays;

import org.vlearntech.java.step04conditionals.RandomDataGeneratorUtility;

public class ArraysIntro {
	public static void main(String[] args) {

		// Declare variables
//		int n1 = RandomDataGeneratorUtility.getRandomNumber(10);
//		int n2 = RandomDataGeneratorUtility.getRandomNumber(10);
//		int n3 = RandomDataGeneratorUtility.getRandomNumber(10);
//		int n4 = RandomDataGeneratorUtility.getRandomNumber(10);

		int[] nums = new int[10]; // nums is a variable that will store upto 4 integer values in it

//		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// Populate data into a array
//		nums[0] = RandomDataGeneratorUtility.getRandomNumber(100);
//		nums[1] = RandomDataGeneratorUtility.getRandomNumber(100);
//		nums[2] = RandomDataGeneratorUtility.getRandomNumber(100);
//		nums[3] = RandomDataGeneratorUtility.getRandomNumber(100);

		for (int i = 0; i < nums.length; ++i) {
			nums[i] = RandomDataGeneratorUtility.getRandomNumber(100);
		}

		// Print all the numbers
//		System.out.println(String.format("Four numbers are %d, %d, %d and %d", n1, n2, n3, n4));

		System.out.println("Generated numbers are " + Arrays.toString(nums)); // [2, 0, 3, 6]

		int greatestNumber = 0;

		// Repetitive Conditionals
//		if (n1 > greatestNumber) {
//			greatestNumber = n1;
//		}
//
//		if (n2 > greatestNumber) {
//			greatestNumber = n2;
//		}
//
//		if (n3 > greatestNumber) {
//			greatestNumber = n3;
//		}
//
//		if (n4 > greatestNumber) {
//			greatestNumber = n4;
//		}

//		for (int i = 0; i < nums.length; ++i) {
//			if (nums[i] > greatestNumber) {
//				greatestNumber = nums[i];
//			}
//		}

		for (int thisNumber : nums) {
			if (thisNumber > greatestNumber) {
				greatestNumber = thisNumber;
			}
		}

		System.out.println("The greatest number is " + greatestNumber);

	}
}
