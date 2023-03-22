package com.java2blog.output.leetcode;

public class SquareRoot {
	public static int mySqrt(int x) {
		long left = 0, right = x;
		while (left < right) {
			long mid = left + (right - left + 1) / 2;
			if (mid * mid <=  x)
				left = mid;
			else
				right = mid - 1;
		}
		return (int) left;
	}
	
	public static void main(String []args) {
		System.out.println(mySqrt(4));
		System.out.println(mySqrt(8));
	}
}
