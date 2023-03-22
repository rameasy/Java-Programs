package com.java2blog.output.leetcode;

public class NonRepeatingCharacter {
	static final int NO_OF_CHARS = 256;
	static char[] count = new char[NO_OF_CHARS];

	/*
	 * calculate count of characters in the passed string
	 */
	static void getCharCountArray(String str) {
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
			System.out.println(str.charAt(i) + " = " + count[str.charAt(i)]);
		}
	}

	/*
	 * The method returns index of first non-repeating character in a string. If all
	 * characters are repeating then returns -1
	 */
	static int firstNonRepeating(String str) {
		getCharCountArray(str);
		int index = -1, i;

		for (i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + " " + count[str.charAt(i)]);
			if (count[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}

		return index;
	}
}
