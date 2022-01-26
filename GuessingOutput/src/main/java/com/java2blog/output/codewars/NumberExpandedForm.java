package com.java2blog.output.codewars;

public class NumberExpandedForm {
	public static String expandedForm(int num) {
		String result = "";
		int i = 1;
		while (num > 0) {
			int modVal = ((num % 10) * i);
			String value = String.valueOf("+" + modVal);
			num = num / 10;
			i = i * 10;
			if (modVal != 0) {
				result = value + result;
			}
		}
		return result.substring(1, result.length());
	}

	public static void main(String args[]) {
		System.out.println(expandedForm(70304));
	}
}
