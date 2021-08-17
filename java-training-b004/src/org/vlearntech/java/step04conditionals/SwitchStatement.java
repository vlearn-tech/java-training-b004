package org.vlearntech.java.step04conditionals;

public class SwitchStatement {

	public static void main(String[] args) {

		// Get a random number
		int number = RandomDataGeneratorUtility.getRandomNumber(99);
		System.out.println("Random number generated =  " + number + ". Starting divisibility checks...");

		int discount = findDiscount(number);

		System.out.println(
				String.format("The person is %d years old. He/She is eligible for a %d%% discount", number, discount));

	}

	private static int findDiscount(int number) {

		// If after dividing by 9, I get remainder of 3, then discount = 3%
		// If after dividing by 9, I get remainder of 5, then discount = 5%
		// If after dividing by 9, I get remainder of 7, then discount = 7%

		int remainder = number % 9;
		int discount = 0;

		switch (remainder) {
		case 3:
			discount = 3;
			break;
		case 5:
			discount = 5;
			break;
		case 7:
			discount = 7;
			break;
		default:
			discount = 0;
		}

		return discount;
	}

}
