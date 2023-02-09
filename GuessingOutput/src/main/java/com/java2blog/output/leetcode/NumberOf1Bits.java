package com.java2blog.output.leetcode;

/**
 * Write a function that takes an unsigned integer and returns the number of '1'
 * bits it has (also known as the Hamming weight).
 * 
 * Note:
 * 
 * Note that in some languages, such as Java, there is no unsigned integer type.
 * In this case, the input will be given as a signed integer type. It should not
 * affect your implementation, as the integer's internal binary representation
 * is the same, whether it is signed or unsigned. In Java, the compiler
 * represents the signed integers using 2's complement notation. Therefore, in
 * Example 3, the input represents the signed integer. -3.
 * 
 * 
 * Example 1:
 * 
 * Input: n = 00000000000000000000000000001011 Output: 3 Explanation: The input
 * binary string 00000000000000000000000000001011 has a total of three '1' bits.
 * Example 2:
 * 
 * Input: n = 00000000000000000000000010000000 Output: 1 Explanation: The input
 * binary string 00000000000000000000000010000000 has a total of one '1' bit.
 * Example 3:
 * 
 * Input: n = 11111111111111111111111111111101 Output: 31 Explanation: The input
 * binary string 11111111111111111111111111111101 has a total of thirty one '1'
 * bits.
 * 
 * 
 * Constraints:
 * 
 * The input must be a binary string of length 32.
 */
public class NumberOf1Bits {
	public static int hammingWeight1(int n) {
		String binary = Integer.toBinaryString(n);
		int count = 0;
		for (int i = 0; i < binary.toCharArray().length; i++) {
			if (binary.toCharArray()[i] == '1') {
				count++;
			}
		}
		return count;
	}

	public static int hammingWeight2(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);
			count++;
		}
		return count;
	}

	public static int hammingWeight3(int n) {
		int count = 0;
		while (n != 0) {
			count += n & 1;
			n = n >>> 1;
		}
		return count;
	}

	public static void main(String args[]) {
		System.out.println(hammingWeight1(5));
		System.out.println(hammingWeight2(5));
		System.out.println(hammingWeight3(5));
	}
}
