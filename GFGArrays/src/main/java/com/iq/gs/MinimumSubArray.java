package com.iq.gs;

public class MinimumSubArray {
	public static int minSubArrayLen(int target, int[] nums) {
		int sum = 0;
		int left = 0;
		int count = nums.length + 1;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

			while (sum >= target) {
				count = Math.min(count, i - left + 1);
				sum -= nums[left];
				left += 1;
			}
		}
		return count == nums.length + 1 ? 0 : count;
	}

	public static void main(String[] args) {
		System.out.println(minSubArrayLen(2, new int[] { -2, 1, -1, 4, -1, 2, 1, -5, 4 }));
	}
}
