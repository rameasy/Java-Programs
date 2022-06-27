package com.java2blog.output.leetcode;

public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		System.out.println(s);
		char[] charArray = s.toCharArray();
		int maxCount = Integer.MIN_VALUE;
		for (int k = 0; k < charArray.length; k++) {
			boolean[] visited = new boolean[256];
			for (int j = k; j < charArray.length; j++) {
				if (visited[charArray[j]]) {
					break;
				} else {
					maxCount = Math.max(maxCount, j - k + 1);
					visited[charArray[j]] = true;
				}
			}
			visited[charArray[k]] = false;
		}
		return maxCount;
	}
}
