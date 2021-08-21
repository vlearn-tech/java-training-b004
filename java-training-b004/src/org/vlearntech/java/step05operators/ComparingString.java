package org.vlearntech.java.step05operators;

public class ComparingString {
	public static void main(String[] args) {
		String citizenship = new String("IN");
		String someValue = "IN";
		String anotherValue = new String("IN");

		System.out.println(citizenship == "IN");
		System.out.println(citizenship == someValue);
		System.out.println(citizenship == anotherValue);

		System.out.println(citizenship.equals("IN"));
		System.out.println(citizenship.equals(someValue));
		System.out.println(citizenship.equals(anotherValue));

	}
}
