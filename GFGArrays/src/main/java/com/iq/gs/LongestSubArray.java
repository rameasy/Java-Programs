package com.iq.gs;

import java.util.HashMap;

/*Longest Sub-Array with Sum K
int a[] = {1,2,3,4,5,6} K=7*/
public class LongestSubArray {
	// Function for finding maximum and value pair
	public static int lenOfLongSubarr(int a[], int n, int K) {
		int count = 0;
		int length = 0;

		// Iterate in the array
		for (int i = 0; i < n; i++) {
			// check if array element greater than X or not
			if (a[i] > K) {
				count += 1;
			} else {
				length = Math.max(length, count);
				count = 0;
			}
		}

		// After iteration complete
		// check for the last segment
		if (count > 0)
			length = Math.max(length, count);

		return length;
	}

	public static void main(String[] args) {
		int[] a = { 8, 25, 10, 19, 19, 18, 20, 11, 18 };
		int n = a.length;
		int k = 13;

		System.out.println(lenOfLongSubarr(a, n, k));
	}
}
