package com.java2blog.output.codesignal;

/**
 * Let's define digit degree of some positive integer as the number of times we
 * need to replace this number with the sum of its digits until we get to a one
 * digit number.
 * 
 * Given an integer, find its digit degree.
 * 
 * Example
 * 
 * For n = 5, the output should be solution(n) = 0; For n = 100, the output
 * should be solution(n) = 1. 1 + 0 + 0 = 1. For n = 91, the output should be
 * solution(n) = 2. 9 + 1 = 10 -> 1 + 0 = 1.
 */
public class DigitDegree {
	static int solution(int n) {
		int count = 0;
		while (n / 10 > 0) {
			n = sumA(n);
			count++;
		}
		return count;
	}

	public static int sumA(int n) {
		int sum = 0;
		while (n != 0) {
			int mod = n % 10;
			sum += mod;
			n /= 10;
		}
		return sum;
	}

	public static void main(String args[]) {
		System.out.println(solution(5));
		System.out.println(solution(100));
	}
}
