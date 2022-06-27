package com.basic.ds.recursion;

public class CountPossibleDecodings {
	public static int countDec(char[] chars, int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if (chars[0] == '0')
			return 0;
		int count = 0;
		if (chars[n - 1] > '0') {
			count = countDec(chars, n - 1);
		}
		if (chars[n - 2] == '1' || (chars[n - 2] == '2' && chars[n - 1] < '7')) {
			count += countDec(chars, n - 2);
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Total possible steps :: " + countDec(new char[] { '1', '2', '3', '4' }, 4));
	}
}
