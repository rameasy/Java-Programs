package com.iq.gs;

import java.util.HashMap;
import java.util.Map;

/*
Character Frequency Count
Given an input string S, output a string containing each character and its frequency in the given string S. 

Example:
Input string : "aaaabbcddee"
Output string : "a4b2c1d2e2"


Input string : "aaba"
Output string : "a3b1"

*/

public class CheckFrequencyCount {
	public static String charFreqCount(String inputStr) {
		// Change implementation of this method

		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : inputStr.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		inputStr = "";
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			inputStr += entry.getKey() + "" + entry.getValue();
		}
		System.out.println(inputStr);
		return inputStr;
	}

	static String compress(String str) {
		// your code here...
		String s = "";
		int count = 1;
		if (str == null || str.isEmpty()) {
			return "";
		}
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				s = s + str.charAt(i) + count;
				count = 1;
			}
		}

		s = s + str.charAt(str.length() - 1) + count;
		// System.out.print(s);
		return s;
	}

	public static boolean check() {
		boolean result = true;
		result &= compress("KKKKK").equals("K5");
		result &= compress("").equals("");
		result &= compress("AABBBCCCD").equals("A2B3C3D1");
		result &= compress("Abcda").equals("A1b1c1d1a1");
		result &= compress("a").equals("a1");
		result &= compress("aaBBBa").equals("a2B3a1");
		return result;
	}

	// you can change anything
	public static void main(String[] args) {
		boolean result = true;
		
		result &= charFreqCount("aaaabbcddee").equals("a4b2c1d2e2");
		result &= charFreqCount("aaaa").equals("a4");
		result &= charFreqCount("aabbb").equals("a2b3");
		result &= charFreqCount("a").equals("a1");
		if (result)
			System.out.println("All test cases passed!");
		else
			System.out.println("At least one test case did not pass");

		if (check())
			System.out.println("All test cases passed!");
		else
			System.out.println("At least one test case did not pass");
	}
}
