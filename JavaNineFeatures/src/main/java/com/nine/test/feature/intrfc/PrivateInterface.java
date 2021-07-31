package com.nine.test.feature.intrfc;

public interface PrivateInterface {
	public static final int MY_INTEGER = 10; // Constant variable

	public void abstractMethod(); // Abstract method

	private void privateMethod() { // Private method
		System.out.println("Inside privateMethod");
	}

	default void defaultMethod() { // Default method
		System.out.println("Inside defaultMethod and calling privateMethod");
		privateMethod();
	}

	static void staticMethod() { // Static method
		System.out.println("Inside staticMethod and calling privateStaticMethod");
		privateStaticMethod();
	}

	private static void privateStaticMethod() {// Private static method
		System.out.println("Inside privateStaticMethod");
	}
}
