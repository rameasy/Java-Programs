package com.java2blog.output.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	List<List<Integer>> res;
	boolean[] flag;

	public List<List<Integer>> permute(int[] nums) {
		res = new ArrayList<>();
		flag = new boolean[nums.length];
		dp(nums, new ArrayList<>());
		return res;
	}

	public void dp(int[] nums, List<Integer> curr) {
		if (curr.size() == nums.length) {
			res.add(new ArrayList<>(curr));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!flag[i]) {
				flag[i] = true;
				curr.add(nums[i]);
				dp(nums, curr);
				curr.remove(Integer.valueOf(nums[i]));
				flag[i] = false;
			}
		}
	}

	public static void main(String args[]) {
		int[] arr = { 1, 2, 3 };
		List<List<Integer>> results = new Permutations().permute(arr);
		results.forEach(result -> {
			result.forEach(value -> {
				System.out.print(value + " ");
			});
			System.out.println();
		});
//		int number = 10;
//		String value = String.valueOf(number);
//		char[] finalValue = new char[value.length()];
//		char[] charValue = value.toCharArray();
//		for (int i = charValue.length - 1, j = 0; i >= 0; i--, j++) {
//			finalValue[j] = charValue[i];
//		}
//		int result = Integer.parseInt(String.valueOf(finalValue));
//		if(result == number) {
//			return true;
//		}
	}
}
