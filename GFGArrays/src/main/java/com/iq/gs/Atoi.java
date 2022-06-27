package com.iq.gs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Atoi {
	private static int convertToInt(String number) {
		int value = 0;
		for (int i = 0; i < number.length(); i++) {
			value = value * 10 + number.charAt(i) - '0';
		}
		return value;
	}

	static int myAtoiRecursive(String str, int n) {
		if (n == 1) {
			return str.charAt(0) - '0';
		}
		return (10 * myAtoiRecursive(str, n - 1) + str.charAt(n - 1) - '0');
	}

	static boolean isPalindrome(List<String> abc) {

		int l = 0;
		int h = abc.size() - 1;
		while (l <= h) {

			char getAtl = abc.get(l).toLowerCase().toCharArray()[0];
			char getAth = abc.get(h).toLowerCase().toCharArray()[0];

			// If there is another symbol in left
			// of sentence
			if (!(getAtl >= 'a' && getAtl <= 'z'))
				l++;

			// If there is another symbol in right
			// of sentence
			else if (!(getAth >= 'a' && getAth <= 'z'))
				h--;

			// If characters are equal
			else if (getAtl == getAth) {
				l++;
				h--;
			}

			// If characters are not equal then
			// sentence is not palindrome
			else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		List<String> abc = Arrays.asList("Borrow or rob?".split(""));
		System.out.println(isPalindrome(abc));
		int expected = 105;
		String input = "" + expected;
		System.out.println(convertToInt(input));
		System.out.println(myAtoiRecursive(input, 3));
	}
}
