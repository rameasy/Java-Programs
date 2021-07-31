package com.basic.ds;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class GenericStackTest {
	static GenericStack integerStack = new GenericStack(5);
	static GenericStack doubleStack = new GenericStack();
	static GenericStack stringStack = new GenericStack();

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

	@SuppressWarnings("deprecation")
	@Test
	public void pushTest() {
		GenericStack customStack = new GenericStack(5);
		GenericStack defaultStack = new GenericStack();
		customStack.push(10);
		customStack.push(20);
		customStack.push(30);
		customStack.push(40);
		customStack.push(50);
		defaultStack.push(10);
		defaultStack.push(20);
		defaultStack.push(30);
		assertEquals(new Integer(5), customStack.size()); // custom size
		assertEquals(new Integer(8), defaultStack.size());// default size
		customStack.push(60);
		assertEquals(new Integer(10), customStack.size()); // increased capacity size
	}

	@SuppressWarnings("deprecation")
	@Test
	public void popTest() {
		assertEquals(new Integer(50), integerStack.pop());
		assertEquals(new Integer(40), integerStack.pop());
		assertEquals(new Double(52.9d), doubleStack.pop());
		assertEquals(new Double(40.5d), doubleStack.pop());
		assertEquals("five", stringStack.pop());
		assertEquals("four", stringStack.pop());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void peek() {
		assertEquals(new Integer(30), integerStack.peek());
		assertEquals(new Double(30.4d), doubleStack.peek());
		assertEquals("three", stringStack.pop());
	}

}
