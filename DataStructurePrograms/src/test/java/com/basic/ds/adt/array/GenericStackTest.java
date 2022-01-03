package com.basic.ds.adt.array;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This is test class for GenericStack class.
 * 
 * @author rameasy@gmail.com
 *
 */
public class GenericStackTest {
	static GenericStack<Integer> integerStack = new GenericStack<>(5);
	static GenericStack<Double> doubleStack = new GenericStack<>();
	static GenericStack<String> stringStack = new GenericStack<>();

	/**
	 * This is a setup method which gets loaded with the class.
	 */
	@BeforeClass
	public static void initialize() {
		integerStack.push(10);
		integerStack.push(20);
		integerStack.push(30);
		integerStack.push(40);
		integerStack.push(50);
		doubleStack.push(10.0d);
		doubleStack.push(21.3d);
		doubleStack.push(30.4d);
		doubleStack.push(40.5d);
		doubleStack.push(52.9d);
		stringStack.push("one");
		stringStack.push("two");
		stringStack.push("three");
		stringStack.push("four");
		stringStack.push("five");
	}

	/**
	 * This is a test method for push method.
	 */
	@Test
	public void pushTest() {
		GenericStack<Integer> customStack = new GenericStack<>(5);
		GenericStack<Integer> defaultStack = new GenericStack<>();
		customStack.push(10);
		customStack.push(20);
		customStack.push(30);
		customStack.push(40);
		customStack.push(50);
		defaultStack.push(10);
		defaultStack.push(20);
		defaultStack.push(30);
		assertEquals(Integer.valueOf(5), customStack.size()); // custom size
		assertEquals(Integer.valueOf(8), defaultStack.size());// default size
		customStack.push(60);
		assertEquals(Integer.valueOf(10), customStack.size()); // increased capacity size
	}

	/**
	 * This is a test method for pop method.
	 */
	@Test
	public void popTest() {
		assertEquals(Integer.valueOf(50), integerStack.pop());
		assertEquals(Integer.valueOf(40), integerStack.pop());
		assertEquals(Double.valueOf(52.9d), doubleStack.pop());
		assertEquals(Double.valueOf(40.5d), doubleStack.pop());
		assertEquals("five", stringStack.pop());
		assertEquals("four", stringStack.pop());
	}

	/**
	 * This is a test method for peek method.
	 */
	@Test
	public void peek() {
		assertEquals(Integer.valueOf(30), integerStack.peek());
		assertEquals(Double.valueOf(30.4d), doubleStack.peek());
		assertEquals("three", stringStack.pop());
	}
}
