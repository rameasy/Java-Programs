package com.basic.ds.recursion;

public class ClimbStairs {
	public static int climStairs(int n) {
		return climStairs_recursion(n, 0);
	}

	public static int climStairs_recursion(int n, int i) {
		if (i > n) {
			return 0;
		}
		if (i == n) {
			return 1;
		}

		return climStairs_recursion(n, i + 1) + climStairs_recursion(n, i + 2);
	}

	public static void main(String[] args) {
		System.out.println("Total possible steps :: " + climStairs(2));
		System.out.println("Total possible steps :: " + climStairs(3));
		System.out.println("Total possible steps :: " + climStairs(5));
	}
}
