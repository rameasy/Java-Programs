package com.iq.gs;

public class ClimbStairs {
	public static int climStairs(int n) {
		if (n == 1) {
			return 1;
		}
		int first = 1;
		int second = 2;
		for (int i = 3; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
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
		System.out.println("Total possible steps in recursion :: " + climStairs_recursion(2, 0));
		System.out.println("Total possible steps in recursion :: " + climStairs_recursion(3, 0));
		System.out.println("Total possible steps in recursion :: " + climStairs_recursion(5, 0));
	}
}
