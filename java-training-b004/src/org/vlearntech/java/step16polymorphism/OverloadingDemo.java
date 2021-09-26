package org.vlearntech.java.step16polymorphism;

public class OverloadingDemo {
	public static void main(String[] args) {
		System.out.println(SumUtil.add(10));
		System.out.println(SumUtil.add(10.0, 20.4));
		System.out.println(SumUtil.add(10, 20, 30));
		System.out.println(SumUtil.add(10, 20, 30, 40));
		System.out.println(SumUtil.add(10.7, 20.4, 30.3, 40.0, 50.0));
		System.out.println(SumUtil.add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

		System.out.println(SumUtil.add("Spooky", "Spider", "30"));
	}
}
