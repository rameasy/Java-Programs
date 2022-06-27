package com.java2blog.output.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {
	private static Map<Character, List<Character>> map = new HashMap<>();
	static {
		map.put('2', Arrays.asList('a', 'b', 'c'));
		map.put('3', Arrays.asList('d', 'e', 'f'));
		map.put('4', Arrays.asList('g', 'h', 'i'));
		map.put('5', Arrays.asList('j', 'k', 'l'));
		map.put('6', Arrays.asList('m', 'n', 'o'));
		map.put('7', Arrays.asList('p', 'q', 'r', 's'));
		map.put('8', Arrays.asList('t', 'u', 'v'));
		map.put('9', Arrays.asList('w', 'x', 'y', 'z'));
	}
	List<String> list;

	public List<String> letterCombinations(String digits) {

		list = new ArrayList<>();
		if (digits.length() == 0)
			return list;

		combination(digits, 0, "");

		return list;
	}

	void combination(String digits, int i, String str) {

		if (i == digits.length()) {
			list.add(str);
			return;
		}

		for (char ch : map.get(digits.charAt(i))) {

			combination(digits, i + 1, str + ch);
		}
	}

	public static void main(String args[]) {
		List<String> result = new LetterCombinationOfPhoneNumber().letterCombinations("235");
		result.forEach(value -> System.out.print(value + " "));
	}
}
