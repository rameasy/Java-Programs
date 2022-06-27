package com.java2blog.output.leetcode;

import org.junit.Test;

public class NonRepeatingCharacterTests {
	@Test
	public void firstNonRepeatingTest() {
		String str = "geeksforgeeks";
		int index = NonRepeatingCharacter.firstNonRepeating(str);

		System.out.println(index == -1 ? "Either all characters are repeating or string " + "is empty"
				: "First non-repeating character is " + str.charAt(index));
	}

}
