package com.basic.ds.adt;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class IntegerStackTest {
	static IntegerStack stack = new IntegerStack(5);

	@BeforeClass
	public static void initialize() {
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
	}

	@SuppressWarnings("deprecation")
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
		assertEquals(new Integer(5), customStack.size()); // custom size
		assertEquals(new Integer(8), defaultStack.size());// default size
		customStack.push(60);
		assertEquals(new Integer(10), customStack.size()); // increased capacity size
	}

	@SuppressWarnings("deprecation")
	@Test
	public void popTest() {
		assertEquals(new Integer(50), stack.pop());
		assertEquals(new Integer(40), stack.pop());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void peek() {
		assertEquals(new Integer(30), stack.peek());
	}

}
