package com.java2blog.output.codewars;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ValidateParanthesis {
	public static boolean validParentheses(String param) {
		int count = 0;
		char[] charArray = param.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '(') {
				count++;
			} else if (charArray[i] == ')') {
				count--;
			}
			if (count < 0) {
				return false;
			}
		}
		return count == 0;
	}

	private static boolean validParentheses1(String param) {
		try {
			System.out.println(param.replaceAll("[^()^{}]", ""));
			Pattern.compile(param.replaceAll("[^()]", ""));
			return true;
		} catch (PatternSyntaxException e) {
			return false;
		}
	}

	public static void main(String args[]) {
		System.out.println(validParentheses("(())((()())())"));
		System.out.println(validParentheses1("(())((({)())())"));
	}
}
