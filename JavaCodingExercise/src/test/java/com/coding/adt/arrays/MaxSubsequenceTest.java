package com.coding.adt.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSubsequenceTest {
	@Test
	public void getSubsequentTotal() {
		MaxSubsequence maxSubsequence = new MaxSubsequence();
		int[] arr = new int[] { -1, 6, -8, 1, 4 };
		int maj = maxSubsequence.getSubsequentTotal(arr);
		assertEquals(6, maj);
	}

}
