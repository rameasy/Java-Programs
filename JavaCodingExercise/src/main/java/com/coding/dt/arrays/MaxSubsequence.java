package com.coding.dt.arrays;

/**
 * Find the maximum sum of a continuous subsequence in an array of integers.
 *
 */
public class MaxSubsequence {

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
