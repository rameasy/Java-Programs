package com.java2blog.output.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,2,1] Output: 1 Example 2:
 * 
 * Input: nums = [4,1,2,1,2] Output: 4 Example 3:
 * 
 * Input: nums = [1] Output: 1
 */
public class SingleNumber {
	public static int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		for(Entry entry: map.entrySet()) {
			if(map.get(entry.getKey()) == 1) {
				return (int)entry.getKey();
			}
		}
		return 0;
	}

	public static void main(String args[]) {
		int[] nums1 = { 6, 1, 2, 2, 1 };
		System.out.println(singleNumber(nums1));
		int[] nums2 = { 2, 2, 1 };
		System.out.println(singleNumber(nums2));
	}
}
