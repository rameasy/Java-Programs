package com.coding.dt.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This is test class for MaxSubsequnce class.
 * 
 * @author rameasy@gmail.com
 *
 */
public class MaxSubsequenceTest {
	/**
	 * This method test the getSubsequentTotal method.
	 */
	@Test
	public void getSubsequentTotalTest() {
		MaxSubsequence maxSubsequence = new MaxSubsequence();
		int[] arr = new int[] { -1, 6, -8, 1, 4 };
		int maj = maxSubsequence.getSubsequentTotal(arr);
		assertEquals(6, maj);
	}

}
