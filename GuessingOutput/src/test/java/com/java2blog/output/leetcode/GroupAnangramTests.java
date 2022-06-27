package com.java2blog.output.leetcode;

import java.util.Set;

import org.junit.Test;

public class GroupAnangramTests {
	@Test
	public void myAtoiTest() {
		Set<String[]> result = new GroupAnagram().getAnagramSet(new String[] { "cat", "dog", "god", "cat" });
		// assertEquals(2, result.size());
		for (String[] strings : result) {
			if (strings.length == 2) {
				System.out.println(strings[0] + " " + strings[1]);
			} else {
				System.out.println(strings[0]);
			}

		}

	}
}
