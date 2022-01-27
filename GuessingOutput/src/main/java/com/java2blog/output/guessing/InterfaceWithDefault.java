package com.java2blog.output.guessing;

public interface InterfaceWithDefault {
	public default void test() {
		System.out.println("Inside test");
	}
}
