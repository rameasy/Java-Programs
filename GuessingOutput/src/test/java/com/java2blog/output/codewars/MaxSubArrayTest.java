package com.java2blog.output.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSubArrayTest {
	@Test
	public void testEmptyArray() throws Exception {
		assertEquals("Empty arrays should have a max of 0", 0, MaxSubArray.sequence(new int[] {}));
	}

	@Test
	public void testExampleArray() throws Exception {
		assertEquals("Example array should have a max of 6", 6,
				MaxSubArray.sequence(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}
}
