package com.java2blog.output.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two integer arrays nums1 and nums2, return an array of their
 * intersection. Each element in the result must appear as many times as it
 * shows in both arrays and you may return the result in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2,2] Example 2:
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [4,9] Explanation: [9,4]
 * is also accepted.
 */
public class ArraysIntersection {
	public static int[] intersection(int[] a, int[] b) {

		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}

		for (int i = 0; i < b.length; i++) {
			if (map.containsKey(b[i]) && map.get(b[i]) > 0) {
				result.add(b[i]);
				map.put(b[i], map.get(b[i]) - 1);
			}
		}
		return result.stream().mapToInt(i->i).toArray();
	}

	public static void main(String args[]) {
		int[] nums1 = { 1, 2, 2, 1 };

		int[] nums2 = { 2 };
		int[] result = intersection(nums1, nums2);
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}
