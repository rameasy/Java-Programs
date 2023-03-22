package com.java2blog.output.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
	private static Map<String, Integer> romanMap = new LinkedHashMap<>();
	static {
		romanMap.put("M", 1000);
		romanMap.put("CM", 900);
		romanMap.put("D", 500);
		romanMap.put("CD", 400);
		romanMap.put("C", 100);
		romanMap.put("XC", 90);
		romanMap.put("L", 50);
		romanMap.put("XL", 40);
		romanMap.put("X", 10);
		romanMap.put("IX", 9);
		romanMap.put("V", 5);
		romanMap.put("IV", 4);
		romanMap.put("I", 1);
	}

	public static String convertNumberToRoman(int num) {

		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, Integer> entry : romanMap.entrySet()) {
			int intValue = entry.getValue();
			int matches = num / intValue;
			if (matches > 0) {
				for (int i = 0; i < matches; i++) {
					sb.append(entry.getKey());
				}
			}
			num = num % intValue;
		}
		return sb.toString();
	}


	public static void main(String args[]) {
		System.out.println(convertNumberToRoman(2798));
		System.out.println(convertNumberToRoman(2793));
	}
}