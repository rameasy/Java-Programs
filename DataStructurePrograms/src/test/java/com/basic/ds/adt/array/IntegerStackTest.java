package com.basic.ds.adt.array;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This is test class for IntegerStack class.
 * 
 * @author rameasy@gmail.com
 *
 */
public class IntegerStackTest {
	static IntegerStack stack = new IntegerStack(5);

	/**
	 * This is a setup method which gets loaded with the class.
	 */
	@BeforeClass
	public static void initialize() {
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
	}

	/**
	 * This is a test method for push method.
	 */
	@Test
	public void pushTest() {
		IntegerStack customStack = new IntegerStack(5);
		IntegerStack defaultStack = new IntegerStack();
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
		assertEquals(Integer.valueOf(50), stack.pop());
		assertEquals(Integer.valueOf(40), stack.pop());
	}

	/**
	 * This is a test method for peek method.
	 */
	@Test
	public void peek() {
		assertEquals(Integer.valueOf(30), stack.peek());
	}

}
