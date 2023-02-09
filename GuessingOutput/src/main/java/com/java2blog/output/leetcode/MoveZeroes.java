package com.java2blog.output.leetcode;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 * 
 * 
 * Example 1: Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0] Example 2: Input:
 * nums = [0] Output: [0]
 */

public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		for (int i = 0, j = 0; j < nums.length; j++) {
			if (nums[j] != 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				i++;
			}
		}
	}

	public static void main(String args[]) {
		int[] nums = { 0 };
		moveZeroes(nums);
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}
