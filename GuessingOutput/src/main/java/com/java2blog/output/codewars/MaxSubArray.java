package com.java2blog.output.codewars;

public class MaxSubArray {
	public static int sequence(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int maxValue = Integer.MIN_VALUE;
		int currentMaxValue = 0;
		for (int i = 0; i < arr.length; i++) {
			currentMaxValue += arr[i];
			if (maxValue < currentMaxValue) {
				maxValue = currentMaxValue;
			}
			if (currentMaxValue < 0) {
				currentMaxValue = 0;
			}
		}
		if (maxValue < 0) {
			return 0;
		}
		return maxValue;
	}
}
