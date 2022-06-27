package com.java2blog.output.leetcode;

public class SearchInsert {
	public int searchInsert1(int[] nums, int target) {
		int left = 0;
		int right = nums.length;
		int middle = 1000;

		if (target > nums[nums.length - 1]) {
			return nums.length;
		}

		if (target <= nums[0]) {
			return 0;
		}

		while (left < right) {
			if (middle == (left + right) / 2) {
				break;
			} else {
				middle = (left + right) / 2;
			}

			if (target >= nums[middle]) {
				left = middle;
			} else {
				right = middle;
			}

			if (nums[left] == target) {
				return left;
			}
		}
		return left + 1;
	}

	public int searchInsert2(int[] nums, int target) {
		int len = nums.length;
		if (target > nums[len - 1])
			return len;
		if (target < nums[0])
			return 0;

		int i = 0;
		for (; i < len; i++) {
			if (target == nums[i])
				return i;

			if (target < nums[i])
				break;
		}
		return i;
	}

	public static void main(String args[]) {
		System.out.println(new SearchInsert().searchInsert1(new int[] { 1, 3, 5, 6 }, 5));
		System.out.println(new SearchInsert().searchInsert1(new int[] { 1, 3, 5, 6 }, 2));
		System.out.println(new SearchInsert().searchInsert1(new int[] { 1, 3, 5, 6 }, 7));
		System.out.println(new SearchInsert().searchInsert2(new int[] { 1, 3, 5, 6 }, 5));
		System.out.println(new SearchInsert().searchInsert2(new int[] { 1, 3, 5, 6 }, 2));
		System.out.println(new SearchInsert().searchInsert2(new int[] { 1, 3, 5, 6 }, 7));
	}
}
