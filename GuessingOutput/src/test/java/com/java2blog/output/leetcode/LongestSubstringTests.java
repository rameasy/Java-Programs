package com.java2blog.output.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringTests {
	private LongestSubstring lss = new LongestSubstring();

	@Test
	public void lengthOfLongestSubstringTest() {
		assertEquals(4, lss.lengthOfLongestSubstring("jbpnbwwd"));
		assertEquals(3, lss.lengthOfLongestSubstring("pwwkew"));
		assertEquals(3, lss.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(2, lss.lengthOfLongestSubstring("aab"));
		assertEquals(3, lss.lengthOfLongestSubstring("dvdf"));
		

	}
}
