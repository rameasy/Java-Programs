package com.java2blog.output.leetcode;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 * 
 * Note:
 * 
 * Note that in some languages, such as Java, there is no unsigned integer type.
 * In this case, both input and output will be given as a signed integer type.
 * They should not affect your implementation, as the integer's internal binary
 * representation is the same, whether it is signed or unsigned. In Java, the
 * compiler represents the signed integers using 2's complement notation.
 * Therefore, in Example 2 above, the input represents the signed integer -3 and
 * the output represents the signed integer -1073741825.
 * 
 * 
 * Example 1:
 * 
 * Input: n = 00000010100101000001111010011100 Output: 964176192
 * (00111001011110000010100101000000) Explanation: The input binary string
 * 00000010100101000001111010011100 represents the unsigned integer 43261596, so
 * return 964176192 which its binary representation is
 * 00111001011110000010100101000000. Example 2:
 * 
 * Input: n = 11111111111111111111111111111101 Output: 3221225471
 * (10111111111111111111111111111111) Explanation: The input binary string
 * 11111111111111111111111111111101 represents the unsigned integer 4294967293,
 * so return 3221225471 which its binary representation is
 * 10111111111111111111111111111111.
 */
public class ReverseBits {
	public static int reverseBits(int num) {
		num = ((num & 0xffff0000) >>> 16) | ((num & 0x0000ffff) << 16);
		System.out.println(num);
		num = ((num & 0xff00ff00) >>> 8) | ((num & 0x00ff00ff) << 8);
		System.out.println(num);
		num = ((num & 0xf0f0f0f0) >>> 4) | ((num & 0x0f0f0f0f) << 4);
		System.out.println(num);
		num = ((num & 0xcccccccc) >>> 2) | ((num & 0x33333333) << 2);
		System.out.println(num);
		num = ((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1);
		return num;
	}

	public static void main(String args[]) {
		System.out.println(reverseBits(43261596));
		System.out.println(reverseBits(-3));
	}
}
