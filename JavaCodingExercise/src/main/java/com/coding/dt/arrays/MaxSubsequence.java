package com.coding.dt.arrays;

/**
 * Problem statement: Find the maximum sum of a continuous subsequence in an
 * array of integers.
 *
 */
public class MaxSubsequence {

	/**
	 * This method returns the total value of the subsequent numbers in a given
	 * array.
	 * 
	 * @param array
	 * @return
	 */
	public int getSubsequentTotal(int[] array) {
		if (array == null || array.length == 0) {
			return Integer.MIN_VALUE;
		}
		int maxTotal = array[0], currentMaxTotal = array[0];
		for (int i = 1; i < array.length; i++) {
			currentMaxTotal = (currentMaxTotal + array[i] > array[i]) ? currentMaxTotal + array[i] : array[i];
			maxTotal = (currentMaxTotal > maxTotal) ? currentMaxTotal : maxTotal;
		}
		return maxTotal;
	}
}
