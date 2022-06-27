package com.iq.gs;

import java.util.HashMap;

public class SubArraySum {
	public static int lenOfLongSubarr(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = nums.length;
		int ans = 0;
		int sum = 0;
		map.put(0, 1);
		for (int i = 0; i < n; i++) {
			sum += nums[i];

			int target = sum - k;
			if (map.containsKey(target)) {
				ans += map.get(target);
			}

			if (map.containsKey(sum)) {
				map.put(sum, map.get(sum) + 1);
			} else {
				map.put(sum, 1);
			}
		}

		return ans;
	}

	public static void main(String args[]) {
		int[] arr = { 10, 5, 2, 7, 1, 9 };
		int n = arr.length;
		int k = 15;
		System.out.println("Length = " + lenOfLongSubarr(arr, k));
	}
}
