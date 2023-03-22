package com.java2blog.output.leetcode;

public class MultiplyStrings {
	public String multiply(String number1, String number2) {
		if (number1.equals("0") || number2.equals("0")) {
			return "0";
		}
		int j = 0;
		int[] ans = new int[number1.length() + number2.length()];
		for (int i = number1.length() - 1; i >= 0; i--) {//123 456
			int carry = 0;
			for (j = number2.length() - 1; j >= 0; j--) {
				int value = (carry + ans[i + j + 1] + ((number1.charAt(i) - '0') * (number2.charAt(j) - '0')));
				ans[i + j + 1] = value % 10;
				carry = value / 10;
			}
			if (carry != 0) {
				ans[i + j + 1] = carry;
			}
		}
		StringBuilder sb = new StringBuilder();
		if (ans[0] != 0) {
			sb.append(ans[0]);
		}
		for (int i = 1; i < ans.length; i++) {
			sb.append(ans[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(new MultiplyStrings().multiply("3", "6"));
		System.out.println(new MultiplyStrings().multiply("123", "456"));
		System.out.println(new MultiplyStrings().multiply("99", "99"));
	}
}
