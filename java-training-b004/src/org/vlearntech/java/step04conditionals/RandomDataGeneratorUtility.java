package org.vlearntech.java.step04conditionals;

import java.util.Random;

public class RandomDataGeneratorUtility {

	public static int getRandomNumber(int maxValue) {
		Random random = new Random();
		return random.nextInt(maxValue);
	}

	public static String getARandomName() {
		String[] names = { "Albert", "Bob", "Charlie", "Denise", "Ellie", "Frank", "Gunther", "Harry", "Ian", "Jack",
				"Katherine", "Laura", "Maurice" };
		return names[getRandomNumber(names.length)];
	}

}
