package org.vlearntech.java.step19interfaces;

public interface Adorable {
	void holdThePet();

	default void cuddle() {
		System.out.println("It feels like a pillow");
	};
}
