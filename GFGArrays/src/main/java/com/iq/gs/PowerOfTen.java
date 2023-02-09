package com.iq.gs;

public class PowerOfTen {
	public static boolean isPowerOfTen(int n) {
		if (n < 1) {
			return false;
		}

		while (n % 10 == 0) {
			n = n / 10;
		}
		System.out.println(n == 1);
		return n == 1;
	}

	public static boolean check() {
		boolean result = true;
		result &= isPowerOfTen(10);
		result &= isPowerOfTen(100);
		result &= isPowerOfTen(1000);
		result &= !isPowerOfTen(50);
		result &= !isPowerOfTen(0);
		return result;
	}

	public static void main(String[] args) {
		if (check())
			System.out.println("All test cases passed!");
		else
			System.out.println("At least one test case did not pass");
	}
}
