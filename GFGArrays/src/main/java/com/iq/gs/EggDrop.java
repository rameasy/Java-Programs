package com.iq.gs;

public class EggDrop {
	public static int eggDrop(int n, int k) {
		if (k == 1 || k == 0)
			return k;
		if (n == 1)
			return k;

		int min = Integer.MAX_VALUE;
		int res;
		for (int i = 1; i <= k; i++) {
			res = Math.max(eggDrop(n - 1, i - 1), eggDrop(n, k - i));
			if (res < min) {
				min = res;
			}
		}
		return min + 1;
	}

	public static void main(String args[]) {
		int n = 2, k = 10;
		System.out.print("Minimum number of " + "trials in worst case with " + n + " eggs and " + k + " floors is "
				+ eggDrop(n, k));
	}
}
