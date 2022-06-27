package com.java2blog.output.leetcode;

public class SentencePalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}

	public static boolean isPalindrome(String s) {
		if(s == null || s.trim().length() == 0) {
			return false;
		}
		s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		StringBuilder sb = new StringBuilder(s);
		if (s.equals(sb.reverse().toString())) {
			return true;
		}
		return false;
	}
}
