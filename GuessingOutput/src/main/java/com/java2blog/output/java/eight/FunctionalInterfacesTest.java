package com.java2blog.output.java.eight;

@FunctionalInterface
interface FuncInterface {
	void func(String msg); // abstract method
	// It can contain any number of Object class methods.

	int hashCode();

	String toString();

	boolean equals(Object obj);

	default void defaultMethod() {
		System.out.println("Functional interface can have any number of default methods and object methods, but only one abstract method.");
	}
}
@FunctionalInterface
interface FuncInterface1 {
	int func1(String msg);
}

public class FunctionalInterfacesTest implements FuncInterface {

	public static void main(String[] args) {
		FunctionalInterfacesTest fie = new FunctionalInterfacesTest();
		fie.func("Hello there");
		FuncInterface1 funcInterface1 = string -> {return Integer.parseInt(string);};
		int value = funcInterface1.func1("23");
		System.out.println(value); 
		fie.defaultMethod();
	}

	@Override
	public void func(String msg) {
		System.out.println("Printed the message here");
	}

}
