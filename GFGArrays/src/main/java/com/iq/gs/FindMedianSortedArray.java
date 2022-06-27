package com.iq.gs;

import java.util.Arrays;

public class FindMedianSortedArray {
	private static double findMedian(int[] nums1, int[] nums2) {
		int[] sortedArray = new int[nums1.length + nums2.length];
		int length = sortedArray.length;
		int start = 0;
		int end = length - 1;
		sortWithJavaMethods(nums1, nums2, sortedArray, start);
		sortWithArrayLoops(nums1, nums2, sortedArray);
		if (length % 2 != 0) {
			return sortedArray[(end - start) / 2];
		} else {
			return (double) (sortedArray[length / 2] + sortedArray[(length - 1) / 2]) / 2;
		}
	}

	private static void sortWithArrayLoops(int[] nums1, int[] nums2, int[] sortedArray) {
		int i = 0;
		int j = 0;
		int k = 0;
		int m = nums1.length;
		int n = nums2.length;
		while (m > i && n > j) {
			if (nums1[i] < nums2[j]) {
				sortedArray[k] = nums1[i];
				i++;
			} else {
				sortedArray[k] = nums2[j];
				j++;
			}
			k++;
		}
		while (i < m) {
			sortedArray[k] = nums1[i];
			i++;
			k++;
		}
		while (j < n) {
			sortedArray[k] = nums2[j];
			j++;
			k++;
		}
	}

	private static void sortWithJavaMethods(int[] nums1, int[] nums2, int[] sortedArray, int start) {
		System.arraycopy(nums1, start, sortedArray, start, nums1.length);
		System.arraycopy(nums2, start, sortedArray, nums1.length, nums2.length);
		Arrays.sort(sortedArray);
	}

	public static void main(String[] args) {
		System.out.println("Median of the array is " + findMedian(new int[] { 1, 3 }, new int[] { 2 }));
		System.out.println("Median of the array is " + findMedian(new int[] { 1, 2 }, new int[] { 3, 4 }));
	}
}
