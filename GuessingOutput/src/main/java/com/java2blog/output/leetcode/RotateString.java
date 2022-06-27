package com.java2blog.output.leetcode;

public class RotateString {
	public static void main(String[] args) {
		RotateString kr = new RotateString();
		System.out.println(kr.rotateString1("abcde", "cdeab"));
	}

	public boolean rotateString1(String A, String B) {
		return A.length() == B.length() && (A + A).contains(B);
	}

	public boolean rotateString(String s, String goal) {
		System.out.println(s + " " + goal);
		if (s == null || goal == null || s.length() == 0 || goal.length() == 0) {
			return false;
		}
		if (s.equals(goal)) {
			return true;
		}
		for (int i = 0; i < s.length(); i++) {
			s = s.substring(1, s.length()) + s.substring(0, 1);
			if (s.equals(goal)) {
				return true;
			}
		}
		return false;
	}
}
