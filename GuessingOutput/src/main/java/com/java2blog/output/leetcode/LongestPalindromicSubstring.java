package com.java2blog.output.leetcode;

/**
 * Given a string s, return the longest palindromic
 * 
 * substring in s.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "babad" Output: "bab" Explanation: "aba" is also a valid answer.
 * Example 2:
 * 
 * Input: s = "cbbd" Output: "bb"
 * 
 */
public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		if (s == null) {
			return "";
		}
		if (s.length() == 1) {
			return s;
		}
		int maxSize = 0;
		String maxString = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String str = s.substring(i, j + 1);
				if (isPalindrome(str)) {
					if (maxString.length() < str.length()) {
						maxString = str;
					}
				}
			}
		}
		return maxString;
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
		System.out.println(new LongestPalindromicSubstring().longestPalindrome("badad"));
	}
}
