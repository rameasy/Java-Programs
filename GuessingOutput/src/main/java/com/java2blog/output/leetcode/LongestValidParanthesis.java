package com.java2blog.output.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestValidParanthesis {
	public int longestValidParentheses(String s) {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(-1);
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(') {
				stack.push(i);
			} else {
				stack.pop();
				if (stack.isEmpty()) {
					stack.push(i);
				} else {
					int length = i - stack.peek();
					max = Math.max(max, length);
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(new LongestValidParanthesis().longestValidParentheses("(()"));
		System.out.println(new LongestValidParanthesis().longestValidParentheses(")()())"));
	}
}
