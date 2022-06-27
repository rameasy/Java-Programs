package com.java2blog.output.leetcode;

public class RemovePalindromicSubsequence {
	public int removePalindromeSub(String s) {
		return isPalindrome(s) ? 1 : 2;
	}

	private boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String args[]) {
		System.out.println(new RemovePalindromicSubsequence().removePalindromeSub("ababa"));
		System.out.println(new RemovePalindromicSubsequence().removePalindromeSub("abb"));
		System.out.println(new RemovePalindromicSubsequence().removePalindromeSub("baabb"));

	}
}


